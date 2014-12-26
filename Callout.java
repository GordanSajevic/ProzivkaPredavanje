package callout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Callout {
	
	public static void main(String[] args)
	{
		Students students = new Students();
		JFrame mainWindow = new JFrame("Prozivka");
		JButton button = new JButton("Sljedeći/a");
		JButton button2 = new JButton("Izlaz");
		JLabel label = new JLabel();
		NextStudentListener listener = new NextStudentListener(label, students);
		button.addActionListener(listener);
		button2.addActionListener(listener);
		mainWindow.setVisible(true);
		mainWindow.setSize(400, 300);
		label.setText(students.getRandomStudent());
		label.setHorizontalAlignment(SwingConstants.CENTER);
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(button, BorderLayout.PAGE_START);
		panel.add(button2, BorderLayout.PAGE_END);
		panel.add(label, BorderLayout.CENTER);
		mainWindow.setContentPane(panel);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
