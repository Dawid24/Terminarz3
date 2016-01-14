package appTerminarz;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ReadPlanFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*KONSTRUKTOR RAMKI PLAN, DODAWANIE ELEMENTOW*/
	public ReadPlanFrame() {
		ReadPlan read = new ReadPlan();
		setTitle("Plan dnia");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(950,70,550,200);
		Container contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		this.add(read.getInfo_file());
		this.add(read.getText());
		this.add(read.getOdczytaj());
	}

}