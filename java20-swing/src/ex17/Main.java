package ex17;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		MainFrame frame = new MainFrame();
		frame.setVisible(true);
	}
}
class MainFrame extends JFrame {
	MainFrame() {
		setSize(500, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setupUi();
	}
	
	JTextArea txtArea;
	JTextField txtName, txtPhone;
	
	void setupUi() {
		JPanel pnlMain = new JPanel(new BorderLayout());
		Border border = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		pnlMain.setBorder(border);
		this.setContentPane(pnlMain);
		
		JPanel pnlTop = new JPanel();
		
		txtName = new JTextField(10);
		txtPhone = new JTextField(10);
		
		JButton btn = new JButton("확인");
		btn.addActionListener(this::btnHandler);
		
		pnlTop.add(new JLabel("이름:"));
		pnlTop.add(txtName);
		
		pnlTop.add(new JLabel("연락처:"));
		pnlTop.add(txtPhone);
		pnlTop.add(btn);
		
		txtArea = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(txtArea);
		add(pnlTop, "North");
		add(scrollPane, "Center");
//		add(txtArea, "Center");
	}
	void btnHandler(ActionEvent e) {
		txtArea.append(txtName.getText() + " " + txtPhone.getText() + "\n");
	}
}