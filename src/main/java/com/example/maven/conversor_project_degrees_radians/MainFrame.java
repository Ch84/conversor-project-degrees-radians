package com.example.maven.conversor_project_degrees_radians;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainFrame {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblConversor = new JLabel("Conversor");
		lblConversor.setBounds(186, 12, 100, 15);
		frame.getContentPane().add(lblConversor);
		
		JLabel lblEnterTheValue = new JLabel("Enter the value in degrees:");
		lblEnterTheValue.setBounds(150, 60, 214, 15);
		frame.getContentPane().add(lblEnterTheValue);
		
		JLabel lblEnterTheValue_1 = new JLabel("Enter the value in radians:");
		lblEnterTheValue_1.setBounds(150, 143, 188, 15);
		frame.getContentPane().add(lblEnterTheValue_1);
		
		textField = new JTextField();
		textField.setBounds(150, 111, 188, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(150, 187, 188, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblResult = new JLabel("result:");
		lblResult.setBounds(150, 230, 136, 15);
		frame.getContentPane().add(lblResult);
		
		JButton btnTo = new JButton("To Degrees");
		btnTo.setBounds(150, 247, 117, 25);
		frame.getContentPane().add(btnTo);
		
		JButton btnToRadians = new JButton("To Radians");
		btnToRadians.setBounds(291, 247, 117, 25);
		frame.getContentPane().add(btnToRadians);
	}
}
