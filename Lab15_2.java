import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Lab15_2 {

	public static void main(String[] args) {
		JFrame box = new JFrame();
		box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		box.setBounds(100,100,563,323);
		box.setTitle("OOP 1-62 Lab15 Qustion 2");
		box.getContentPane().setLayout(null);
		
		//
		
		JLabel number_1 = new JLabel("Number 1");
		number_1.setBounds(100, 25, 400, 100);
		box.getContentPane().add(number_1);
		
		JTextField num1_field = new JTextField();
		num1_field.setBounds(90, 90, 80, 20);
		box.getContentPane().add(num1_field);
		
		
		//
		
		JLabel operator = new JLabel("Operator");
		operator.setBounds(220, 25, 400, 100);
		box.getContentPane().add(operator);
		
		String[] operator_arr = {"+", "-", "*", "/"};
		JComboBox operator_cal = new JComboBox(operator_arr);
		operator_cal.setBounds(220, 90, 50, 20);
		box.getContentPane().add(operator_cal);
		
		
		
		//
		JLabel number_2 = new JLabel("Number 2");
		number_2.setBounds(350, 25, 400, 100);
		box.getContentPane().add(number_2);
		
		JTextField num2_field = new JTextField();
		num2_field.setBounds(340, 90, 80, 20);
		box.getContentPane().add(num2_field);
		
		JButton btn_Cal = new JButton("Calculation");
		btn_Cal.setBounds(200, 150, 100, 25);
		box.getContentPane().add(btn_Cal);
		btn_Cal.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int numb1 = Integer.valueOf(num1_field.getText());
				int numb2 = Integer.valueOf(num2_field.getText());
				double sum = 0;
				
				if(operator_cal.getSelectedItem().equals("+")) sum = numb1 + numb2;
				if(operator_cal.getSelectedItem().equals("-")) sum = numb1 - numb2;
				if(operator_cal.getSelectedItem().equals("*")) sum = numb1 * numb2;
				if(operator_cal.getSelectedItem().equals("/")) sum = numb1 / numb2;
					
				
				
				JOptionPane.showMessageDialog(box,  num1_field.getText() + " "+ operator_cal.getSelectedItem() + " "+ num2_field.getText() + " = " + sum );
				
			}
		});
		
		
		
		
		box.setVisible(true);
	}

}
