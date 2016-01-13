package appTerminarz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PlanAdd extends JPanel implements ActionListener {
	
	private JLabel info_file; 
	private JTextArea text;
	private JLabel info_year;
	
	@SuppressWarnings("rawtypes")
	
	private JComboBox plan_year;
	private JLabel info_month;
	private JComboBox plan_month;
	private JLabel info_week;
	private JComboBox plan_week;
	private JLabel info_day;
	private JComboBox plan_day;
	private JLabel info_hours;
	private JComboBox plan_hours;
	private JTextArea text1;
	private JLabel info_hours1;
	private JComboBox plan_hours1;
	private JTextArea text2;
	private JLabel info_hours2;
	private JComboBox plan_hours2;
	private JTextArea text3;
	private JButton button;

	/*KONSTRUKTOR*/
	@SuppressWarnings({ "deprecation", "unchecked" })
	
	public PlanAdd() {
		this.info_file = new JLabel("Enter the file name ex. \"My homework.txt\"");
		this.info_file.setBounds(10, 10, 240, 50);
		this.info_file.setFont(new Font("Arial", Font.CENTER_BASELINE, 12));
		
		this.text = new JTextArea("fileName.txt");
		this.text.setBounds(270, 25, 240, 25);
		this.text.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK, 2));
		
		this.info_year = new JLabel("Choose the current year");
		this.info_year.setBounds(10, 60, 240, 25);
		this.info_year.setFont(new Font("Arial", Font.CENTER_BASELINE, 12));
		
		this.plan_year = new JComboBox();
		this.plan_year.setBounds(270, 60, 240, 25);
		this.plan_year.addItem(new Date().getYear() + 1900);
		
		this.info_month = new JLabel("Choose the month");
		this.info_month.setBounds(10, 85, 240, 25);
		this.info_month.setFont(new Font("Arial", Font.CENTER_BASELINE, 12));
		
		this.plan_month = new JComboBox();
		this.plan_month.setBounds(270, 85, 240, 25);
		this.plan_month.addItem("January");
		this.plan_month.addItem("February");
		this.plan_month.addItem("March");
		this.plan_month.addItem("April");
		this.plan_month.addItem("May");
		this.plan_month.addItem("June");
		this.plan_month.addItem("July");
		this.plan_month.addItem("August");
		this.plan_month.addItem("September");
		this.plan_month.addItem("October");
		this.plan_month.addItem("November");
		this.plan_month.addItem("December");
		
		this.info_week = new JLabel("Choose the name of the weekday");
		this.info_week.setBounds(10, 110, 240, 25);
		this.info_week.setFont(new Font("Arial", Font.CENTER_BASELINE, 12));
		
		this.plan_week = new JComboBox();
		this.plan_week.setBounds(270, 110, 240, 25);
		this.plan_week.addItem("Monday");
		this.plan_week.addItem("Tuesday");
		this.plan_week.addItem("Wednesday");
		this.plan_week.addItem("Thursday");
		this.plan_week.addItem("Friday");
		this.plan_week.addItem("Saturday");
		this.plan_week.addItem("Sunday");
		
		this.info_day = new JLabel("Choose the day");
		this.info_day.setBounds(10, 135, 240, 25);
		this.info_day.setFont(new Font("Arial", Font.CENTER_BASELINE, 12));
		
		this.plan_day = new JComboBox();
		this.plan_day.setBounds(270, 135, 240, 25);
		for(int i = 1; i <= 31; i++){
			this.plan_day.addItem(i);
		}
		
		this.info_hours = new JLabel("Choose the hour:");
		this.info_hours.setBounds(10, 180, 240, 25);
		this.info_hours.setFont(new Font("Arial", Font.CENTER_BASELINE, 12));
		
		this.plan_hours = new JComboBox();
		this.plan_hours.setBounds(270, 180, 240, 25);
		for(int i = 1; i <= 24; i++){
			this.plan_hours.addItem(i + ":00");
		}
		this.text1 = new JTextArea("Enter the activity");
		this.text1.setBounds(10, 210, 500, 25);
		this.text1.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK, 2));
		
		this.info_hours1 = new JLabel("Choose the hour:");
		this.info_hours1.setBounds(10, 245, 240, 25);
		this.info_hours1.setFont(new Font("Arial", Font.CENTER_BASELINE, 12));
		
		this.plan_hours1 = new JComboBox();
		this.plan_hours1.setBounds(270, 245, 240, 25);
		for(int i = 1; i <= 24; i++){
			this.plan_hours1.addItem(i + ":00");
		}
		
		this.text2 = new JTextArea("Enter the activity");
		this.text2.setBounds(10, 275, 500, 25);
		this.text2.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK, 2));
		
		this.info_hours2 = new JLabel("Choose the hour:");
		this.info_hours2.setBounds(10, 310, 240, 25);
		this.info_hours2.setFont(new Font("Arial", Font.CENTER_BASELINE, 12));
		
		this.plan_hours2 = new JComboBox();
		this.plan_hours2.setBounds(270, 310, 240, 25);
		for(int i = 1; i <= 24; i++){
			this.plan_hours2.addItem(i + ":00");
		}
		
		this.text3 = new JTextArea("Enter the activity");
		this.text3.setBounds(10, 340, 500, 25);
		this.text3.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK, 2));
		
		this.button = new JButton("Zapisz");
		this.button.setBounds(10, 385, 500, 25);
		this.button.addActionListener(this);
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
	public JLabel getInfo_year() {
		return info_year;
	}

	public void setInfo_year(JLabel info_year) {
		this.info_year = info_year;
	}
	public JComboBox getPlan_year() {
		return plan_year;
	}

	public void setPlan_year(JComboBox plan_year) {
		this.plan_year = plan_year;
	}
	public JLabel getInfo_month() {
		return info_month;
	}

	public void setInfo_month(JLabel info_month) {
		this.info_month = info_month;
	}
	
	public JComboBox getPlan_month() {
		return plan_month;
	}

	public void setPlan_month(JComboBox plan_month) {
		this.plan_month = plan_month;
	}
	public JLabel getInfo_week() {
		return info_week;
	}

	public void setInfo_week(JLabel info_week) {
		this.info_week = info_week;
	}
	public JComboBox getPlan_week() {
		return plan_week;
	}

	public void setPlan_week(JComboBox plan_week) {
		this.plan_week = plan_week;
	}
	public JLabel getInfo_day() {
		return info_day;
	}

	public void setInfo_day(JLabel info_day) {
		this.info_day = info_day;
	}
	public JComboBox getPlan_day() {
		return plan_day;
	}

	public void setPlan_day(JComboBox plan_day) {
		this.plan_day = plan_day;
	}
	public JLabel getInfo_hours() {
		return info_hours;
	}

	public void setInfo_hours(JLabel info_hours) {
		this.info_hours = info_hours;
	}
	public JComboBox getPlan_hours() {
		return plan_hours;
	}

	public void setPlan_hours(JComboBox plan_hours) {
		this.plan_hours = plan_hours;
	}
	public JTextArea getText1() {
		return text1;
	}

	public void setText1(JTextArea text1) {
		this.text1 = text1;
	}
	public JLabel getInfo_hours1() {
		return info_hours1;
	}

	public void setInfo_hours1(JLabel info_hours1) {
		this.info_hours1 = info_hours1;
	}

	public JComboBox getPlan_hours1() {
		return plan_hours1;
	}

	public void setPlan_hours1(JComboBox plan_hours1) {
		this.plan_hours1 = plan_hours1;
	}

	public JTextArea getText2() {
		return text2;
	}

	public void setText2(JTextArea text2) {
		this.text2 = text2;
	}

	public JLabel getInfo_hours2() {
		return info_hours2;
	}

	public void setInfo_hours2(JLabel info_hours2) {
		this.info_hours2 = info_hours2;
	}

	public JComboBox getPlan_hours2() {
		return plan_hours2;
	}

	public void setPlan_hours2(JComboBox plan_hours2) {
		this.plan_hours2 = plan_hours2;
	}

	public JTextArea getText3() {
		return text3;
	}

	public void setText3(JTextArea text3) {
		this.text3 = text3;
	}
	public JButton getButton() {
		return button;
	}

	public void setButton(JButton button) {
		this.button = button;
	}
	
	/*ZAPIS DO PLIKU*/
	public void zapisz(String tekst, String nazwa) {
		String fileName = nazwa;
		try(
				BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));
				) {
			writer.write(tekst);
		} catch(IOException e) {
			System.err.println("Zapis do pliku nieudany.");
		}
	}

	/*OBSLUGA ZDARZEN*/
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == button) {
			String total = "";
			total += "Plan z dnia " + plan_day.getSelectedItem() + "-" + plan_month.getSelectedItem() + "-" + plan_year.getSelectedItem() + "\n";
			total += plan_hours.getSelectedItem() + " - " + text1.getText() + "\n";
			total += plan_hours1.getSelectedItem() + " - " + text2.getText() + "\n";
			total += plan_hours2.getSelectedItem() + " - " + text3.getText() + "\n";
			zapisz(total, this.text.getText());
		}
	}
}
