package appTerminarz;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PlanAddFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/*KONSTRUKTOR RAMKI NOTATKI_EDIT, DODAWANIE ELEMENTOW*/
	public PlanAddFrame() {
		PlanAdd plan = new PlanAdd();
		setTitle("Plan");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(950,70,550,500);
		Container contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		this.add(plan.getInfo_file());
		this.add(plan.getText());
		this.add(plan.getInfo_year());
		this.add(plan.getPlan_year());
		this.add(plan.getInfo_month());
		this.add(plan.getPlan_month());
		this.add(plan.getInfo_week());
		this.add(plan.getPlan_week());
		this.add(plan.getInfo_day());
		this.add(plan.getPlan_day());
		this.add(plan.getInfo_hours());
		this.add(plan.getPlan_hours());
		this.add(plan.getText1());
		this.add(plan.getInfo_hours1());
		this.add(plan.getPlan_hours1());
		this.add(plan.getText2());
		this.add(plan.getInfo_hours2());
		this.add(plan.getPlan_hours2());
		this.add(plan.getText3());
		this.add(plan.getButton());
	}

}
