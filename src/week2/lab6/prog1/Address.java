package week2.lab6.prog1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Address extends JFrame {

	private JPanel contentPane;
	private JTextField nameTextField;
	private JTextField streetTextField;
	private JTextField cityTextField;
	private JTextField stateTextField;
	private JTextField zipTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Address frame = new Address();
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
	public Address() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 242);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nameLabel = new JLabel("Name");
		nameLabel.setBounds(35, 26, 45, 13);
		contentPane.add(nameLabel);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(35, 41, 138, 33);
		contentPane.add(nameTextField);
		nameTextField.setColumns(10);
		
		streetTextField = new JTextField();
		streetTextField.setColumns(10);
		streetTextField.setBounds(194, 41, 106, 33);
		contentPane.add(streetTextField);
		
		JLabel streetLabel = new JLabel("Street");
		streetLabel.setBounds(194, 26, 45, 13);
		contentPane.add(streetLabel);
		
		cityTextField = new JTextField();
		cityTextField.setColumns(10);
		cityTextField.setBounds(333, 41, 106, 33);
		contentPane.add(cityTextField);
		
		JLabel cityLabel = new JLabel("City");
		cityLabel.setBounds(333, 26, 45, 13);
		contentPane.add(cityLabel);
		
		stateTextField = new JTextField();
		stateTextField.setColumns(10);
		stateTextField.setBounds(116, 99, 123, 33);
		contentPane.add(stateTextField);
		
		JLabel stateLabel = new JLabel("State");
		stateLabel.setBounds(116, 84, 45, 13);
		contentPane.add(stateLabel);
		
		zipTextField = new JTextField();
		zipTextField.setColumns(10);
		zipTextField.setBounds(255, 99, 106, 33);
		contentPane.add(zipTextField);
		
		JLabel zipLabel = new JLabel("Zip");
		zipLabel.setBounds(255, 84, 45, 13);
		contentPane.add(zipLabel);
		
		JButton submitButton = new JButton("Submit");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(nameTextField.getText());
				System.out.println(streetTextField.getText());
				System.out.println(cityTextField.getText() + ", " +stateTextField.getText() +" " + zipTextField.getText());
			}
		});
		submitButton.setBounds(194, 150, 94, 33);
		contentPane.add(submitButton);
	}
}
