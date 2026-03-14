
package org.javaturk.oopj.ch10.callBack.button;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.*;

public class MyApplication extends JFrame {
	private final Container contentPane;
	private final JLabel label;

	public MyApplication() {
		setTitle("My Application");
		label = new JLabel();
		contentPane = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 150);
		start();
	}

	public void start() {
		label.setBackground(Color.BLACK);
		label.setFont(new Font("Arial", Font.BOLD, 20));
		label.setText("No button clicked yet!");

		JButton button1 = new JButton();
		button1.setText("Button 1");
		button1.addActionListener(new MyButtonListener(this));

		JButton button2 = new JButton();
		button2.setText("Button 2");
		button2.addActionListener(new MyButtonListener(this));

		JPanel northPanel = new JPanel();
		northPanel.add(label);
		contentPane.add(northPanel, BorderLayout.NORTH);

		JButton button3 = new JButton("Quit");
		button3.addActionListener(new MyQuitListener());

		JPanel centralPanel = new JPanel();
		centralPanel.add(button1);
		centralPanel.add(button2);
		centralPanel.add(button3);
		contentPane.add(centralPanel);
	}

	public void buttonClicked(String text) {
		label.setText(text + " is clicked!");
	}
}

