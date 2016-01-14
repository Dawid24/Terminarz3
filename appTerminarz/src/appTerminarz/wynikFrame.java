package appTerminarz;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class wynikFrame extends JFrame {
	
	public JTextArea text;
	public wynikFrame(String a) {
		
		setTitle("Plan");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(950,270,550,200);
		Container contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		this.text = new JTextArea(a);
		this.text.setBounds(10, 10, 500, 150);
		this.text.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK, 2));
		this.add(text);
	}

}
