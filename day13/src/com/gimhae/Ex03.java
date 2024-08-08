package com.gimhae;

import java.awt.Frame;

import java.awt.event.WindowListener;

public class Ex03 implements WindowListener{
	static Frame f;
	
	public static void main(String[] args) {
		f= new Frame();
		f.addWindowListener(new Ex03());
		f.setBounds(-3840, 100, 200, 400);
		f.setVisible(true);

	}

}
