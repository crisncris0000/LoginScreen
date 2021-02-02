import java.awt.Font;
import java.awt.Image;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewScreen {

	JFrame myFrame;
	
	public NewScreen() {
		
		
		Font font1 = new Font("Verdana", Font.ITALIC, 15);
		myFrame = new JFrame();
		JLabel label = new JLabel("Welcome user!");
		JLabel label2 = new JLabel("Heres a nice picture");
		JLabel label3 = new JLabel();
		ImageIcon icon = new ImageIcon(getClass().getResource("11561_Sun.png"));
		
		
		label3.setBounds(120, 100, 200, 200);
		label3.setIcon(icon);
		label2.setBounds(130, 70, 150, 20);
		label2.setFont(font1);
		label.setBounds(150, 50, 150, 20);
		label.setFont(font1);
		
		
		myFrame.add(label3);
		myFrame.add(label);
		myFrame.add(label2);
		myFrame.setSize(500, 500);
		myFrame.setLayout(null);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		myFrame.setVisible(true);
		
		
		
		
	}
	
}
