package test03;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Test03 {

	public static void main(String[] args) {
		MainFrame frame = new MainFrame();
		frame.setVisible(true);
	}
}

class MainFrame extends JFrame {
	static int count = 0;

	MainFrame() {
		setTitle("섬");
		setSize(600, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setupUi();
	}

	void setupUi() {
		JPanel mainPnl = (JPanel) this.getContentPane();
		mainPnl.setBorder(new EmptyBorder(50, 50, 50, 50));
		GridLayout layout = new GridLayout(0, 5, 10, 10);
		mainPnl.setLayout(layout);
		
		JLabel imgLabel = new JLabel();
		
//		imgLabel.setIcon(new ImageIcon("./image/island.png"));
//		imgLabel.setBounds(0, 0, 90, 90);
//		imgLabel.setSize(90, 90);
//		mainPnl.add(imgLabel);
	}

	public void paint(Graphics g) {
		super.paint(g);
		ImageIcon island = new ImageIcon("./image/island.png");
        Color[] colors = { Color.red, Color.blue, Color.magenta };
        int c = 0;       
 		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				g.drawImage(island.getImage(), 50 + 100 * j, 50 + 100 * i, 90, 90, Color.gray, null);
                g.setColor( colors[c]);
                c = (c + 1) % 3;
				g.setFont(new Font(null, Font.PLAIN, 15));
				g.drawString("메가코딩학원", 52 + 100 * j, 65 + 100 * i);
			}
		}
	}
}