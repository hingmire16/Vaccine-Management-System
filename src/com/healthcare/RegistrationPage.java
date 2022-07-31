package com.healthcare;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class RegistrationPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationPage frame = new RegistrationPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegistrationPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 204));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 204, 204));
		panel.setBounds(0, 0, 800, 84);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Regestration Page");
		lblNewLabel.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 30));
		lblNewLabel.setBounds(262, 11, 259, 62);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1.setBounds(112, 122, 154, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2.setBounds(112, 172, 154, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Phone No ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_3.setBounds(112, 223, 154, 25);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Email Id ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_4.setBounds(112, 275, 154, 25);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("DOB ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_5.setBounds(112, 339, 60, 25);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Gender");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_6.setBounds(112, 398, 109, 25);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Address");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_7.setBounds(112, 468, 136, 30);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel(":");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(276, 126, 17, 16);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel(":");
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_8_1.setBounds(276, 176, 17, 16);
		contentPane.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_8_2 = new JLabel(":");
		lblNewLabel_8_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_8_2.setBounds(276, 223, 25, 25);
		contentPane.add(lblNewLabel_8_2);
		
		JLabel lblNewLabel_8_3 = new JLabel(":");
		lblNewLabel_8_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_8_3.setBounds(276, 276, 17, 25);
		contentPane.add(lblNewLabel_8_3);
		
		JLabel lblNewLabel_8_4 = new JLabel(":");
		lblNewLabel_8_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_8_4.setBounds(276, 340, 17, 25);
		contentPane.add(lblNewLabel_8_4);
		
		JLabel lblNewLabel_8_5 = new JLabel(":");
		lblNewLabel_8_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_8_5.setBounds(276, 402, 17, 21);
		contentPane.add(lblNewLabel_8_5);
		
		JLabel lblNewLabel_8_6 = new JLabel(":");
		lblNewLabel_8_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_8_6.setBounds(276, 468, 17, 30);
		contentPane.add(lblNewLabel_8_6);
		
		textField = new JTextField();
		textField.setBounds(329, 123, 244, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(329, 178, 244, 30);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(329, 229, 244, 30);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(329, 282, 244, 30);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(329, 340, 244, 30);
		contentPane.add(textField_4);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Female");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNewRadioButton.setBounds(329, 403, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnMale.setBounds(492, 403, 109, 23);
		contentPane.add(rdbtnMale);
		
		JRadioButton rdbtnOther = new JRadioButton("Other");
		rdbtnOther.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnOther.setBounds(651, 403, 109, 23);
		contentPane.add(rdbtnOther);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(329, 475, 244, 153);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(51, 255, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(211, 694, 139, 50);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1.setBounds(520, 694, 139, 50);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\New\\Downloads\\vac2 (2).jpg"));
		lblNewLabel_9.setBounds(-188, 82, 1256, 869);
		contentPane.add(lblNewLabel_9);
		setUndecorated(true);
	}
}
