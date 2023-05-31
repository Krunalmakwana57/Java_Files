package practiceSet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class SwingDemo implements ActionListener {
	
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3,t4;
	JButton b1,b2,b3,b4;
	
	public SwingDemo() {
		JFrame jf = new JFrame("MyJavaApp");
		jf.setVisible(true);
		jf.setSize(700, 500);
		jf.setLayout(null);
		
		l1 = new JLabel("Id ");
		l1.setBounds(100, 100, 120, 20);
		jf.add(l1);
		
		l2 = new JLabel("Name ");
		l2.setBounds(100, 140, 120, 20);
		jf.add(l2);
		
		l3 = new JLabel("Contact ");
		l3.setBounds(100, 180, 120, 20);
		jf.add(l3);
		
		l4 = new JLabel("Email ");
		l4.setBounds(100, 220, 120, 20);
		jf.add(l4);
		
		t1 = new JTextField();
		t1.setBounds(200, 100, 120, 20);
		jf.add(t1);
		
		t2 = new JTextField();
		t2.setBounds(200, 140, 120, 20);
		jf.add(t2);
		
		t3 = new JTextField();
		t3.setBounds(200, 180, 120, 20);
		jf.add(t3);
		
		t4 = new JTextField();
		t4.setBounds(200, 220, 120, 20);
		jf.add(t4);
		
		b1 = new JButton("Inset");
		b1.setBounds(120, 270, 80, 20);
		jf.add(b1);
		
		b2 = new JButton("Search");
		b2.setBounds(220, 270, 80, 20);
		jf.add(b2);
		
		b3 = new JButton("Update");
		b3.setBounds(120, 300, 80, 20);
		jf.add(b3);
		
		b4 = new JButton("Delete");
		b4.setBounds(220, 300, 80, 20);
		jf.add(b4);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new SwingDemo();
	}
	
	public static Connection createConnection() {
		Connection cn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cn;
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			int Id = Integer.parseInt(t1.getText());
			String Name = t2.getText();
			long Contact = Long.parseLong(t3.getText());
			String Email = t4.getText();
			System.out.println(Id);
			System.out.println(Name);
			System.out.println(Contact);
			System.out.println(Email);
			try {
				Connection cn = SwingDemo.createConnection();
				String sql = "insert into users (Id,Name,Contact,Email)values(?,?,?,?)";
				PreparedStatement pst = cn.prepareStatement(sql);
				pst.setInt(1, Id);
				pst.setString(2, Name);
				pst.setLong(3, Contact);
				pst.setString(4, Email);
				pst.executeUpdate();
				System.out.println("Data Inserted Successfully");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}else if(e.getSource() == b2) {
			int Id = Integer.parseInt(t1.getText());
			try {
				Connection cn = SwingDemo.createConnection();
				String sql = "select * from users where id = ?";
				PreparedStatement pst = cn.prepareStatement(sql);
				pst.setInt(1, Id);
				ResultSet rs = pst.executeQuery(); 
				if(rs.next()) {
					t1.setText(String.valueOf(rs.getInt("Id")));
					t2.setText(rs.getString("Name"));
					t3.setText(String.valueOf(rs.getLong("Contact")));
					t4.setText(rs.getString("Email"));
				}else {
					System.out.println("Data not Found");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					new DataNotFound();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}else if(e.getSource() == b3) {
			int Id = Integer.parseInt(t1.getText());
			String Name = t2.getText();
			long Contact = Long.parseLong(t3.getText());
			String Email = t4.getText();
			try {
				Connection cn = SwingDemo.createConnection();
				String sql = "update users set Name = ?, Contact = ?, Email = ? where Id = ?";
				PreparedStatement pst = cn.prepareStatement(sql);
				pst.setString(1, Name);
				pst.setLong(2, Contact);
				pst.setString(3, Email);
				pst.setInt(4, Id);
				pst.executeUpdate();
				System.out.println("Data Updated");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}else if(e.getSource() == b4) {
			int Id = Integer.parseInt(t1.getText());
			try {
				Connection cn = SwingDemo.createConnection();
				String sql = "delete from users where id = ?";
				PreparedStatement pst = cn.prepareStatement(sql);
				pst.setInt(1, Id);
				pst.executeUpdate();
				System.out.println("Data Deleted");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
