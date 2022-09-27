package test05;

import java.awt.event.ActionEvent;
import java.util.stream.IntStream;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Test05 extends JFrame {

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
	
	JTextArea textArea;
	
	void init() {
		JPanel mainPnl = (JPanel)this.getContentPane();
		
		JPanel topPnl = new JPanel();
		
//		String[] arr = IntStream.range(2, 10).mapToObj(n -> n + "단").toArray(String[]::new);
		
		String[] gugudanArr = { "2단", "3단", "4단", "5단", "6단", "7단", "8단", "9단" };
		JComboBox gugudanCombo = new JComboBox(gugudanArr);
		gugudanCombo.addActionListener(this::btnHandler);
		
		topPnl.add(gugudanCombo);
		
		textArea = new JTextArea();
		JPanel centerPnl = new JScrollPnl(textArea);
		
		add(topPnl, "North");
		add(centerPnl, "Center");
	}
	void btnHandler(ActionEvent e) {
		JComboBox tempComboBox = (JComboBox)e.getSource();
		
		this.textArea.setText("");
		
		int gugudanNumber = tempComboBox.getSelectedIndex()+2;
		
		this.textArea.append(printGugudan(gugudanNumber));
	}
	String printGugudan(int num) {
		String resultGugudan = "";
		
		for (int i = 1; i <= 9; i++) {
			resultGugudan += String.format("%d X %d = %d\n", num, i, num * i);
		}
		
		return resultGugudan;
	}
}