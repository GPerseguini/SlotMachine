package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class SlotController implements ActionListener{
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JButton btJogar;
	
	public SlotController (JTextField tf1,JTextField tf2,JTextField tf3,JButton btJogar){
		this.tf1 = tf1;
		this.tf2 = tf2;
		this.tf3 = tf3;
		this.btJogar = btJogar;
	}
	
	private void getNumber(){
		Thread t1 = new ThreadN(tf1, btJogar);
		Thread t2 = new ThreadN(tf2, btJogar);
		Thread t3 = new ThreadN(tf3, btJogar);
		t1.start();
		t2.start();
		t3.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		getNumber();
	}
	
	
}
