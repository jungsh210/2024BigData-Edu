package com.gimhae;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class Ex01 extends Frame{
	
	public Ex01() {
		java.awt.Toolkit kit = Toolkit.getDefaultToolkit();
		kit.beep(); // �Ҹ��� ��, �ü������ �̷����
		Dimension screen = kit.getScreenSize(); // �� ������� ��ũ�� ������
		
		int scrW,scrH;
		
		scrW = screen.width;
		scrH = screen.height;
//		System.out.println(scrW+","+scrH); // �� ������� �ػ� ���
		
		Dimension app = new Dimension(300,400);
		
		this.setSize(300,400);
//		this.setLocation(scrW/2-300/2, scrH/2-400/2); // â�� ����� ���� ��� 1
		this.setLocation(scrW/2-app.width/2, scrH/2-app.height/2); // â�� ����� ���� ��� 2
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Ex01();

	}

}
