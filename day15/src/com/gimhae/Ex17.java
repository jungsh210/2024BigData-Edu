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
		f.setTitle("�޸���");
		
		ImageIcon icon = new ImageIcon("icon.jpg");
		
		Image img = icon.getImage();
		
		f.setIconImage(img);  //icon image ����
		
		MenuBar mb = new MenuBar();

		Menu m1 = new Menu();
		m1.setLabel("����");
		MenuItem mi1 = new MenuItem();
		mi1.setLabel("������");
		MenuItem mi2 = new MenuItem();
		mi2.setLabel("����");
		MenuItem mi3 = new MenuItem();
		mi3.setLabel("����");
		MenuItem mi4 = new MenuItem();
		mi4.setLabel("����");
		MenuItem mi5 = new MenuItem();
		mi5.setLabel("����");
		
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
		f.dispose();//GUI ����, ������ Frame.dispose()
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
