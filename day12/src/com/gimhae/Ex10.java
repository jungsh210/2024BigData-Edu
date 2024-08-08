package com.gimhae;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;

public class Ex10 extends Frame{
	
	public Ex10() {
		LayoutManager lm = new GridBagLayout();
		setLayout(lm);
		
		Button btn1 = new Button();
		Button btn2 = new Button();
		Button btn3 = new Button();
		Button btn4 = new Button();
		Button btn5 = new Button();
		Button btn6 = new Button();
		
		btn1.setLabel("btn1");
		btn2.setLabel("btn2");
		btn3.setLabel("btn3");
		btn4.setLabel("btn4");
		btn5.setLabel("btn5");
		btn6.setLabel("btn6");
		
		GridBagConstraints bag;
		bag = new GridBagConstraints();
		//bag.fill=0;
		bag.fill = GridBagConstraints.VERTICAL;
		// bag.fill = GridBagConstraints.BOTH;
		// bag.fill = GridBagConstraints.NONE;
		
		bag.gridwidth = 2; // 넓이
		bag.gridheight = 2; // 높이
		bag.weightx = 1.0; // 가중치
		bag.weighty = 1.0; // 가중치
		
		bag.gridx = 0;
		bag.gridy = 0;
		
		add(btn1,bag);
		
		bag.gridx = 1;
		
		add(btn2,bag);
		
		bag.gridx = 2;
		
		add(btn3,bag);
		
		bag.gridx = 0;
		bag.gridy = 1;
		
		add(btn4,bag);
		
		bag.gridx = 1;
		
		add(btn5,bag);
		
		bag.gridx = 2;
		
		add(btn6,bag);
		
		
		
		setSize(500,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex10();

	}

}
