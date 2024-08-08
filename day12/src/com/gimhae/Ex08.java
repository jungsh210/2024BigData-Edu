package com.gimhae;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.Panel;

public class Ex08 {

	public static void main(String[] args) {
		Frame f = new Frame();
		
		LayoutManager lm;
		lm = new BorderLayout();
		f.setLayout(lm);
		
		Button btn1 = new Button();
		btn1.setLabel("top");
		
		f.add(btn1, "North");
		
		Panel center = new Panel();
		Button btn2 = new Button();
		btn2.setLabel("center");
		center.add(btn2);
		
		// f.add(btn2, "Center");
		f.add(center, BorderLayout.CENTER);
		
		Button btn3 = new Button();
		btn3.setLabel("����");
		
		// f.add(btn3,"West");
		f.add(btn3, BorderLayout.WEST);
		
		Button btn4 = new Button();
		btn4.setLabel("������");
		
		//f.add(btn4, "East");
		f.add(btn4, BorderLayout.EAST);
		
		Button btn5 = new Button();
		btn5.setLabel("down");
		
		//f.add(btn5, "South");
		f.add(btn5, BorderLayout.SOUTH);
		
//		f.setLocation(-3840,100); // ��ǻ�͸��� �ٸ�, �ػ󵵿� �°� ����
		f.setSize(500,400);
		f.setVisible(true);

	}

}
