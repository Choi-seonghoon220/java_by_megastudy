package ex05;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		MainFrame frame = new MainFrame();
		frame.setVisible(true);
	}
}
class MainFrame extends JFrame {
	MainFrame() {
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setupUi();
	}
	void setupUi() {
		this.setLayout(null);
		
		JLabel lblName = new JLabel("이름:");
		JTextField txtName = new JTextField(10);
		
		JLabel lblAddr = new JLabel("주소:");
		JTextField txtAddr = new JTextField(30);
		
		lblName.setLocation(50, 30);
		lblName.setSize(50, 20);
		
		txtName.setBounds(90, 30, 80, 20);
		
		lblAddr.setBounds(50, 60, 50, 20);
		txtAddr.setBounds(90, 60, 200, 20);
		
		add(lblName);
		add(txtName);
		add(lblAddr);
		add(txtAddr);
	}
}