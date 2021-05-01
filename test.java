import java.util.ArrayList;


public class test {
	public static void main(String[] args) {
		String password = "password";
		String userName = "User1";
		String name = "John Doe";
		String aboutMe = "info about the user";
		
		ArrayList<User> friends = new ArrayList<User>();
		friends.add(new User());
		friends.add(new User());
		friends.add(new User());
		friends.add(new User());
		friends.get(0).setUserName("friend1");
		friends.get(1).setUserName("friend2");
		friends.get(2).setUserName("friend3");
		friends.get(3).setUserName("friend4");
		
		ArrayList<String> interests = new ArrayList<String>();
		interests.add("interest1");
		interests.add("interest2");
		interests.add("interest3");
		interests.add("interest4");
		
		User user = new User(password, userName, name, aboutMe, interests, friends);
		
		user.exportProfile();
	}
}
