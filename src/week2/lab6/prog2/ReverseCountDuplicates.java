package week2.lab6.prog2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.awt.event.ActionEvent;

public class ReverseCountDuplicates extends JFrame {

	private JPanel contentPane;
	private JTextField inputTextField;
	private JTextField outputTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReverseCountDuplicates frame = new ReverseCountDuplicates();
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
	public ReverseCountDuplicates() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 313);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton countButton = new JButton("Count Letters");
		countButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = inputTextField.getText();
				outputTextField.setText("" + s.length()); 
			}
		});
		countButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		countButton.setBounds(79, 49, 153, 39);
		contentPane.add(countButton);
		
		JButton reverseButton = new JButton("Reverse Letters");
		reverseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = inputTextField.getText();
				StringBuilder reversed = new StringBuilder();
				reversed.append(input);
				reversed.reverse();
				outputTextField.setText(reversed.toString()); 
			}
		});
		reverseButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		reverseButton.setBounds(79, 98, 153, 39);
		contentPane.add(reverseButton);
		
		JButton removeDupButton = new JButton("Remove Duplicates");
		removeDupButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = inputTextField.getText();
				String output = "";
				for(int i = 0; i < input.length(); i++) {
					if(!output.contains(String.valueOf(input.charAt(i)))) {
						output += String.valueOf(input.charAt(i));
					} 
				}
				outputTextField.setText(output); 
			}
		});
		removeDupButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		removeDupButton.setBounds(79, 147, 153, 39);
		contentPane.add(removeDupButton);
		
		inputTextField = new JTextField();
		inputTextField.setBounds(262, 78, 238, 30);
		contentPane.add(inputTextField);
		inputTextField.setColumns(10);
		
		outputTextField = new JTextField();
		outputTextField.setColumns(10);
		outputTextField.setBounds(262, 132, 238, 30);
		contentPane.add(outputTextField);
		
		JLabel lblNewLabel = new JLabel("Input");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(262, 55, 62, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblOutput = new JLabel("Output");
		lblOutput.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblOutput.setBounds(262, 111, 62, 26);
		contentPane.add(lblOutput);
	}

}
