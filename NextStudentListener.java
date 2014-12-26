package callout;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class NextStudentListener implements ActionListener{

	JLabel label;
	Students students;
	
	public NextStudentListener(JLabel label, Students students) {
		this.label = label;
		this.students = students;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		if (source.getText().equals("Sljedeći/a"))
		{
			label.setText(students.getRandomStudent());
		}
		else
		{
			System.exit(0);
		}
	}

}
