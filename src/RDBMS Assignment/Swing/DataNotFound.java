package practiceSet;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DataNotFound {
	JLabel l5;
	public DataNotFound() {
		JFrame fr = new JFrame("Alert");
		fr.setVisible(true);
		fr.setSize(300, 200);
		fr.setLayout(null);
		
		l5 = new JLabel("Data not found");
		l5.setBounds(100,50,120,50);
		fr.add(l5);
	}
}
