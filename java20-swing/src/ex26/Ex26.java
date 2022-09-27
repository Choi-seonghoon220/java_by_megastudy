package ex26;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Ex26 extends JFrame {

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
	JTextArea txtArea;
	
	void init() {
		JPanel pnl = (JPanel)this.getContentPane();
		pnl.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JButton btn = new JButton("추가");
		btn.addActionListener(this::btnHandler);
		
		JPanel pnl_top = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		pnl_top.add(btn);
		txtArea = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(txtArea);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		add(pnl_top, "North");
		add(scrollPane, "Center");
	}
	void btnHandler(ActionEvent e) {
		InputDlg dlg = new InputDlg(this, "자료입력");
		Info info = dlg.execute();
		if (info != null) {
			String str = info.name + " " + info.phone + " " + info.addr;
			this.txtArea.append(str + "\n");
		}
	}
}