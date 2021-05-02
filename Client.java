import java.net.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 * Client connects to server and organizes the use of GUIs for login and profile operations
 * 
 * @author Jonathan Dufresne
 * @version 5/1/2021
 */
@SuppressWarnings("serial")
public class Client extends JFrame{

	public static void main(String[] args) throws IOException{
		String host = "LocalHost";
		int port = 4242;
		User user;
	    String password;
	    String userName;
		
		Socket socket = new Socket(host, port);
		try {
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			oos.flush();
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			
			//login page
			boolean in  = false;
			boolean end = false;
			while (!in && !end) {
				Login login = new Login();
				login.setVisible(true);
				login.pack();
				login.setLocationRelativeTo(null);
				login.setDefaultCloseOperation(EXIT_ON_CLOSE);
			
				password = login.getPassword();
				userName = login.getUsername();
			
				if (userName.equals(null)) {
					Registration reg = new Registration();
					reg.setVisible(true);
					reg.pack();
					reg.setLocationRelativeTo(null);
					reg.setDefaultCloseOperation(EXIT_ON_CLOSE);
				
					password = reg.getPassword();
					userName = reg.getUsername();
				
					user = new User(password, userName);
					user.setName(reg.getFullName());
					in = true;
				
				} else {
					//send login to server -> server looks for existing user
					oos.writeObject(userName);
					oos.writeObject(password);
					oos.flush();
					Object o = ois.readObject();
					if (o instanceof User) {
						user = (User) o;
						in = true;
					} else if (o instanceof String) {
						int num = JOptionPane.showConfirmDialog(null, "Incorrect username password combination. Reenter username and password?", "Profile", JOptionPane.OK_CANCEL_OPTION);
						if (num == 2 || num == -1) {
							end = true;
						}
					}
				}
			}
			//import profile
			/*
			 * String filename = null;
			 
			try {
				user = importProfile(filename, oos, ois);
			} catch (ProfileException e) {
				//GUI to manage exception
			}
			*/
			
			
			//show profile GUI
			//other operations
				//edit / delete
				//export
				//user.exportProfile();
				//view user list
			
			oos.close();
			ois.close();
		} catch (IOException e) {
		
		} catch (ClassNotFoundException e) {
			//the object class has gone bye-bye
		}
		socket.close();
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
	
	
	
}
