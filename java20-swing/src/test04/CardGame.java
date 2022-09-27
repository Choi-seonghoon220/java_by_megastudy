package test04;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class CardGame extends JFrame {

	static Card[] cardArr = new Card[16];

	CardGame() {
		setSize(455, 600);
		setLocationRelativeTo(null);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setupUi();
		startGame();
		
		replayBtn.addActionListener(e -> startGame());
		
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		});
	}

	JPanel centerPnl;
	JButton replayBtn;

	void setupUi() {

		JPanel mainPnl = (JPanel) this.getContentPane();
		mainPnl.setBorder(new EmptyBorder(5, 5, 5, 5));

		// TopPanel
		JPanel topPnl = new JPanel();
		topPnl.setBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5), new LineBorder(Color.gray)));
		FlowLayout topLayout = new FlowLayout(FlowLayout.RIGHT);
		topPnl.setLayout(topLayout);

		replayBtn = new JButton("Replay");
		topPnl.add(replayBtn);

		// CenterPanel
		centerPnl = new JPanel();
		centerPnl.setBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5), new LineBorder(Color.gray)));
		GridLayout centerLayout = new GridLayout(4, 4, 5, 5);
		centerPnl.setLayout(centerLayout);

		// BottomPanel
		JPanel bottomPnl = new JPanel();
		bottomPnl.setBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5), new LineBorder(Color.gray)));

		JLabel nameLbl = new JLabel("메가코딩컴퓨터학원");
		nameLbl.setFont(new Font(null, Font.PLAIN, 15));
		bottomPnl.add(nameLbl);

		mainPnl.add(topPnl, "North");
		mainPnl.add(centerPnl, "Center");
		mainPnl.add(bottomPnl, "South");
	}

	ArrayList<Card> twoOpenedCardList = new ArrayList<>();
	ArrayList<Card> cardList;
	int countCollectCard = 0;

	void startGame() {
		centerPnl.removeAll();
		centerPnl.revalidate();

		MouseListener listener = new MouseAdapter() {
//			public void mouseClicked(MouseEvent e) {
			// mouseClicked보다 mousePressed가 반응이 훨씬 빠르다
			public void mousePressed(MouseEvent e) {
				Card card = (Card) e.getSource();
				changeCard(card);
				if (countCollectCard == 8) {
					System.out.println("성공");
					
					for (int i = 0; i < 15; i++) {
						Card c = cardList.get(i);
						TimerTask task = new TimerTask() {
							public void run() {
								c.setIcon(c.getImgBack());
							}
						};
						Timer timer = new Timer(true);
						timer.schedule(task, 100, 100);
					}
				}
			}
		};

//		ArrayList<Card> cardList = new ArrayList<Card>();
		cardList = new ArrayList<Card>();

		Integer[] arr = this.getRandomNum(8, 1, 16);

		for (int v : arr) {
			cardList.add(new Card(v));
			cardList.add(new Card(v));
		}

		arr = this.getRandomNum(16, 0, 15);

		for (int v : arr) {
			Card card = cardList.get(v);
			card.addMouseListener(listener);
			centerPnl.add(card);
		}
	}

	void changeCard(Card card) {
		if (card.isFront())
			return;
		card.setFront(true);
		this.twoOpenedCardList.add(card);

		if (this.twoOpenedCardList.size() == 1) {
			return;
		}

		if (twoOpenedCardList.get(0).getNumber() != twoOpenedCardList.get(1).getNumber()) {
			
			Card[] arr = twoOpenedCardList.toArray(Card[]::new); // n->new Card[n]
			
			this.twoOpenedCardList.clear();
			
			TimerTask task = new TimerTask() {
				public void run() {
					arr[0].setFront(false);
					arr[1].setFront(false);
				}
			};
			
			Timer timer = new Timer();
			timer.schedule(task, 500);
			
		} else {
			countCollectCard++;
			this.twoOpenedCardList.clear();
		}
	}

	// LinkedHashSet하면 안에 있는지 자동으로 확인 가능
	Integer[] getRandomNum(int length, int startNumber, int endNumber) {
		Set<Integer> randomNumberSet = new LinkedHashSet<>();
		int randomNumber;

		while (randomNumberSet.size() < length) {
			randomNumber = (int) (Math.random() * (endNumber - startNumber + 1)) + startNumber;
			randomNumberSet.add(randomNumber);
		}
		return randomNumberSet.toArray(Integer[]::new);
	}
}
	// Set으로 하기 전에 만든 randomList
//	static ArrayList<Integer> getRandomList(int endNumber, int length, boolean ascendingOrder) {
//		ArrayList<Integer> resultRandomList = new ArrayList<>();
//		int randomNumber;
//
//		while (resultRandomList.size() < length) {
//			randomNumber = (int) (Math.random() * (endNumber) + 1);
//			if (!resultRandomList.contains(randomNumber)) {
//				resultRandomList.add(randomNumber);
//			}
//		}
//
//		if (ascendingOrder) {
//			resultRandomList.sort((a, b) -> a.compareTo(b));
//		}
//		return resultRandomList;
//	}
