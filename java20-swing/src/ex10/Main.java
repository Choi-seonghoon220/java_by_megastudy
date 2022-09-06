package ex10;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
		JPanel pnlTop = new JPanel(new FlowLayout());
		JPanel pnlBottom = new JPanel();
		JPanel pnlSide = new JPanel(new GridLayout(0, 1, 0, 5));
		
		pnlTop.add(new JButton("메가"));
		pnlTop.add(new JButton("기가"));
		pnlTop.add(new JButton("테라"));
		
		pnlBottom.add(new JButton("파랑"));
		pnlBottom.add(new JButton("노랑"));
		pnlBottom.add(new JButton("빨강"));
		
		pnlSide.add(new JButton("1"));
		pnlSide.add(new JButton("2"));
		pnlSide.add(new JButton("3"));
		pnlSide.add(new JButton("4"));
		
		JLabel lbl = new JLabel("메가코딩컴퓨터학원");
		lbl.setHorizontalAlignment(JLabel.CENTER);
		
		add(pnlTop, "North");
		add(lbl, "Center");
		add(pnlBottom, "South");
		add(pnlSide, "West");
	}
}