import java.net.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 * Client connects to server and organizes the use of GUIs for login and profile operations
 * 
 * @author Jonathan Dufresne
 * @version 5/1/2021
 */
@SuppressWarnings("serial")
public class Client extends JFrame{
	String password;
	String userName;
	String host = "LocalHost";
	int port = 4242;
	User user;
	
	public static void main(String[] args) throws IOException{
		
		Client client = new Client();
	   		
		Socket socket = new Socket(client.host, client.port);
		try {
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			oos.flush();
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			
			//login page
			boolean in  = false;
			boolean signup = false;
			boolean exit = false;
			boolean end = false;
			while (!in && !end) {
				LoginGUI login = new LoginGUI();
				login.setVisible(true);
				login.pack();
				login.setLocationRelativeTo(null);
				login.setDefaultCloseOperation(EXIT_ON_CLOSE);
				
				client.userName = login.username;
				client.password = login.password;
				signup = login.reg;
				exit = login.exit;
				while ((client.userName == null || client.password == null) && !signup && !exit) {
					client.userName = login.username;
					client.password = login.password;
					System.out.println(client.userName);
					System.out.println(client.password);
					signup = login.reg;
					exit = login.exit;
				}
				if (!signup) {
					//send login to server -> server looks for existing user
					oos.writeObject("Login");
					oos.writeObject(client.userName);
					oos.writeObject(client.password);	
					oos.flush();
					Object o = ois.readObject();
					if (o instanceof User) {
						client.user = (User) o;
						in = true;
						end = true;
						System.out.println("Login Successful");
					} else if (o instanceof String) {
						System.out.println("Login Fail");
						int num1 = JOptionPane.showConfirmDialog(null, "Incorrect username password combination. Return to Login page?", "Profile", JOptionPane.OK_CANCEL_OPTION);
						if (num1 == 2 || num1 == -1) {
							end = true;
						}
					}
				} else if (signup) {
					oos.writeObject("Signup");
					//signup GUI
					RegistrationGUI register = new RegistrationGUI();
			        register.setVisible(true);
			        register.setLocationRelativeTo(null);
			        register.setDefaultCloseOperation(EXIT_ON_CLOSE);
			        
			        client.userName = register.username;
			        client.password = register.password;
			        exit = register.exit;
			        while ((client.userName == null || client.password == null) && !exit) {
			        	client.userName = register.username;
				        client.password = register.password;
				        exit = register.exit;
			        }
			        if (!exit) {
			        	client.user = new User(client.password, client.userName);
			        	client.user.setName(register.fullName);
			        	client.user.setEmail(register.email);
			        	oos.writeObject(client.user);
			        	oos.flush();
			        }
			        if (exit) {
			        	end = true;
			        	//exitGUI
			        	//TODO
			        }
					
				} else if (exit) {
					end = true;
					//exit GUI
					//TODO
				}
			}
			if (in && end) {
				oos.writeObject(client.user);
				oos.flush();
				//show profile GUI
				ProfileGUI profile = new ProfileGUI();
		        profile.setVisible(true);
		        profile.setLocationRelativeTo(null);
		        profile.setDefaultCloseOperation(EXIT_ON_CLOSE);
				//other operations
		        //TODO
			}
			if (end && !in) {
				//exitGUI
				//TODO
			}
			
			try {
				makeFriendsList(client.user, oos, ois);
			} catch (ProfileException e) {
				JOptionPane.showMessageDialog(null,  e.getMessage(), "Profile", JOptionPane.ERROR_MESSAGE);
			}
			
			oos.close();
			ois.close();
		} catch (IOException e) {
		
		} catch (ClassNotFoundException e) {
			//the object class has gone bye-bye
		}
		socket.close();
	}
	
	public static void makeFriendsList(User user, ObjectOutputStream oos, ObjectInputStream ois) throws ProfileException {
		ArrayList<String> userNames = new ArrayList<String>();
    	ArrayList<User> friends = new ArrayList<User>();
    	userNames = user.getFriendList();
		for (int i = 0; i < userNames.size(); i++) {
    		try {
    			oos.writeObject(userNames.get(i));
    			oos.flush();
    			Object o = ois.readObject();
    			if (o instanceof User) {
    				friends.add((User) o);
    			} else if (o instanceof String) {
    				throw new ProfileException("Invalid userName [" + userNames.get(i) + "] in Friend List");
    			}
    		} catch (ClassNotFoundException e) {
    			//hopefully this shouldn't happen as the object class exists
    		} catch (IOException e) {
    			//something went wrong with the server connection
    		}
    	}
        user.setFriends(friends); //update friends list
	}
	
