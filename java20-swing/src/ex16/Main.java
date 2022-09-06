package ex16;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

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
	
	JTextArea txtArea;
	
	void setupUi() {
		FlowLayout layout = new FlowLayout(FlowLayout.RIGHT);
		JPanel pnlTop = new JPanel(layout);
		
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼1");
		
		btn1.addActionListener(e -> btn1Handler(e));
		btn2.addActionListener(e -> btn2Handler(e));
		
		pnlTop.add(btn1);
		pnlTop.add(btn2);
		
		txtArea = new JTextArea();
		txtArea.setBackground(Color.yellow);
		
		add(pnlTop, "North");
		add(txtArea, "Center");
	}
	void btn1Handler(ActionEvent e) {
		txtArea.append("메가코딩\n");
	}
	void btn2Handler(ActionEvent e) {
		txtArea.append("기가코딩\n");
	}
}