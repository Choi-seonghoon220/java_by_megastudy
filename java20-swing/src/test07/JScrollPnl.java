package test07;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class JScrollPnl extends JPanel {

	/**
	 * Create the panel.
	 */
	public JScrollPnl(JTextArea textArea) {
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		add(scrollPane);
		
		scrollPane.setViewportView(textArea);

	}

}
