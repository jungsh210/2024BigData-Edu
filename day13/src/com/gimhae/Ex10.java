package com.gimhae;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex10 extends Frame implements ActionListener{
	// 컴포넌트 고유의 이벤트 실행 - ActionListener
	Button btn;
	TextField tf;
	
	class BtnEvent implements ActionListener{
		
	}
	public Ex10() {
		setLayout(new FlowLayout());
		
		btn = new Button("버튼");
		tf = new TextField(15);
		tf.setEchoChar('#');
		btn.addActionListener(this);
		tf.addActionListener(this);
		
		add(btn);
		add(tf);
		
		setSize(300,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex10();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == tf) {
			System.out.println("Call event..."+e.getActionCommand());
		}
		if(e.getSource() == btn) {
			System.out.println("버튼 클릭");
		}
	}

}
