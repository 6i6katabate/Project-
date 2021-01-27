 package pin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;

public class Project {

private JFrame frmOkoko;
private JTextField dayField;
private final JScrollPane scrollPane_1 = new JScrollPane();
private JTextArea textArea_1;

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
frmOkoko.getContentPane().setForeground(Color.BLACK);
frmOkoko.setForeground(Color.GRAY);
frmOkoko.setBackground(Color.CYAN);
frmOkoko.getContentPane().setBackground(Color.PINK);
frmOkoko.setTitle("Fitness program\r\n");
frmOkoko.setFont(new Font("Arial", Font.PLAIN, 12));
frmOkoko.setBounds(100, 100, 702, 409);
frmOkoko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frmOkoko.getContentPane().setLayout(null);

dayField = new JTextField();
dayField.setBounds(106, 137, 377, 34);
frmOkoko.getContentPane().add(dayField);
dayField.setColumns(10);
 textArea_1 = new JTextArea();
textArea_1.setBackground(Color.WHITE);
scrollPane_1.setColumnHeaderView(textArea_1);

JLabel lblNewLabel = new JLabel("Enter day of the week");
lblNewLabel.setBounds(94, 83, 387, 40);
lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
frmOkoko.getContentPane().add(lblNewLabel);
JScrollPane scrollPane = new JScrollPane();
scrollPane.setBounds(522, 274, 57, -20);
frmOkoko.getContentPane().add(scrollPane);
scrollPane_1.setBounds(106, 197, 377, 135);
frmOkoko.getContentPane().add(scrollPane_1);


scrollPane_1.setViewportView(textArea_1);


JButton SubmitBTN = new JButton("SUBMIT");
SubmitBTN.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
	

String day = dayField.getText();

switch(day) {

case "Monday":

textArea_1.setText("Chest and Back\r\n"
		+ "Bench press – 5 sets, 6-10 reps\r\n"
		+ "Front wide-grip chin-ups – 6 sets, to failure\r\n"
		+ "Flat bench flies – 5 sets, 6-10 reps\r\n"
		+ "T-bar rows – 5 sets, 6-10 reps\r\n"
		+ "Incline bench press – 6 sets, 6-10 reps\r\n"
		+ "Seated pulley rows – 6 sets, 6-10 reps\r\n"
		+ "Cable crossovers – 6 sets, 10-12 reps\r\n"
		+ "One-arm dumbbell rows – 5 sets, 6-10 reps\r\n"
		+ "Dips – 5 sets, to failure\r\n"
		+ "Straight-leg deadlifts – 6 sets, 15 reps\r\n"
		+ "Dumbbell pullovers – 5 sets, 10-12 reps");
break;

case "Tuesday":

textArea_1.setText("Arms and Shoulders\r\n"
		+ "Barbell curls – 6 sets, 6-10 reps\r\n"
		+ "Seated dumbbell curls – 6 sets, 6-10 reps\r\n"
		+ "Dumbbell concentration curls – 6 sets, 6-10 reps"
		+ "Close-grip bench presses (for the all three heads) – 6 sets, 6-10 reps\r\n"
		+ "Pushdowns (exterior head) – 6 sets, 6-10 reps\r\n"
		+ "Barbell French presses (interior head) – 6 sets, 6-10 reps\r\n"
		+ "One-arm dumbbell triceps extensions (exterior head) – 6 sets, 6-10 reps"
		+ "Seated barbell presses – 6 sets, 6-10 reps\r\n"
		+ "Lateral raises (standing) – 6 sets, 6-10 reps\r\n"
		+ "Rear-delt lateral raises – 5 sets, 6-10 reps\r\n"
		+ "Cable lateral raises – 5 sets, 10-12 reps");

break;

case "Wednesday":

textArea_1.setText("Legs\r\n"
		+ "Squats – 6 sets, 8-12 reps\r\n"
		+ "Leg presses – 6 sets, 8-12 reps\r\n"
		+ "Leg extensions – 6 sets, 12-15 reps\r\n"
		+ "Leg curls – 6 sets, 10-12 reps\r\n"
		+ "Barbell lunges – 5 sets, 15 reps"
		+ "Standing calf raises -10 sets, 10 reps\r\n"
		+ "Seated calf raises – 8 sets, 15 reps\r\n"
		+ "One-legged calf raises (holding dumbbells) – 6 sets,12 reps");

break;

case "Thursday":

textArea_1.setText("Rest day");

break;

case "Friday":

textArea_1.setText("Chest and Back\r\n"
		+ "Bench press – 5 sets, 6-10 reps\r\n"
		+ "Front wide-grip chin-ups – 6 sets, to failure\r\n"
		+ "Flat bench flies – 5 sets, 6-10 reps\r\n"
		+ "T-bar rows – 5 sets, 6-10 reps\r\n"
		+ "Incline bench press – 6 sets, 6-10 reps\r\n"
		+ "Seated pulley rows – 6 sets, 6-10 reps\r\n"
		+ "Cable crossovers – 6 sets, 10-12 reps\r\n"
		+ "One-arm dumbbell rows – 5 sets, 6-10 reps\r\n"
		+ "Dips – 5 sets, to failure\r\n"
		+ "Straight-leg deadlifts – 6 sets, 15 reps\r\n"
		+ "Dumbbell pullovers – 5 sets, 10-12 reps");

break;

case "Saturday":

textArea_1.setText("Arms and Forearms\r\n"
		+ "Barbell curls – 6 sets, 6-10 reps\r\n"
		+ "Seated dumbbell curls – 6 sets, 6-10 reps\r\n"
		+ "Dumbbell concentration curls – 6 sets, 6-10 reps"
		+ "Close-grip bench presses (for the all three heads) – 6 sets, 6-10 reps\r\n"
		+ "Pushdowns (exterior head) – 6 sets, 6-10 reps\r\n"
		+ "Barbell French presses (interior head) – 6 sets, 6-10 reps\r\n"
		+ "One-arm dumbbell triceps extensions (exterior head) – 6 sets, 6-10 reps"
		+ "Wrist curls (forearms on knees) – 4 sets, 10 reps\r\n"
		+ "Reverse barbell curls – 4 sets, 8 reps\r\n"
		+ "Wright roller machine – to failure");

break;

case "Sunday":

textArea_1.setText("Legs\r\n"
		+ "Squats – 6 sets, 8-12 reps\r\n"
		+ "Leg presses – 6 sets, 8-12 reps\r\n"
		+ "Leg extensions – 6 sets, 12-15 reps\r\n"
		+ "Leg curls – 6 sets, 10-12 reps\r\n"
		+ "Barbell lunges – 5 sets, 15 reps"
		+ "Standing calf raises -10 sets, 10 reps\r\n"
		+ "Seated calf raises – 8 sets, 15 reps\r\n"
		+ "One-legged calf raises (holding dumbbells) – 6 sets,12 reps");

break;

default:
	JOptionPane.showMessageDialog(null, "Invalid input!",
		      "Error", JOptionPane.ERROR_MESSAGE);
}

}
});
SubmitBTN.setBounds(490, 137, 89, 34);
SubmitBTN.setForeground(Color.BLACK);
SubmitBTN.setBackground(Color.YELLOW);
frmOkoko.getContentPane().add(SubmitBTN);





}
}