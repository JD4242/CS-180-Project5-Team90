import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * User interface to handle file imports
 * 
 * @author Jonathan Dufresne
 * @version 5/2/2021
 */
@SuppressWarnings("serial")
public class FileNameGUI extends JComponent implements Runnable{
	Image image; // the canvas
	JTextField input;
	JButton enter;
	JLabel label;
	
	String filename;
	
	ActionListener actlis = new ActionListener () {
		@Override
        public void actionPerformed(ActionEvent e) {
			if (e.getSource() == enter) {
				filename = input.getText();
			}
		}
	};
	
	public void run() {
		JFrame frame = new JFrame("NAME");
        Container content = frame.getContentPane();
        BorderLayout bl = new BorderLayout(500, 50);
        content.setLayout(bl);
        
        FileNameGUI gui = new FileNameGUI();
        content.add(gui, BorderLayout.CENTER);
        content.add(gui);
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        enter = new JButton("Import File");
        enter.addActionListener(actlis -> {
        	frame.dispose();
        });
        
        input = new JTextField("", 20);
        label = new JLabel("Filename:");
        
        JPanel p1 = new JPanel();
        p1.add(label);
        p1.add(input);
        content.add(p1, BorderLayout.CENTER);
        JPanel p2 = new JPanel();
        p2.add(enter);
        content.add(p2, BorderLayout.SOUTH);
	}
}
