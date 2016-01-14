package appTerminarz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ReadPlan extends JPanel implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel info_file;
	private JTextArea text;
	private JButton odczytaj;
	
	/*KONSTRUKTOR*/
	public ReadPlan() {
		this.info_file = new JLabel("Enter the file name:");
		this.info_file.setBounds(10, 10, 240, 50);
		this.info_file.setFont(new Font("Arial", Font.CENTER_BASELINE, 12));
		
		this.text = new JTextArea("My Plan1.txt");
		this.text.setBounds(270, 25, 240, 25);
		this.text.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK, 2));
		
		this.odczytaj = new JButton("Wczytaj");
		this.odczytaj.setBounds(10, 80, 500, 30);
		this.odczytaj.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK, 2));
		this.odczytaj.addActionListener(this);
		
	}
	
	public String wczytaj() {
		String fileName = this.text.getText();
		BufferedReader reader = null;
		String template = "";
		try {
			reader = new BufferedReader(new FileReader(fileName));
			String tmp = null;
			while((tmp = reader.readLine()) != null) {
				template += tmp;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return template;	
	}

	/*GETTERY I SETTERY*/
	public JLabel getInfo_file() {
		return info_file;
	}

	public void setInfo_file(JLabel info_file) {
		this.info_file = info_file;
	}
	public JTextArea getText() {
		return text;
	}
	public void setText(JTextArea text) {
		this.text = text;
	}

	public JButton getOdczytaj() {
		return odczytaj;
	}

	public void setOdczytaj(JButton odczytaj) {
		this.odczytaj = odczytaj;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == odczytaj) {
			wynikFrame frame = new wynikFrame(wczytaj());
			frame.setVisible(true);
		}
		// TODO Auto-generated method stub
		
	}

}
