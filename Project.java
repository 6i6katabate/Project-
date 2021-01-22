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
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Project {

private JFrame frmOkoko;
private JTextField dayField;


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
dayField.setBounds(169, 137, 314, 34);
frmOkoko.getContentPane().add(dayField);
dayField.setColumns(10);

JTextArea textArea = new JTextArea();
textArea.setBounds(169, 238, 314, 34);
textArea.setBackground(Color.WHITE);
frmOkoko.getContentPane().add(textArea);



JButton SubmitBTN = new JButton("SUBMIT");
SubmitBTN.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {

String day = dayField.getText();

switch(day) {

case "Monday":

textArea.setText("Chest and Back"
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

textArea.setText("Arms and Shoulders"
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

textArea.setText("Legs"
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

textArea.setText("Rest day");

break;

case "Friday":

textArea.setText("Chest and Back"
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

textArea.setText("Arms and Forearms"
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

textArea.setText("Legs"
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

}

}
});
SubmitBTN.setBounds(490, 137, 89, 34);
SubmitBTN.setForeground(Color.BLACK);
SubmitBTN.setBackground(Color.YELLOW);
frmOkoko.getContentPane().add(SubmitBTN);



JLabel lblNewLabel = new JLabel("Enter day of the week");
lblNewLabel.setBounds(233, 86, 203, 40);
lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
frmOkoko.getContentPane().add(lblNewLabel);




}
}