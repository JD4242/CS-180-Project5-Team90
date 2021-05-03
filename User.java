import java.io.*;
import java.util.ArrayList;

/**
 * An object to organize the information that makes up a user profile.
 * 
 * @author Jonathan Dufresne
 * @version 5/1/2021
 */
@SuppressWarnings("serial")
public class User implements Serializable {
    private String password;
    private String userName;
    private String name;
    private String aboutMe;
    private String email;
    private int numInterests;
    private int numFriends;
    private ArrayList<String> interests = new ArrayList<String>();
    private ArrayList<String> friendList = new ArrayList<String>();
    private ArrayList<User> friends = new ArrayList<User>();
    
    /**
     * Default constructor
     */
    public User() {
        password = null;
        userName = null;
        name = null;
        aboutMe = null;
        email = null;
        numInterests = 0;
        numFriends = 0;
    }
    
    /**
     * Creates new profile with the given userName and password
     * @param pass
     * @param userName
     */
    public User(String pass, String userName) {
        this.password = pass;
        this.userName = userName;
        name = null;
        aboutMe = null;
        email = null;
        numInterests = 0;
        numFriends = 0;
    }
    
   /**
    * Creates new profile with all information given
    * @param pass
    * @param userName
    * @param name
    * @param aboutMe
    * @param email
    * @param interests
    * @param friends
    */
    public User(String pass, String userName, String name, String aboutMe, String email, ArrayList<String> interests, ArrayList<String> userNames) {
    	this.password = pass;
    	this.userName = userName;
    	this.name = name;
    	this.aboutMe = aboutMe;
    	this.email = email;
    	this.interests = interests;
    	this.friendList = userNames;
    	numInterests = interests.size();
        numFriends = friendList.size();
    }
    
    /**
     * Create new profile from csv file
     * @param filename
     */
    public User(String filename) {
    	String line = null;
    	String[] data;
    	
    	//read CSV
    	File csv = new File(filename);
    	try (BufferedReader br = new BufferedReader(new FileReader(csv))) {
    		try {
    			line = br.readLine();
    			data = line.split(",");
    			this.password = data[0];
    			this.userName = data[1];
    			this.name = data[2];
    			this.email = data[3];
    			
    			line = br.readLine();
    			this.aboutMe = line;
    			
    			line = br.readLine();
    			data = line.split(",");
    			for (int i = 0; i < data.length; i++) {
    				this.interests.add(data[i]);
    			}
    			
    			line = br.readLine();
    			data = line.split(",");
    			for (int i = 0; i < data.length; i++) {
    				this.friendList.add(data[i]);
    			}
    		} catch (Exception e) {
    			//ImportException
    		}
    		br.close();
    		
    	} catch (IOException e) {
    		
    	}
    }
    
    /**
     * Reset password
     * @param pass
     */
    public void setPassword(String pass) {
        this.password = pass;
    }
    
    /**
     * resets userName
     * @param name
     */
    public void setUserName(String name) {
        this.userName = name;
    }
    
