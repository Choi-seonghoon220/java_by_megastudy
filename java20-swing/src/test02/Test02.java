package test02;

import java.awt.Color;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Test02 {

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
	
	JTextArea textArea;
	
	void setupUi() {
		JPanel mainPnl = (JPanel) this.getContentPane();
		Border mainBorder = new EmptyBorder(5, 5, 5, 5);
		mainPnl.setBorder(mainBorder);
//		this.setContentPane(mainPnl);
		
		textArea = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(textArea);
		
		JPanel rightPnl = new JPanel();
		BoxLayout rightLayout = new BoxLayout(rightPnl, BoxLayout.Y_AXIS);
		rightPnl.setLayout(rightLayout);
		Border rightOutBorder = new CompoundBorder(new EmptyBorder(0, 3, 0, 0), new LineBorder(Color.gray));
		rightPnl.setBorder(new CompoundBorder(rightOutBorder, new EmptyBorder(3, 5, 3, 5)));
		
		JButton btn1 = new JButton("확인");
		JButton btn2 = new JButton("취소");
		rightPnl.add(btn1);
		rightPnl.add(Box.createVerticalStrut(3));
		rightPnl.add(btn2);
		
		JPanel bottomPnl = new JPanel();
		JLabel bottomLbl = new JLabel("메가코딩컴퓨터학원");
		bottomLbl.setFont(new Font(null, Font.BOLD, 12));
		bottomPnl.add(bottomLbl);
		
		mainPnl.add(scrollPane, "Center");
		mainPnl.add(rightPnl, "East");
		mainPnl.add(bottomLbl, "South");
		
	}
}