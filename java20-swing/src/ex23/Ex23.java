package ex23;

import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex23 extends JFrame {

	public static void main(String[] args) {
		MainFrame frame = new MainFrame();
		frame.setVisible(true);
	}
}
class MainFrame extends JFrame {
	MainFrame() {
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
        
		
	}
	void init() {
		JPanel panel = new JPanel();
		
		JRadioButton btn1 = new JRadioButton("1학년");
		JRadioButton btn2 = new JRadioButton("2학년");
		JRadioButton btn3 = new JRadioButton("3학년");
		
		btn1.setSelected(true);
		btn1.addActionListener(this::actionHandler);
		btn2.addActionListener(e -> actionHandler(e));
		btn3.addActionListener(this::actionHandler);
		
		ButtonGroup grp = new ButtonGroup();
		
		grp.add(btn1);
		grp.add(btn2);
		grp.add(btn3);
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		
		add(panel);
	}
	void actionHandler(ActionEvent e) {
		JRadioButton rdo = (JRadioButton)e.getSource();
		System.out.println(rdo.getText());
	}
}