	public static User importProfile(ObjectOutputStream oos, ObjectInputStream ois) throws ProfileException{
		User user;
		ArrayList<String> userNames = new ArrayList<String>();
    	ArrayList<User> friends = new ArrayList<User>();
    	String filename;
    	
    	filename = JOptionPane.showInputDialog(null, "What is the file name?", "Profile", JOptionPane.QUESTION_MESSAGE);
    	user = new User(filename);
    	userNames = user.getFriendList();
    	
    	//send each userName to server to verify users
    	for (int i = 0; i < userNames.size(); i++) {
    		try {
    			oos.writeObject(userNames.get(i));
    			oos.flush();
    			Object o = ois.readObject();
    			if (o instanceof User) {
    				friends.add((User) o);
    			} else if (o instanceof String) {
    				throw new ProfileException("Invalid userName [" + userNames.get(i) + "]");
    			}
    		} catch (ClassNotFoundException e) {
    			//hopefully this shouldn't happen as the object class exists
    		} catch (IOException e) {
    			//something went wrong with the server connection
    		}
    	}
        user.setFriends(friends); //update friends list
		return user;
	}
	
	public static User importProfile(String filename, ObjectOutputStream oos, ObjectInputStream ois) throws ProfileException{
		User user;
		ArrayList<String> userNames = new ArrayList<String>();
    	ArrayList<User> friends = new ArrayList<User>();
    	
    	user = new User(filename);
    	userNames = user.getFriendList();
    	
    	//send each userName to server to verify users
    	for (int i = 0; i < userNames.size(); i++) {
    		try {
    			oos.writeObject(userNames.get(i));
    			oos.flush();
    			Object o = ois.readObject();
    			if (o instanceof User) {
    				friends.add((User) o);
    			} else if (o instanceof String) {
    				throw new ProfileException("Invalid userName [" + userNames.get(i) + "]");
    			}
    		} catch (ClassNotFoundException e) {
    			//hopefully this shouldn't happen as the object class exists
    		} catch (IOException e) {
    			//something went wrong with the server connection
    		}
    	}
        user.setFriends(friends); //update friends list
		return user;
	}
	
	public static User createNewAccount() {
		User user = new User();
		int num;
		String filename;
		NewProfileGUI npg = new NewProfileGUI();
		SwingUtilities.invokeLater(npg);
		num = npg.choice;
		while (num == 0) {
			num = npg.choice;
		}
		if (num == 1) {
			//signup
			String userName;
			String password;
			//TODO
			//user = new User(userName, password);
		} else if (num == 2) {
			FileNameGUI fng = new FileNameGUI();
			SwingUtilities.invokeLater(fng);
			filename = fng.filename;
			while (filename == null) {
				filename = fng.filename;
			}
			user = new User(filename);
		}
		return user;
	}
	
