package test08;

import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Test08 extends JFrame {

	public static void main(String[] args) {
		MainFrame frame = new MainFrame();
		frame.setVisible(true);
	}
}

class MainFrame extends JFrame {
	MainFrame() {
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		init();
	}

	JTextArea textArea;
	JPanel centerPnl;

	void init() {
		JPanel mainPnl = (JPanel) this.getContentPane();
		mainPnl.setBorder(new EmptyBorder(5, 5, 5, 5));

		JPanel topPnl = new JPanel();
		
		JRadioButton rdoBtn1 = new JRadioButton("속리산");
		JRadioButton rdoBtn2 = new JRadioButton("지리산");
		JRadioButton rdoBtn3 = new JRadioButton("설악산");
		
		rdoBtn1.addActionListener(this::actionHandler);
		rdoBtn2.addActionListener(this::actionHandler);
		rdoBtn3.addActionListener(this::actionHandler);
		
		ButtonGroup grp = new ButtonGroup();
		
		grp.add(rdoBtn1);
		grp.add(rdoBtn2);
		grp.add(rdoBtn3);
		
		topPnl.add(rdoBtn1);
		topPnl.add(rdoBtn2);
		topPnl.add(rdoBtn3);

		textArea = new JTextArea();
		centerPnl = new JScrollPnl(textArea);

		add(topPnl, "North");
		add(centerPnl, "Center");
	}
	void actionHandler(ActionEvent e) {
		textArea.setText("");
		
		JRadioButton rdo = (JRadioButton)e.getSource();
		
		try {
			List<String> list = Files.readAllLines( Paths.get("./text/" + rdo.getText() + ".txt" ), Charset.defaultCharset() );

			list.forEach(str -> {
				textArea.append(str + "\n");
			});
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		textArea.append(rdo.getText());
	}

}