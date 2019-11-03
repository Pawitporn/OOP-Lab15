import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Lab15_3 {

	public static void main(String[] args) {
		
		
		JFrame box = new JFrame();
		box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		box.setBounds(100,100,700,618);
		box.setTitle("OOP 1-62 Lab15 Qustion 2");
		box.getContentPane().setLayout(null);

		JLabel register = new JLabel("Register Data");
		register.setBounds(300, 25, 400, 100);
		box.getContentPane().add(register);
		
		JLabel username = new JLabel("Username : ");
		username.setBounds(100, 70, 400, 100);
		box.getContentPane().add(username);
		
		JTextField username_field = new JTextField();
		username_field.setBounds(250, 110, 200, 20);
		box.getContentPane().add(username_field);
		
		JLabel password = new JLabel("Password : ");
		password.setBounds(100, 110, 400, 100);
		box.getContentPane().add(password);
		
		JPasswordField pass_field = new JPasswordField();
		pass_field.setBounds(250, 150, 200, 20);
		box.getContentPane().add(pass_field);
		
		JLabel re_password = new JLabel("Confirm Password : ");
		re_password.setBounds(100, 150, 400, 100);
		box.getContentPane().add(re_password);
		
		JPasswordField repass_field = new JPasswordField();
		repass_field.setBounds(250, 190, 200, 20);
		box.getContentPane().add(repass_field);
		
		JLabel name = new JLabel("Name : ");
		name.setBounds(100, 190, 400, 100);
		box.getContentPane().add(name);
		
		JTextField name_field = new JTextField();
		name_field.setBounds(250, 230, 250, 20);
		box.getContentPane().add(name_field);
		
		JLabel email = new JLabel("Email : ");
		email.setBounds(100, 230, 400, 100);
		box.getContentPane().add(email);
		
		JTextField email_field = new JTextField();
		email_field.setBounds(250, 270, 250, 20);
		box.getContentPane().add(email_field);
		JButton btn_OK = new JButton("OK");
		btn_OK.setBounds(190, 500, 100, 25);
		box.getContentPane().add(btn_OK);
		btn_OK.addActionListener(new ActionListener() {
			Person person = new Person();
			
			public void actionPerformed(ActionEvent e) {
				
				Person person = new Person(username_field.getText(), pass_field.getText(), name_field.getText(), email_field.getText());
				
				if(person.getUsername().equals("")) 
					JOptionPane.showMessageDialog(box, "Please input your Username. ","Error!",JOptionPane.WARNING_MESSAGE);
				if(person.getPassword().equals(""))
					JOptionPane.showMessageDialog(box, "Please input your Password. ","Error!",JOptionPane.WARNING_MESSAGE);
				if(repass_field.getText().equals(""))
					JOptionPane.showMessageDialog(box, "Please Confirm your Password. ","Error!",JOptionPane.WARNING_MESSAGE);
				if(!pass_field.getText().equals(repass_field.getText()) ) 
					JOptionPane.showMessageDialog(box, "Password Not Match Please Try Again!!","Error!",JOptionPane.WARNING_MESSAGE);
				if(person.getName().equals(""))
					JOptionPane.showMessageDialog(box, "Please input your name. ","Error!",JOptionPane.WARNING_MESSAGE);
				if(person.getEmail().equals(""))
					JOptionPane.showMessageDialog(box, "Please input your email. ","Error!",JOptionPane.WARNING_MESSAGE);
				if(username_field.getText().equals("") == false && pass_field.getText().equals("") == false && repass_field.getText().equals("") == false && name_field.getText().equals("") == false && email_field.getText().equals("") == false ) 
					JOptionPane.showMessageDialog(box, "Register Data Successfully" + person.toString()) ;
				
			}		
		});

		box.setVisible(true);
	}

}