	public void editProfile(ObjectOutputStream oos, ObjectInputStream ois) throws IOException, ClassNotFoundException {
		int choice = 0;
		int num = 0;
		Object o;
		String userName;
		String interest;
		String email;
		ArrayList<String> ary;
		boolean found;
		EditProfileGUI epg = new EditProfileGUI();
		SwingUtilities.invokeLater(epg);
		choice = epg.choice;
		while (choice == 0) {
			choice = epg.choice;
		}
		
		switch(choice) {
		
		case 1: //addFriend
			oos.writeObject("1");
			oos.flush();
			userName = JOptionPane.showInputDialog(null, "Username of friend to add:", "Profile Editor", JOptionPane.PLAIN_MESSAGE);
			oos.writeObject(userName);
			oos.flush();
			o = ois.readObject();
			num = Integer.parseInt((String) o);
			if (num == -1) {
				JOptionPane.showMessageDialog(null, "No match found!", "Profile Editor", JOptionPane.ERROR_MESSAGE);
			} else {
				user.addFriend(userName);
				JOptionPane.showMessageDialog(null, "Friend added!", "Profile Editor", JOptionPane.INFORMATION_MESSAGE);
			}
			
		case 2: //removeFriend
			oos.writeObject("2");
			oos.flush();
			userName = JOptionPane.showInputDialog(null, "Username of friend to remove:", "Profile Editor", JOptionPane.PLAIN_MESSAGE);
			ary = user.getFriendList();
			found = false;
			for (int i = 0; i < ary.size(); i++) {
				if (userName.equals(ary.get(i))) {
		 			num = i;
		 			found = true;
		 		}
		 	}
		 	if (found) {
		 		ary.remove(num);
		 		user.setFriendList(ary);
		 		JOptionPane.showMessageDialog(null, "Friend removed!", "Profile Editor", JOptionPane.INFORMATION_MESSAGE);
		 	} 
		 	if (!found) {
		 		JOptionPane.showMessageDialog(null, "No match found!", "Profile Editor", JOptionPane.ERROR_MESSAGE);
		 	}
		 	
		case 3: //addInterest
			oos.writeObject("3");
			oos.flush();
		 	found = false;
		 	interest = JOptionPane.showInputDialog(null, "Interest to add:", "Profile Editor", JOptionPane.PLAIN_MESSAGE);
		 	ary = user.getInterests();
		 	for (int i = 0; i < ary.size(); i++) {
		 		if (interest.equals(ary.get(i))) {
		 			found = true;
		 		}
		 	}
		 	if (!found) {
		 		ary.add(interest);
		 		user.setInterests(ary);
		 		JOptionPane.showMessageDialog(null, "Interest added!", "Profile Editor", JOptionPane.INFORMATION_MESSAGE);
		 	}
		 	if (found) {
		 		JOptionPane.showMessageDialog(null, "Duplicate Interest", "Profile Editor", JOptionPane.ERROR_MESSAGE);
		 	}
			
		case 4: //removeInterest
		 	oos.writeObject("4");
		 	oos.flush();
		 	interest = JOptionPane.showInputDialog(null, "Interest to remove:", "Profile Editor", JOptionPane.PLAIN_MESSAGE);
		 	ary = user.getInterests();
		 	found = false;
		 	for (int i = 0; i < ary.size(); i++) {
		 		if (interest.equals(ary.get(i))) {
		 			num = i;
		 			found = true;
		 		}
		 	}
		 	if (found) {
		 		ary.remove(num);
		 		user.setInterests(ary);
		 		JOptionPane.showMessageDialog(null, "Interest removed!", "Profile Editor", JOptionPane.INFORMATION_MESSAGE);
		 	} 
		 	if (!found) {
		 		JOptionPane.showMessageDialog(null, "No match found!", "Profile Editor", JOptionPane.ERROR_MESSAGE);
		 	}
		 	
		case 5: //changeName
		 	oos.writeObject("5");
		 	oos.flush();
		 	userName = JOptionPane.showInputDialog(null, "New name:", "Profile Editor", JOptionPane.PLAIN_MESSAGE);
		 	user.setName(userName);
		 	JOptionPane.showMessageDialog(null, "Name Updated!", "Profile Editor", JOptionPane.INFORMATION_MESSAGE);
	
 		case 6: //changeUserName
 			oos.writeObject("6");
 			oos.flush();
 			userName = JOptionPane.showInputDialog(null, "New Username:", "Profile Editor", JOptionPane.PLAIN_MESSAGE);
 			found = false;
 			oos.writeObject(userName);
 			oos.flush();
 			o = ois.readObject();
 			num = Integer.parseInt((String) o);
 			if (num == -1) {
 				user.setName(userName);
 				JOptionPane.showMessageDialog(null, "Username Updated!", "Profile Editor", JOptionPane.INFORMATION_MESSAGE);
 			} else {
 				JOptionPane.showMessageDialog(null, "Username Unavailable", "Profile Editor", JOptionPane.ERROR_MESSAGE);
 			}
 			
 		case 7: //changePassword
 			oos.writeObject("7");
 			oos.flush();
 			JTextField p1 = new JPasswordField();
 			JTextField p2 = new JPasswordField();
 			Object[] fields = {"Password:", p1, "Confirm Password:", p2};
 			num = JOptionPane.showConfirmDialog(null, fields, "Profile Editor", JOptionPane.OK_CANCEL_OPTION);
 			if (num == 0) {
 				String[] inputs = {p1.getText(), p2.getText()};
 				if (inputs[0].equals(inputs[1])) {
 					user.setPassword(inputs[0]);
 					JOptionPane.showMessageDialog(null, "Password Updated!", "Profile Editor", JOptionPane.INFORMATION_MESSAGE);
 				} else {
 					JOptionPane.showMessageDialog(null, "Entries do not match!", "Profile Editor", JOptionPane.ERROR_MESSAGE);
 				}
 			} else {
				JOptionPane.showMessageDialog(null, "Password update failed!", "Profile Editor", JOptionPane.ERROR_MESSAGE);
 			}
					
		case 8: //changeEmail
			oos.writeObject("8");
			oos.flush();
			email = JOptionPane.showInputDialog(null, "New email addres:", "Profile Editor", JOptionPane.PLAIN_MESSAGE);
			oos.writeObject(email);
			oos.flush();
			o = ois.readObject();
			num = Integer.parseInt((String) o);
			if (num == -1) {
				user.setEmail(email);
				JOptionPane.showMessageDialog(null, "Email Address Updated!", "Profile Editor", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Profile with that email address already exists!", "Profile Editor", JOptionPane.ERROR_MESSAGE);
			}
			
			
		case 9: //deleteProfile
			oos.writeObject("9");
			oos.flush();
			num = JOptionPane.showConfirmDialog(null,  "Delete Profile", "Profile Editor", JOptionPane.YES_NO_OPTION);
			if (num == 0) {
				user.deleteProfile();
			}
			
		case 10: //newProfile
			oos.writeObject("10");
			oos.flush();
			user = createNewAccount();
			oos.writeObject(user);
			o = ois.readObject();
			String m = (String) o;
			if (m.equals("Profile created successfully!")) {
				JOptionPane.showMessageDialog(null, m, "Profile Editor", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, m, "Profile Editor", JOptionPane.ERROR_MESSAGE);
			}
		}
		oos.writeObject(user);
		oos.flush();
	}
}
