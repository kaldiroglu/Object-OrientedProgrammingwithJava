
package org.javaturk.oopj.ch10.callBack.button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 * @author Akin Kaldiroglu (akin.kaldiroglu@selsoft.com.tr)
 *
 */
public class MyButtonListener implements ActionListener{
	private final MyApplication application;
	
	public MyButtonListener(MyApplication application){
		this.application = application;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		JButton button = (JButton) event.getSource();
		String buttonLabel = button.getText();
		application.buttonClicked(buttonLabel);
	}
}
