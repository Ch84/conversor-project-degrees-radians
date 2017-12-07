package com.example.maven.conversor_project_degrees_radians;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainFrame {

	private JFrame frmConversor;
	private JTextField tx_ValueInDegrees = new JTextField("");
	private JTextField tx_ValueInRadians = new JTextField("");
	private JLabel lblEnterTheValue = new JLabel("Enter the value in degrees:");
	private JLabel lblEnterTheValue_1 = new JLabel("Enter the value in radians:");
	private JLabel lblResult = new JLabel("result:");
	private JButton btnToRadians = new JButton("to radians");
	private JButton btnToDegrees = new JButton("to degrees");
	private DegreesToRadians conversor = new DegreesToRadians();
	double valueInDegrees = 0.0;
	double convertedValue = 0.0;
	double valueInRadians = 0.0;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frmConversor.setVisible(true);
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
		frmConversor = new JFrame();
		frmConversor.setResizable(false);
		frmConversor.setTitle("Conversor");
		frmConversor.setBounds(300, 300, 400, 400);
		frmConversor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConversor.getContentPane().setLayout(null);
		

		btnToRadians.setBounds(84, 233, 117, 25);
		btnToRadians.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(tx_ValueInDegrees.getText().toString().equals(""))) {
					valueInDegrees = Double.parseDouble(tx_ValueInDegrees.getText());
					convertedValue = conversor.convertDegresToRadians(valueInDegrees);
					lblResult.setText("Result: " + convertedValue);
					
					cleanTextFields();
					
				}else {
					lblResult.setText("Result: No value was informed!");					
					cleanTextFields();
				}
				
			}
		});
		
		
		frmConversor.getContentPane().add(btnToRadians);
		
		JLabel lblEnterTheValue_2 = new JLabel("Enter the value in degrees: ");
		lblEnterTheValue_2.setBounds(84, 26, 209, 15);
		frmConversor.getContentPane().add(lblEnterTheValue_2);
		
		tx_ValueInDegrees = new JTextField();
		tx_ValueInDegrees.setBounds(84, 63, 195, 19);
		frmConversor.getContentPane().add(tx_ValueInDegrees);
		tx_ValueInDegrees.setColumns(10);
		
		JLabel lblEnterTheValue_3 = new JLabel("Enter the value in radians:");
		lblEnterTheValue_3.setBounds(84, 115, 195, 15);
		frmConversor.getContentPane().add(lblEnterTheValue_3);
		
		tx_ValueInRadians = new JTextField();
		tx_ValueInRadians.setBounds(87, 149, 192, 19);
		frmConversor.getContentPane().add(tx_ValueInRadians);
		tx_ValueInRadians.setColumns(10);
		
		btnToDegrees = new JButton("to degrees");
		btnToDegrees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(tx_ValueInRadians.getText().equals(""))) {
					valueInRadians = Double.parseDouble(tx_ValueInRadians.getText());
					convertedValue = conversor.convertRadiansToDegres(valueInRadians);
					lblResult.setText("Result: " + convertedValue);					
					cleanTextFields();
					
				}else {
					lblResult.setText("Result: No value was informed!");
					cleanTextFields();
					
				}					
				
			}
		});
		btnToDegrees.setBounds(217, 233, 117, 25);
		frmConversor.getContentPane().add(btnToDegrees);
		
		
		lblResult.setBounds(84, 193, 250, 15);
		frmConversor.getContentPane().add(lblResult);
	
	
	}
	public void cleanTextFields() {
		tx_ValueInDegrees.setText("");
		tx_ValueInRadians.setText("");
		
	}
}

