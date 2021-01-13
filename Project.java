package pin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Window.Type;

public class Project {

	private JFrame frmOkoko;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project window = new Project();
					window.frmOkoko.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Project() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmOkoko = new JFrame();
		frmOkoko.setTitle("Fitness program\r\n");
		frmOkoko.setFont(new Font("Arial", Font.PLAIN, 12));
		frmOkoko.setBounds(100, 100, 702, 409);
		frmOkoko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmOkoko.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(166, 137, 314, 34);
		frmOkoko.getContentPane().add(textArea);
		
		JButton SubmitBTN = new JButton("New button");
		SubmitBTN.setBounds(490, 137, 89, 34);
		frmOkoko.getContentPane().add(SubmitBTN);
		
		textField = new JTextField();
		textField.setBounds(166, 209, 314, 34);
		frmOkoko.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter day of the week");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(233, 86, 203, 40);
		frmOkoko.getContentPane().add(lblNewLabel);
		
		
		
		
	}
}
