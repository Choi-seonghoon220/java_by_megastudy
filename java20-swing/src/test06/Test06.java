package test06;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Test06 extends JFrame {

	public static void main(String[] args) {
		MainFrame frame = new MainFrame();
		frame.setVisible(true);
	}
}

class MainFrame extends JFrame {
	List<Score> scoreList;

	MainFrame() {
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		scoreList = loadData();
		init();
	}

	List<Score> loadData() {
		List<String> scoreList = null;
		List<Score> resultList = new ArrayList<>();

		try {
			scoreList = Files.readAllLines(Paths.get("./text/ban_bunho_irum_jumsu.txt"), Charset.forName("utf8"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		scoreList.forEach(str -> {
			resultList.add(new Score(str));
		});

		return resultList;
	}

	JTextArea textArea;
	JPanel centerPnl;
	JCheckBox ascendingCheck;
	
	boolean ascendingType = false;

	void init() {
		JPanel mainPnl = (JPanel) this.getContentPane();
		mainPnl.setBorder(new EmptyBorder(5, 5, 5, 5));

		JPanel topPnl = new JPanel();

		JComboBox banCombo = new JComboBox(this.getBan());
		banCombo.addActionListener(this::btnHandler);
        
		ascendingCheck = new JCheckBox("오름차순");
		
		topPnl.add(banCombo);
		topPnl.add(ascendingCheck);

		textArea = new JTextArea();
		centerPnl = new JScrollPnl(textArea);

		add(topPnl, "North");
		add(centerPnl, "Center");
	}

	String[] getBan() {
		Set<Integer> banSet = new TreeSet<>();

		scoreList.forEach(score -> {
			banSet.add(score.ban);
		});

		String[] arr = banSet.stream()
//		                     .sorted( (a,b)->a-b )
							 .map(v -> v + "반")
							 .toArray(String[]::new);

		return arr;
	}

	void btnHandler(ActionEvent e) {
		JComboBox tempComboBox = (JComboBox) e.getSource();

		String str = (String)tempComboBox.getSelectedItem();
		int ban = Integer.parseInt( str.substring(0, str.length()-1 ) );
		printScore(ban);
	}

	void printScore(int banNum) {
//		centerPnl.removeAll();
//		centerPnl.revalidate();
		
		textArea.setText("");

		textArea.append("번호 이름 국어 영어 수학 총점 평균\n");
		textArea.append("-----------------------------------------------\n");
		
//        List<Score> printList =
//		scoreList.stream()
//                 .filter( sc->sc.ban==banNum )
//                 .collect( Collectors.toList() );
//        
        		                       
        		                         
		List<Score> printList = new ArrayList<>();
		
		scoreList.forEach(score -> {
			if (banNum == score.ban) {
				printList.add(score);
			}
		});
		
		if ( this.ascendingCheck.isSelected() ) 
			printList.sort((a, b) -> a.num - b.num);
		else 
			printList.sort((a, b) -> b.num - a.num);
        
		
		printList.forEach(score -> {
			textArea.append(score.toString()+"\n");
		});
	}

	void chkHandler(ActionEvent e) {
		JCheckBox tempCheckBox = (JCheckBox) e.getSource();
		if (tempCheckBox.isSelected()) {
			ascendingType = true;
		} else {
			ascendingType = false;
		}
	}
}