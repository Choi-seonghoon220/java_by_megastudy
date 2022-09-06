package test01;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
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
		JPanel mainPnl =  (JPanel)this.getContentPane();
		Border border = new EmptyBorder(5, 5, 5, 5);
		
		mainPnl.setBorder(border);
		this.setContentPane(mainPnl);

		JPanel topPnl = new JPanel();
		Border topBorder = BorderFactory.createCompoundBorder(new LineBorder(Color.gray), new EmptyBorder(3, 3, 3, 3) );
		topPnl.setBorder( new CompoundBorder( new EmptyBorder(0,0,3,0),topBorder));
		
		BoxLayout topLayout = new BoxLayout(topPnl, BoxLayout.X_AXIS);
		topPnl.setLayout(topLayout);
		
		JLabel lblName = new JLabel( "메가코딩학원" );
		lblName.setForeground(Color.blue);
		lblName.setFont(new Font(null, Font.PLAIN, 20));
		
		JButton btn1 = new JButton("확인");
		JButton btn2 = new JButton("취소");
		
		topPnl.add(lblName);
		topPnl.add(Box.createHorizontalGlue());
		topPnl.add(btn1);
		topPnl.add(Box.createHorizontalStrut(3));
		topPnl.add(btn2);
		
		txtArea = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(txtArea);
		
		mainPnl.add(topPnl, "North");
		mainPnl.add(scrollPane, "Center");
	}
}