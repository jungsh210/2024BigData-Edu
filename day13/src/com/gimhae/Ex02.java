package com.gimhae;

import java.awt.Frame;
import java.awt.event.WindowListener;

public class Ex02 extends Frame implements WindowListener{
	
	public Ex02() {
		addWindowListener(this);
		setBounds(-3840,100,400,200);
		dispose(); // GUI ����, windowClosed �ڵ� ȣ��
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
