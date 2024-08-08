package com.gimhae;

import java.awt.Frame;
import java.awt.Panel;

import javax.swing.JFrame;

public class Ex12 {

	public static void main(String[] args) {
		Frame f = new Frame();
//		JFrame f = new JFrame(); // swing - Frame에 J만 붙이면 됨
		
		Panel p = new Panel();
		
		// p.setLayout(new FlowLayout());
		f.setSize(500,400);
		f.setVisible(true); // 창 닫기 버튼인 x를 누르면 창이 닫힘, Frame에서는 창이 안 닫혔음

	}

}
