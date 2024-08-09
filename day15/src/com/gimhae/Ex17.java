package com.gimhae;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.ImageIcon;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex17 extends Frame implements WindowListener{
	static Frame f = new Frame();
	public Ex17() {
		f.setTitle("메모장");
		
		ImageIcon icon = new ImageIcon("icon.jpg");
		
		Image img = icon.getImage();
		
		f.setIconImage(img);  //icon image 변경
		
		MenuBar mb = new MenuBar();

		Menu m1 = new Menu();
		m1.setLabel("파일");
		MenuItem mi1 = new MenuItem();
		mi1.setLabel("새파일");
		MenuItem mi2 = new MenuItem();
		mi2.setLabel("열기");
		MenuItem mi3 = new MenuItem();
		mi3.setLabel("저장");
		MenuItem mi4 = new MenuItem();
		mi4.setLabel("정보");
		MenuItem mi5 = new MenuItem();
		mi5.setLabel("종료");
		
		m1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(mb);
				
			}
		});
		mb.add(m1);
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		m1.add(mi4);
		m1.add(mi5);
		
		f.setMenuBar(mb);
		f.setSize(500,600);
		f.setVisible(true);
		f.addWindowListener(this);
	}
	
	public static void main(String[] args) {
		new Ex17();
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Closing");
		//setVisible(false);
//		System.exit(0);
		f.dispose();//GUI 종료, 종료할 Frame.dispose()
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
