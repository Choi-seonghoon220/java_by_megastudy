package ex03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		MainFrame frame = new MainFrame();
		frame.setVisible(true);
	}
}
class MainFrame extends JFrame {
	public MainFrame() {
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setupUi();
	}
	void setupUi() {
		JButton btn = new JButton("확인");
		btn.addActionListener(new ButtonHandler());
		this.add(btn);
	}
}
class ButtonHandler implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("메가코딩");
	}
	
}