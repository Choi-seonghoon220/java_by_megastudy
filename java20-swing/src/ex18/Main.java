package ex18;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

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
	}
	public void paint(Graphics g) {
		super.paint(g);
		ImageIcon icon = new ImageIcon("./image/phone01.png");
		
		g.drawImage(icon.getImage(), 50, 50, 100, 150, null);
		g.drawString("메가코딩학원", 50, 220);
	}
}