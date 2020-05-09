package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import eg.edu.alexu.csd.datastructure.mailServer.App;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class nameEdit extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
    private App app;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nameEdit frame = new nameEdit();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public nameEdit(App app) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 369, 236);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name ");
		lblNewLabel.setForeground(new Color(0, 139, 139));
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 21));
		lblNewLabel.setBounds(38, 32, 113, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name ");
		lblLastName.setForeground(new Color(0, 139, 139));
		lblLastName.setFont(new Font("Century Gothic", Font.PLAIN, 21));
		lblLastName.setBounds(38, 89, 113, 29);
		contentPane.add(lblLastName);
		
		textField = new JTextField();
		textField.setBounds(161, 32, 153, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(161, 89, 153, 29);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(app.signedInUser.setName(textField.getText(), textField_1.getText())) {
			   app.signedInUser.writeToFile();
			   dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "Invalid Name");	
				}
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(0, 206, 209));
		btnNewButton.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		btnNewButton.setBounds(48, 147, 113, 29);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBackground(new Color(255, 255, 255));
		btnCancel.setForeground(new Color(0, 206, 209));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		btnCancel.setBounds(182, 147, 113, 29);
		contentPane.add(btnCancel);
	}

}