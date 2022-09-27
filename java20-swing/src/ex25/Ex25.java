package ex25;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ex25 extends JFrame {

	public static void main(String[] args) {
		MainFrame frame = new MainFrame();
		frame.setVisible(true);
	}
}

class MainFrame extends JFrame {
	MainFrame() {
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		init();
	}
	void init() {
		JPanel panel = new JPanel();
		String[] arr = {"c언어", "파이썬", "자바", "델파이" };
		
		JComboBox combo = new JComboBox(arr);
		
		combo.addActionListener(this::btnHandler);
		
		panel.add(combo);
		
		add(panel);
	}
	void btnHandler(ActionEvent e) {
		JComboBox cmb = (JComboBox)e.getSource();
		
		int idx = cmb.getSelectedIndex();
		String str = cmb.getSelectedItem().toString();
		
		JOptionPane.showMessageDialog(null,  str + "(" + idx + ")");
	}
}