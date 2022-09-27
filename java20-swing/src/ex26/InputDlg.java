package ex26;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class InputDlg extends JDialog {
	public InputDlg(JFrame frame, String title) {
		super(frame, title, true);
		this.setSize(400, 250);
//		this.setModal(true);
//		??무엇?
		this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.initUi();
	}

	Info info_data;
	JTextField txtName, txtPhone, txtAddr;

	void initUi() {
		JPanel pnl = (JPanel) this.getContentPane();
		pnl.setBorder(new EmptyBorder(5, 5, 5, 5));

		JButton btnOk = new JButton("확인");
		JButton btnCancel = new JButton("취소");

		btnOk.addActionListener(this::btnOkHandler);
		btnCancel.addActionListener(this::btnCancelHandler);

		JPanel pnl_top = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		pnl_top.add(btnOk);
		pnl_top.add(btnCancel);

		txtName = new JTextField(15);
		txtPhone = new JTextField(15);
		txtAddr = new JTextField(30);

		JPanel pnl_main = new JPanel(null);
		pnl_main.setBorder(new LineBorder(Color.gray));

		add(pnl_main, new JLabel("이름 : "), 20, 40, 50, 22);
		add(pnl_main, txtName, 70, 43, 150, 22);
		add(pnl_main, new JLabel("연락처 : "), 20, 75, 50, 22);
		add(pnl_main, txtPhone, 70, 78, 150, 22);
		add(pnl_main, new JLabel("주소 : "), 20, 107, 150, 22);
		add(pnl_main, txtAddr, 70, 110, 250, 22);
		add(pnl_top, "North");
		add(pnl_main, "Center");
	}
	void add(JPanel pnl, JComponent comp, int x, int y, int w, int h) {
		comp.setBounds(x, y, w, h);
		pnl.add(comp);
	}
	void btnOkHandler(ActionEvent e) {
		this.info_data = new Info(txtName.getText(), txtPhone.getText(), txtAddr.getText());
		this.dispose();
	}
	void btnCancelHandler(ActionEvent e) {
		this.info_data = null;
		this.dispose();
	}
	public Info execute() {
		this.setVisible(true);
		return this.info_data;
	}
}
