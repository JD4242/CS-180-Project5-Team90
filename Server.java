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
		users = readDataFile(data, users);
		ServerSocket ss = new ServerSocket(4242);
		Socket socket = ss.accept();
		//System.out.println("Connected");
		ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
		oos.flush();
		ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
		userName = (String)ois.readObject();
		password = (String)ois.readObject();
		//look for matching user. return user if found and 0 if not.
		for (int i = 0; i < users.size(); i++) {
			String temp = users.get(i).getUserName();
			if (userName.equals(temp)) {
				if (users.get(i).getPassword().equals(password)) {
					found = true;
					oos.writeObject(users.get(i));
				}				
			}
		}
		if (!found) {
			oos.writeObject("0");
		}
		oos.flush();
		
		//other operations
		
		
		
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
				ArrayList<User> friends = user.getFriends();
				fw.append("\n");
				for (int j = 0; j < friends.size(); j++) {
					fw.append(friends.get(j).getUserName());
					if (j < friends.size() - 1) {
						fw.append(",");
					}
				}
							
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
    				users.add(new User(password, userName, name, aboutMe, interests, userNames));
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