    /**
     * Changes the user's name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Changes the aboutMe
     * @param aboutMe
     */
    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }
    
    /**
     * Change email address
     * @param email
     */
    public void setEmail(String email) {
    	this.email = email;
    }
    
    /**
     * Complete change of friends array list
     * @param ary
     */
    public void setFriends(ArrayList<User> ary) {
    	this.friends = ary;
    }
    
    /**
     * Complete change of friendList array list
     * @param ary
     */
    public void setFriendList(ArrayList<String> ary) {
    	this.friendList = ary;
    }
    
    /**
     * Complete change of interests array list
     * @param ary
     */
    public void setInterests(ArrayList<String> ary) {
    	this.interests = ary;
    }
    
    /**
     * Gets profile user name
     * @return
     */
    public String getUserName() {
    	return userName;
    }
    
    /**
     * Gets password
     * @return
     */
    public String getPassword() {
    	return password;
    }
    
    /**
     * Gets user's name
     * @return
     */
    public String getName() {
        return name;
    }
    
    /**
     * Returns the aboutMe
     * @return
     */
    public String getAboutMe() {
        return aboutMe;
    }
    
    /**
     * Returns the email address
     * @return
     */
    public String getEmail() {
    	return email;
    }
    
    /**
     * Gets user names of friends
     * @return
     */
    public ArrayList<String> getFriendList() {
    	return friendList;
    }
    
    /**
     * Gets interests list
     * @return
     */
    public ArrayList<String> getInterests() {
    	return interests;
    }
    
    /**
     * Returns the friend list
     * @return
     */
    public ArrayList<User> getFriends() {
        return friends;
    }
    
    /**
     * Add new friend
     * @param user
     */
    public void addFriend(User user) {
        boolean prior = false;
        for (int i = 0; i < friends.size(); i++) {
            if (user.equals(friends.get(i))) {
                prior = true;
                break;
            }
        }
        if (!prior) {
            friends.add(user);
            numFriends++;
        }
    }
    
    /**
     * Add new friend to friendList
     * @param userName
     */
    public void addFriend(String userName) {
        boolean prior = false;
        for (int i = 0; i < friendList.size(); i++) {
            if (userName.equals(friendList.get(i))) {
                prior = true;
                break;
            }
        }
        if (!prior) {
            friendList.add(userName);
            numFriends++;
        }
    }
    
    /**
     * Add to interests list
     * @param interest
     */
    public void addInterest(String interest) {
        boolean prior = false;
        for (int i = 0; i < interests.size(); i++) {
            if (interest.equals(interests.get(i))) {
                prior = true;
                break;
            }
        }
        if (!prior) {
            interests.add(interest);
            numInterests++;
        }
    }
    
    /**
     * Export profile information to csv file
     */
    public void exportProfile() {
		//write CSV
		
		File csv = new File("ProfileExport.csv");
		try (FileWriter fw = new FileWriter(csv)) {
			fw.append(password);
			fw.append(",");
			fw.append(userName);
			fw.append(",");
			fw.append(name);
			fw.append(",");
			fw.append(email);
			fw.append("\n");
			fw.append(aboutMe);
			fw.append("\n");
			for (int i = 0; i < interests.size(); i++) {
				fw.append(interests.get(i));
				if (i < interests.size() - 1) {
					fw.append(",");
				}
			}
			fw.append("\n");
			for (int i = 0; i < friends.size(); i++) {
				fw.append(friendList.get(i));
				if (i < friends.size() - 1) {
					fw.append(",");
				}
			}
			fw.append("\n");			
			fw.flush();
			fw.close();
		} catch (IOException e) {
			//this shouldn't happen because this method creates it's own new export file
		}
		
	}
    
    /**
     * Export profile information to specific csv file
     * @param filename
     */
    public void exportProfile(String filename) {
		//write CSV
		
		File csv = new File(filename);
		try (FileWriter fw = new FileWriter(csv)) {
			fw.append(password);
			fw.append(",");
			fw.append(userName);
			fw.append(",");
			fw.append(name);
			fw.append(",");
			fw.append(email);
			fw.append("\n");
			fw.append(aboutMe);
			fw.append("\n");
			for (int i = 0; i < interests.size(); i++) {
				fw.append(interests.get(i));
				if (i < interests.size() - 1) {
					fw.append(",");
				}
			}
			fw.append("\n");
			for (int i = 0; i < friends.size(); i++) {
				fw.append(friendList.get(i));
				if (i < friends.size() - 1) {
					fw.append(",");
				}
			}
			fw.append("\n");			
			fw.flush();
			fw.close();
		} catch (IOException e) {
			//this shouldn't happen because this method creates it's own new export file
		}
		
	}
    
    
    /**
     * Saves all profile information as a String
     * @return
     */
    public String toString() {
        String info = "INFO<" + name + "," + email + "," + userName + "," + password + "," + numInterests + "," + numFriends + ">";
        String friend = "Friend List: \n";
        for (int i = 0; i < friends.size(); i++) {
            friend += friendList.get(i) + "\n";
        }
        String interest = "Interests: \n";
        for (int i = 0; i < interests.size(); i++) {
            interest += interests.get(i) + "\n";
        }
        return info + "\n" + friend + interest;
    }
    
    /**
     * Deletes profile information
     */
    public void deleteProfile() {
        password = null;
        userName = null;
        name = null;
        email = null;
        aboutMe = null;
        friends.clear();
        interests.clear();
    }
}