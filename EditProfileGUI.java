import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * 
 * @author jonat
 *
 */
@SuppressWarnings("serial")
public class EditProfileGUI extends JComponent implements Runnable{
	Image image;
	
	JButton btn1; //addFriend
	JButton btn2; //removeFriend
	JButton btn3; //addInterest
	JButton btn4; //removeInterest
	JButton btn5; //changeName
	JButton btn6; //changeUserName
	JButton btn7; //changePassword
	JButton btn8; //changeEmail
	JButton btn9; //deleteProfile
	JButton btn10; //newProfile
	
	int choice = 0;
	
	ActionListener actlis = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btn1) {
				choice = 1;
			}
			if (e.getSource() == btn2) {
				choice = 2;
			}
			if (e.getSource() == btn3) {
				choice = 3;
			}
			if (e.getSource() == btn4) {
				choice = 4;
			}
			if (e.getSource() == btn5) {
				choice = 5;
			}
			if (e.getSource() == btn6) {
				choice = 6;
			}
			if (e.getSource() == btn7) {
				choice = 7;
			}
			if (e.getSource() == btn8) {
				choice = 8;
			}
			if (e.getSource() == btn9) {
				choice = 9;
			}
			if (e.getSource() == btn10) {
				choice = 10;
			}
		}
	};
	
	public void run() {
		JFrame frame = new JFrame("Profile Editor");
        GridLayout gl = new GridLayout(0, 4);
        
        
        EditProfileGUI epg = new EditProfileGUI();
       
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        btn1 = new JButton("Add Friend");
        btn1.addActionListener(actlis);
        btn2 = new JButton("Remove Friend");
        btn2.addActionListener(actlis-> {
        	frame.dispose();
        });
        btn3 = new JButton("Add Interest");
        btn3.addActionListener(actlis-> {
        	frame.dispose();
        });
        btn4 = new JButton("Remove Interest");
        btn4.addActionListener(actlis-> {
        	frame.dispose();
        });
        btn5 = new JButton("Edit Name");
        btn5.addActionListener(actlis-> {
        	frame.dispose();
        });
        btn6 = new JButton("Edit UserName");
        btn6.addActionListener(actlis-> {
        	frame.dispose();
        });
        btn7 = new JButton("Reset Password");
        btn7.addActionListener(actlis-> {
        	frame.dispose();
        });
        btn8 = new JButton("Edit Email");
        btn8.addActionListener(actlis-> {
        	frame.dispose();
        });
        btn9 = new JButton("Delete Profile");
        btn9.addActionListener(actlis-> {
        	frame.dispose();
        });
        btn10 = new JButton("Create New Profile");
        btn10.addActionListener(actlis-> {
        	frame.dispose();
        });
        
        JPanel p2 = new JPanel(gl);
        p2.add(btn1);
        p2.add(btn2);
        p2.add(btn3);
        p2.add(btn4);
        p2.add(btn5);
        p2.add(btn6);
        p2.add(btn7);
        p2.add(btn8);
        p2.add(btn9);
        p2.add(btn10);
        frame.add(p2);
	}
}
