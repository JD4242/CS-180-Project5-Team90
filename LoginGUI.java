import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * User interface for signing in
 *
 * @author Jonathan Dufresne
 * @version 5/1/2021
 */
@SuppressWarnings("serial")
public class LoginGUI extends JComponent implements Runnable 
{
    Image image; // the canvas
    JButton signupButton;
    JButton loginButton;
    
    JLabel username;
    JLabel pass;
    JLabel welcome;
    JLabel spacerV;
    JLabel spacerH;
    
    JTextField usernameText;
    JTextField passwordText;
    
    private String userName;
    private String password;
    boolean done = false;
    boolean sign = false;
    
    
    ActionListener actlis = new ActionListener () {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == loginButton) {
                userName = usernameText.getText();
                password = passwordText.getText();
                done = true;
                
                
                
            }
            if (e.getSource() == signupButton) {
                sign = true;
            }
        }
    };
    
    public void run() {
        JFrame frame = new JFrame("LogIn");
        Container content = frame.getContentPane();
        BorderLayout bl = new BorderLayout(500, 50);
        content.setLayout(bl);
        
        
        LoginGUI login = new LoginGUI();
        content.add(login, BorderLayout.CENTER);
        content.add(login);
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        loginButton = new JButton("Login");
        loginButton.addActionListener(actlis -> {
        	frame.dispose();
        });
        signupButton = new JButton("Sign Up");
        signupButton.addActionListener(actlis -> {
        	frame.dispose();
        });
        
        passwordText = new JPasswordField("", 20);
        usernameText = new JTextField("", 20);
        
        username = new JLabel("Username:");
        pass = new JLabel("     Password:");
        welcome = new JLabel("WELCOME/SIGNIN MESSAGE");
        spacerV = new JLabel(" \n \n \n");
        spacerH = new JLabel("                                              "
            + "                                                    "
            + "                                                    "
            + "                                                    ");
        
        JPanel panel = new JPanel();
        panel.add(loginButton);
        panel.add(signupButton);
        content.add(panel, BorderLayout.SOUTH);
        
        JPanel panel1 = new JPanel();
        panel1.add(welcome);
        content.add(panel1, BorderLayout.NORTH);
        
        
        JPanel panel2 = new JPanel();
        //JPanel panel3 = new JPanel();
        panel2.add(spacerV);
        panel2.add(username);
        panel2.add(usernameText);
        panel2.add(spacerH);
        panel2.add(pass);
        panel2.add(passwordText);
        content.add(panel2, BorderLayout.CENTER);
       
    }
    public boolean getDone() {
    	return done;
    }
    public String getUserName() {
    	return userName;
    }
    public String getPassword() {
    	return password;
    }
}
