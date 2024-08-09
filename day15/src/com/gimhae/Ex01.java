package com.gimhae;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex01 extends Frame implements ActionListener{

	public Ex01() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		setLayout(new FlowLayout());
		Button btn=new Button("한글 입력");
		btn.addActionListener(this);
		add(btn);
		setBounds(-3840,50,500,600);
		setVisible(true);
	}
	public static void main(String[] args) {
		Ex01 me=new Ex01();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Frame f2=new Frame();
		f2.setSize(500,600);
		f2.setVisible(true);
		f2.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f2.dispose();
			}
		});
	}

}