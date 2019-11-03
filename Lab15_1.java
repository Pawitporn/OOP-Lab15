
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Lab15_1 {

	public static void main(String[] args) {
		
		// Create Frame
		JFrame box = new JFrame();
		box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		box.setBounds(100,100,501,629);
		box.setTitle("OOP 1-62 Lab14 Qustion 2");
		box.getContentPane().setLayout(null);
		
		//========== Name Label and Field ===========
		JLabel name = new JLabel("Name : ");
		name.setBounds(100, 25, 400, 100);
		box.getContentPane().add(name); 
		
		JTextField name_field = new JTextField();
		name_field.setBounds(180, 64, 200, 20);
		box.getContentPane().add(name_field);
		
		//========== Password Label and Field ==========
		JLabel password = new JLabel("Password : ");
		password.setBounds(100, 55, 100, 100);
		box.getContentPane().add(password); 
		
		JPasswordField pass_field = new JPasswordField();
		pass_field.setBounds(180, 95, 200, 20);
		box.getContentPane().add(pass_field);
		
		//========== Address Label ===========
		JLabel address = new JLabel("Address : ");
		address.setBounds(100, 85, 400, 100);
		box.getContentPane().add(address); 
		
		//========== Address TextArea ===========
		JTextArea textArea_Address = new JTextArea(10, 200);
		textArea_Address.setBounds(180, 125, 195, 100);
		box.getContentPane().add(textArea_Address);
		//========== Address  ScrollBar ==========
		JScrollPane scroll_address = new JScrollPane(textArea_Address);
		scroll_address.setBounds(180, 125, 200, 100);
		box.getContentPane().add(scroll_address);
		
		//========== Gender Label ===========
		JLabel gender = new JLabel("Gender : ");
		gender.setBounds(100, 220, 400, 50);
		box.getContentPane().add(gender); 
		
		//========== Gender Radio_BTN ===========
		JRadioButton gender_male = new JRadioButton("Male");
		gender_male.setBounds(180, 235, 70, 25);
		box.getContentPane().add(gender_male);
		gender_male.setActionCommand("Male");
		
		JRadioButton gender_female = new JRadioButton("Female");
		gender_female.setBounds(280, 235, 100, 25);
		box.getContentPane().add(gender_female);
		gender_female.setActionCommand("Female");
		
		//========== Group Gender ==========
		ButtonGroup group = new ButtonGroup();
		group.add(gender_male);
		group.add(gender_female);
		
		//========== Skill Programming Label and Checkboxs =========
		JLabel skill = new JLabel("Skill : ");
		skill.setBounds(100, 230, 400, 100);
		box.getContentPane().add(skill); 
		
		JCheckBox skill_c = new JCheckBox("C");
		skill_c.setBounds(180, 273, 100, 14);
		box.getContentPane().add(skill_c);
		skill_c.setActionCommand("C");
		
		JCheckBox skill_cpp = new JCheckBox("C++");
		skill_cpp.setBounds(180, 300, 100, 14);
		box.getContentPane().add(skill_cpp);
		
		JCheckBox skill_java = new JCheckBox("Java");
		skill_java.setBounds(180, 327, 100, 14);
		box.getContentPane().add(skill_java);
		
		JCheckBox skill_py = new JCheckBox("Python");
		skill_py.setBounds(180, 354, 100, 14);
		box.getContentPane().add(skill_py);
		
		JCheckBox skill_php = new JCheckBox("PHP");
		skill_php.setBounds(180, 381, 100, 14);
		box.getContentPane().add(skill_php);
		
		JCheckBox skill_r = new JCheckBox("R");
		skill_r.setBounds(180, 408, 100, 14);
		box.getContentPane().add(skill_r);
		
		
		//========== Education Label and Array =========
		JLabel edu = new JLabel("Education : ");
		edu.setBounds(100, 398, 400, 100);
		box.getContentPane().add(edu); 
		
		String[] edu_arr = {"High School", "Bachelor", "Master's Degree", "Ph.D."};
		JComboBox education = new JComboBox(edu_arr);
		education.setBounds(180, 438, 100, 20);
		box.getContentPane().add(education);
		
		//========== BTN_OK =============
		JButton btn_OK = new JButton("OK");
		btn_OK.setBounds(190, 500, 100, 25);
		box.getContentPane().add(btn_OK);
		btn_OK.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String SelectSkill = "";
				if(skill_c.isSelected())SelectSkill += "C ";
				if(skill_cpp.isSelected())SelectSkill += "C++ ";
				if(skill_java.isSelected())SelectSkill+= "Java ";
				if(skill_py.isSelected())SelectSkill += "Python ";
				if(skill_php.isSelected())SelectSkill+= "PHP ";
				if(skill_r.isSelected())SelectSkill += "R ";

				JOptionPane.showMessageDialog(box, "Your Information \n" + 
													"Name : " + name_field.getText() +"\n"+
													"Address : " + textArea_Address.getText() +"\n"+
													"Gender : " +group.getSelection().getActionCommand()+"\n"+
													"Skill : " + SelectSkill +"\n"+
													"Education : " + education.getSelectedItem()
						);
				
			}
		});
		
		// Show To Program
		box.setVisible(true);

	}

}
