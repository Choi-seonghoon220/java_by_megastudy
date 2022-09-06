package ex19;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
	void setupUi() {
		UserPanel panel = new UserPanel();
		add(panel);
	}
}
class UserPanel extends JPanel {
	public void paint(Graphics g) {
		super.paint(g);
		ImageIcon icon = new ImageIcon("./image/phone01.png");
		
		g.drawImage(icon.getImage(), 50, 50, 100, 150, null);
		
		g.setColor(Color.blue);g.setFont(new Font("굴림체", Font.PLAIN, 20));
		g.drawString("메가코딩학원", 50, 220);
	}
}