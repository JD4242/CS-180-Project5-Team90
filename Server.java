import java.io.*;
import java.net.*;
import java.util.ArrayList;

/**
 * Server records data for all user profiles
 * 
 * @author Jonathan Dufresne
 * @version 4/27/2021
 */
public class Server {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File data = new File("ServerData.csv");
		ArrayList<User> users = new ArrayList<User>();
		String userName;
		String password;
		boolean found = false;
		boolean signup = false;
		boolean login = true;
		User user;
		int index = 0;
		users = readDataFile(data, users);
		ServerSocket ss = new ServerSocket(4242);
		Socket socket = ss.accept();
		boolean connected = true;
		//System.out.println("Connected");
		ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
		oos.flush();
		ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
		
		String method = (String) ois.readObject();
		if (method.equals("Login")) {
			login = true;
			signup = false;
		}
		if (method.equals("Signup")) {
			login = false;
			signup = true;
		}
		
		//login
		if (login) {
			userName = (String) ois.readObject();
			password = (String) ois.readObject();
			//look for matching user. return user if found and 0 if not.
			for (int i = 0; i < users.size(); i++) {
				String temp = users.get(i).getUserName();
				if (userName.equals(temp)) {
					if (users.get(i).getPassword().equals(password)) {
						found = true;
						oos.writeObject(users.get(i));
						user = users.get(i);
						index = i;
					}				
				}
			}
			if (!found) {
			oos.writeObject("0");
			}
			oos.flush();
		}
		
		//sign up
		if (signup) {
			user = (User) ois.readObject();
			users.add(user);
			//writeDataFile(data, users);
		}
		user = (User) ois.readObject();
		index = users.indexOf(user);
		writeDataFile(data, users);
		//other operations
		/*
		while (connected) {
			Object in = ois.readObject();
			String inp = (String) in;
			int input = Integer.parseInt(inp);
			switch (input) {
			case 1: //addFriend
				found = false;
				userName = (String) ois.readObject();
				for (int i = 0; i < users.size(); i++) {
					if (userName.equals(users.get(i).getUserName())) {
						found = true;
					}
				}
				if (found) {
					oos.writeObject("1");
				} else {
					oos.writeObject("-1");
				}
				oos.flush();
			case 2: //removeFriend
				break;
			case 3: //addInterest
				break;
			case 4: //removeFriend
				break;
			case 5: //editName
				break;
			case 6: //editUserName
				found = false;
				userName = (String) ois.readObject();
				for (int i = 0; i < users.size(); i++) {
					if (userName.equals(users.get(i).getUserName())) {
						found = true;
					}
				}
				if (found) {
					oos.writeObject("1");
				} else {
					oos.writeObject("-1");
				}
				oos.flush();
			case 7: //resetPassword
				break;
			case 8: //editEmail
				found = false;
				userName = (String) ois.readObject();
				for (int i = 0; i < users.size(); i++) {
					if (userName.equals(users.get(i).getEmail())) {
						found = true;
					}
				}
				if (found) {
					oos.writeObject("1");
				} else {
					oos.writeObject("-1");
				}
				oos.flush();
			case 9: //deleteProfile
				for (int i = 0; i < users.size(); i++) {
					if (user.equals(users.get(i))) {
						users.remove(i);
					}
				}
				
			case 10: //newProfile
				users.set(index, user);
				user = (User) ois.readObject();
				users.add(user);
			case 99: //disconnect
				connected = false;
				writeDataFile(data, users);
			default: break;
			}
			
			User updated = (User) ois.readObject();
			index = users.indexOf(user);
			users.set(index, updated);
			writeDataFile(data, users);
			*/
		//}
		ss.close();
	}
	
	/**
	 * Updates the data save file
	 * 
	 * @param ArrayList<User>, Text File
	 * @return
	 */
	public static void writeDataFile(File f, ArrayList<User> users) {
		User user;
		try (FileWriter fw = new FileWriter(f)) {
			for (int i = 0; i < users.size(); i++) {
				user = users.get(i);
				fw.append(user.getPassword());
				fw.append(",");
				fw.append(user.getUserName());
				fw.append(",");
				fw.append(user.getName());
				fw.append(",");
				fw.append(user.getEmail());
				fw.append("\n");
				fw.append(user.getAboutMe());
				fw.append("\n");
				ArrayList<String> interests = user.getInterests();
				for (int j = 0; j < interests.size(); j++) {
					fw.append(interests.get(j));
					if (j < interests.size() - 1) {
						fw.append(",");
					}
				}
				fw.append("\n");
				ArrayList<User> friends = user.getFriends();
				
				for (int j = 0; j < friends.size(); j++) {
					fw.append(friends.get(j).getUserName());
					if (j < friends.size() - 1) {
						fw.append(",");
					}
				}
				fw.append("\n");			
				fw.flush();
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Updates server with data save file
	 * 
	 * @param ArrayList<User>, Text File
	 * @return ArrayList<User>
	 */
	public static ArrayList<User> readDataFile(File f, ArrayList<User> users) {
		String line = null;
    	String[] data;
    	String password;
    	String userName;
    	String name;
    	String email;
    	String aboutMe;
    	ArrayList<String> interests = new ArrayList<String>();
    	ArrayList<String> userNames = new ArrayList<String>();
    	
    	//read CSV
    	try (BufferedReader br = new BufferedReader(new FileReader(f))) {    			
   			boolean hasNext = true;
    		while (hasNext) {
    			line = br.readLine();
    			if (line == null) {
    				hasNext = false;
    			} else {
    				data = line.split(",");
    				password = data[0];
    				userName = data[1];
    				name = data[2];
    				email = data[3];
    			
    				line = br.readLine();
    				aboutMe = line;
    		
    				line = br.readLine();
    				data = line.split(",");
    				for (int i = 0; i < data.length; i++) {
    					interests.add(data[i]);
    				}
    			
    				line = br.readLine();
    				data = line.split(",");
    				for (int i = 0; i < data.length; i++) {
    					userNames.add(data[i]);
    				}
    				users.add(new User(password, userName, name, aboutMe, email, interests, userNames));
    				interests.clear();
    				userNames.clear();
    			}
    		}
    		
    		br.close();
    		
    	} catch (IOException e) {
    		
    	}
		return users;
	}
}
