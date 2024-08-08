package com.gimhae;

/*
 * 다시 코딩
 */

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class Ex04 extends Frame implements MouseListener {
	Button btn;
	
	public Ex04() {
		setLayout(new FlowLayout());
		
		java.awt.Toolkit kit = Toolkit.getDefaultToolkit();
		
		Dimension screen = kit.getScreenSize();
		
		int scrW,scrH;
		
		scrW = screen.width;
		scrH = screen.height;
		
		btn = new Button("버튼");
		btn.setSize(100,50);
		btn.setLocation(100,100);
		this.addMouseListener(this);
		add(btn);
//		setBounds(-3840,100,400,300);
		setLocation(scrW/2-300/2, scrH/2-400/2);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex04();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
//		System.out.println("클릭");
		int x = e.getX();
		int y = e.getY();
		btn.setLocation(x,y);
	}
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("클릭버튼 눌림");
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("클릭버튼 위로");
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("마우스가 위로");
	}
//	@Override
//	public void mouseReleased(MouseEvent e) {
//		System.out.println("클릭버튼 눌림");
//	}

}
