package com.gimhae;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Ex03 {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.setTitle("����");
		
		ImageIcon icon = new ImageIcon("icon.jpg");
		
		Image img = icon.getImage();
		
		f.setIconImage(img);  //icon image ����
		
		MenuBar mb = new MenuBar();
		Menu m2 = new Menu("�޴�2");
		Menu mi4 = new Menu("�޴�3");
		
		Menu m1 = new Menu();
		m1.setLabel("�޴�1");
		MenuItem mi1 = new MenuItem();
		mi1.setLabel("1ù��°");
		MenuItem mi2 = new MenuItem();
		mi2.setLabel("1�ι�°");
		MenuItem mi3 = new MenuItem();
		mi3.setLabel("1����°");
		
		m1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�޴� ����");
				
			}
		});
		mb.add(m1);
		mb.add(m2);
		mb.add(mi4);
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		
		f.setMenuBar(mb);
		
		f.setSize(500,400);
		f.setVisible(true);

	}

}
