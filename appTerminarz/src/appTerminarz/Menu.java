package appTerminarz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Menu implements ActionListener {
	/**
	 * 
	 */
	private JButton button_note;
	private JButton button_edit;
	private JButton button_plan;
	private JButton button_read;

	

	/*KOSTRUKTOR*/
	public Menu() {
		this.button_note = new JButton("Add the note");
		this.button_note.setBounds(700, 60, 200, 70);
		this.button_note.setFont(new Font("Consolas", Font.ROMAN_BASELINE, 14));
		this.button_note.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK, 1));
		this.button_note.addActionListener(this);
		this.button_edit = new JButton("Edit note");
		this.button_edit.setBounds(700, 130, 200, 70);
		this.button_edit.setFont(new Font("Consolas", Font.ROMAN_BASELINE, 14));
		this.button_edit.addActionListener(this);
		this.button_plan = new JButton("Plan your day");
		this.button_plan.setBounds(700, 200, 200, 70);
		this.button_plan.setFont(new Font("Consolas", Font.ROMAN_BASELINE, 14));
		this.button_plan.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK, 1));
		this.button_plan.addActionListener(this);
		this.button_read = new JButton("Read plan");
		this.button_read.setBounds(700, 270, 200, 70);
		this.button_read.setFont(new Font("Consolas", Font.ROMAN_BASELINE, 14));
		this.button_read.addActionListener(this);
	}

	/*GETTERY I SETTERY*/
	public JButton getButton_note() {
		return button_note;
	}
	public void setButton_note(JButton but) {
		this.button_note = but;
	}
	
	public JButton getButton_edit() {
		return button_edit;
	}

	public void setButton_edit(JButton button_edit) {
		this.button_edit = button_edit;
	}
	
	public JButton getButton_plan() {
		return button_plan;
	}

	public void setButton_plan(JButton button_plan) {
		button_plan = button_plan;
	}
	
	public JButton getButton_read() {
		return button_read;
	}

	public void setButton_read(JButton button_read) {
		this.button_read = button_read;
	}

	/*OBSLUGA ZDARZEN PRZYCISKU ADD THE NOTE*/
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == button_note) {
			NotatkaAddFrame frame = new NotatkaAddFrame();
            frame.setVisible(true);
		}
		else if(source == button_edit) {
			NotatkaEditFrame frame = new NotatkaEditFrame();
			frame.setVisible(true);
		}
		else if(source == button_plan) {
			PlanAddFrame frame = new PlanAddFrame();
			frame.setVisible(true);
		}
		else if(source == button_read) {
			ReadPlanFrame frame = new ReadPlanFrame();
			frame.setVisible(true);
		}
		
	}

}
