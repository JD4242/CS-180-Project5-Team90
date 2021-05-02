import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * User interface to handle the creation of new profiles
 * 
 * @author Jonathan Dufresne
 * @version 5/2/2021
 */
@SuppressWarnings("serial")
public class NewProfileGUI extends JComponent implements Runnable{
	
	Image image; // the canvas
    JButton fileButton;
    JButton loginButton;
    
    int choice = 0;
    
    ActionListener actlis = new ActionListener () {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == loginButton) {
            	choice = 1;
            }
            if (e.getSource() == fileButton) {
                choice = 2;
            }
        }
    };
    
    public void run() {
    	JFrame frame = new JFrame("NAME");
        Container content = frame.getContentPane();
        BorderLayout bl = new BorderLayout(500, 50);
        content.setLayout(bl);
        
        NewProfileGUI profile = new NewProfileGUI();
        content.add(profile, BorderLayout.CENTER);
        content.add(profile);
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        fileButton = new JButton("Import File");
        fileButton.addActionListener(actlis -> {
        	frame.dispose();
        });
        
        loginButton = new JButton("Create Manually");
        loginButton.addActionListener(actlisactlis -> {
        	frame.dispose();
        });
        
        JPanel panel = new JPanel();
        panel.add(loginButton);
        panel.add(fileButton);
        content.add(panel, BorderLayout.CENTER);
        
    }
}
