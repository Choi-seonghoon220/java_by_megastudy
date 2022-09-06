package ex12;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		MainFrame frame = new MainFrame();
		frame.setVisible(true);
	}
}
class MainFrame extends JFrame {
	MainFrame() {
		setSize(200, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setupUi();
	}
	void setupUi() {
		JPanel pnl = new JPanel();
		BoxLayout layout = new BoxLayout(pnl, BoxLayout.Y_AXIS);
		pnl.setLayout(layout);
		
		JButton btn1 = new JButton("메가");
		JButton btn2 = new JButton("기가");
		JButton btn3 = new JButton("테라");
		
		pnl.add(btn1);
		pnl.add(btn2);
		pnl.add(btn3);
		
		this.add(pnl);
	}
}