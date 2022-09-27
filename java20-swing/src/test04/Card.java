package test04;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Card extends JLabel {

	private int card_num;
	private boolean is_front;
	private ImageIcon img_front;
	private ImageIcon img_back;
	static final int img_width = 100;
	static final int img_height = 110;

	public Card(int card_num) {
		this.card_num = card_num;

		Image tempFrontImage = new ImageIcon("./image/test04/card" + card_num + ".png").getImage().getScaledInstance(img_width, img_height, Image.SCALE_SMOOTH);
		Image tempBackImage = new ImageIcon("./image/test04/back.png").getImage().getScaledInstance(img_width,
				img_height, Image.SCALE_SMOOTH);

		this.img_front = new ImageIcon(tempFrontImage);
		this.img_back = new ImageIcon(tempBackImage);

//		this.is_front = true;
		this.is_front = false;
		this.imageChange();
		
	}

	boolean isFront() {
		return this.is_front;
	}

	void setFront(boolean front) {
		this.is_front = front;
		this.imageChange();
	}

	void imageChange() {
		if (this.is_front)
			this.setIcon(this.img_front);
		else
			this.setIcon(this.img_back);
	}
    int getNumber() {
    	return this.card_num;
    }
	ImageIcon getImgFront() {
		return this.img_front;
	}
	ImageIcon getImgBack() {
		return this.img_back;
	}
	
}
