package com.gimhae;

import java.awt.Frame;
import java.awt.Panel;

import javax.swing.JFrame;

public class Ex12 {

	public static void main(String[] args) {
		Frame f = new Frame();
//		JFrame f = new JFrame(); // swing - Frame�� J�� ���̸� ��
		
		Panel p = new Panel();
		
		// p.setLayout(new FlowLayout());
		f.setSize(500,400);
		f.setVisible(true); // â �ݱ� ��ư�� x�� ������ â�� ����, Frame������ â�� �� ������

	}

}
