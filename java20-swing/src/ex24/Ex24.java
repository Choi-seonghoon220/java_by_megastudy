package ex24;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ex24 extends JFrame {

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

	JCheckBox chk1, chk2, chk3;

	void init() {
		setLayout(new FlowLayout());

		JPanel pnlFruit = new JPanel(new GridLayout(0, 1));
		pnlFruit.setBorder(BorderFactory.createTitledBorder("과일"));

		JCheckBox chkGender = new JCheckBox("남자");

		chk1 = new JCheckBox("사과");
		chk2 = new JCheckBox("포도");
		chk3 = new JCheckBox("수박");

		JButton btn = new JButton("확인");

		chkGender.addActionListener(this::genderHandler);
		btn.addActionListener(e -> btnHandler());

		pnlFruit.add(chk1);
		pnlFruit.add(chk2);
		pnlFruit.add(chk3);

		add(chkGender);
		add(pnlFruit);
		add(btn);
	}

	void genderHandler(ActionEvent e) {
		JCheckBox chk = (JCheckBox) e.getSource();
		if (chk.isSelected()) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
	}

	void btnHandler() {
		String st = "";
		if (chk1.isSelected()) {
			st = st + "사과";
		}
		if (chk2.isSelected()) {
			st = st + "포도";
		}
		if (chk3.isSelected()) {
			st = st + "수박";
		}

		JOptionPane.showMessageDialog(null, st);
	}
}