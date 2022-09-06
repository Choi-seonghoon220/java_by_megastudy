package ex06;

import java.awt.FlowLayout;

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
		FlowLayout layout = new FlowLayout();
		setLayout(layout);
		
		JButton btn1 = new JButton("메가");
		JButton btn2 = new JButton("기가");
		JButton btn3 = new JButton("테라");
		
		add(btn1);
		add(btn2);
		add(btn3);
	}
}