package ex02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


class UserHandler implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("1111");
	}
}
public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn1 = new JButton("First");
		JButton btn2 = new JButton("Second");
		JButton btn3 = new JButton("third");
		JButton btn4 = new JButton("fourth");
		btn1.addActionListener(new UserHandler());
		btn2.addActionListener( e->System.out.println("qqqq") );
		btn3.addActionListener( Main::proce );
		btn4.addActionListener(new UserHandler() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("4444");
			}
		});
		
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		
		frame.setVisible(true);
	}
	static void proce( ActionEvent e) {
	    System.out.println("rrrr");	
	}

}
