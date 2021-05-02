import java.util.ArrayList;


public class RecievingFriends extends javax.swing.JFrame {
    public String username;
    public String fullName;

    public ArrayList<String> pFriendsList = new Arraylist<String>();
    //pFriendList.add(username);

    public SendingFriends() {
        initComponents();

        username = userName.getText();
        fullName = userFullName.getText();
    }

    private void initComponents() {
        JButton button = new Jbutton();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionProformed (ActionEvent e ){
                //todo -add action- to give button substance
            }
        });
}

    public static void main (String [] args){
        RecievingFriends SF1 = new RecievingFriends();
    }


}
