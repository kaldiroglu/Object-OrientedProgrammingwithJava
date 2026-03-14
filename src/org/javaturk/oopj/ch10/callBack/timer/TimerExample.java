package org.javaturk.oopj.ch10.callBack.timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


/**
 * Excerpt From: Horstmann, Cay S. “Core Java Volume I--Fundamentals (9th
 * Edition): 1 (Core Series).” iBooks.
 *
 */

public class TimerExample {

	public static void main(String[] args){
		ActionListener listener = new TimePrinter1();
		Timer t1 = new Timer(1_000,  listener);
//		t1.addActionListener(new SelamPrinter1());
//		t1.start();

		Timer t2 = new Timer(100,  new SelamPrinter1());
		t2.start();
		
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}
}

class TimePrinter1 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		Date now = new Date();
		System.out.println("At the tone, the time is " + now);
		Toolkit.getDefaultToolkit().beep();		
	}
}

class SelamPrinter1 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Selaaammm :)");
		System.out.println(e.getSource());
		Toolkit.getDefaultToolkit().beep();		
	}
}