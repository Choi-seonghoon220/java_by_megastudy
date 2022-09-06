package ex08;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		MainFrame frame = new MainFrame();
		frame.setVisible(true);
	}
}
class MainFrame extends JFrame {
	MainFrame() {
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setupUi();
	}
	void setupUi() {
		GridLayout layout = new GridLayout(1, 0, 10, 0);
		setLayout(layout);
		
		JButton btn1 = new JButton("one");
		JButton btn2 = new JButton("two");
		JButton btn3 = new JButton("three");
		JButton btn4 = new JButton("four");
		JButton btn5 = new JButton("five");
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
	}
}