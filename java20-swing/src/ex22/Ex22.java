package ex22;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Ex22 {

	public static void main(String[] args) {
		MainFrame frame = new MainFrame();
		frame.setVisible(true);
	}
}
class MainFrame extends JFrame {
	MainFrame() {
		setSize(400, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
//		this.addWindowListener(new WindowHandler() {
//			public void windowClosing(WindowEvent e) {
//				System.out.println("프로그램을 종료합니다.");
//				System.exit(0);
//			}
//		});
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		});
	}
}
//class WindowHandler implements WindowListener {
//
//	@Override
//	public void windowOpened(WindowEvent e) {
//		// TODO Auto-generated method stub
//	}
//	@Override
//	public void windowClosing(WindowEvent e) {
//		// TODO Auto-generated method stub
//	}
//	@Override
//	public void windowClosed(WindowEvent e) {
//		// TODO Auto-generated method stub
//	}
//	@Override
//	public void windowIconified(WindowEvent e) {
//		// TODO Auto-generated method stub
//	}
//	@Override
//	public void windowDeiconified(WindowEvent e) {
//		// TODO Auto-generated method stub
//	}
//	@Override
//	public void windowActivated(WindowEvent e) {
//		// TODO Auto-generated method stub
//	}
//	@Override
//	public void windowDeactivated(WindowEvent e) {
//		// TODO Auto-generated method stub
//	}
//}