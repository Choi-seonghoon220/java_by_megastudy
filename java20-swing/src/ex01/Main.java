package ex01;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main{

	public static void main(String[] args) {
          MyFrame frame = new MyFrame();
          
          frame.setVisible(true);
  	   
	}

}

class MyFrame extends JFrame{
	MyFrame(){
		this.setLocation(100,200);
		this.setSize(400,400);
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        this.setupUi();
	}
	void setupUi() {
		
		
		this.setLayout( new GridLayout( 0,1 ) );
        
		JButton btn1 = new JButton("South");
		JButton btn2 = new JButton("North");
		JButton btn3 = new JButton("West");
		JButton btn4 = new JButton("East");
		JButton btn5 = new JButton("Center");
		
		
		this.add( btn1 );
		this.add( btn2 );
		this.add( btn3 );
		this.add( btn4 );
		this.add( btn5 );
		
	}
}
