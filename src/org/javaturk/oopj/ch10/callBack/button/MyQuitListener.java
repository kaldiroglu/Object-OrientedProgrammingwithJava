
package org.javaturk.oopj.ch10.callBack.button;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyQuitListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent event) {
		System.exit(0);
	}
}
