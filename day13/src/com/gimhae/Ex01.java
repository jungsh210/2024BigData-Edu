package com.gimhae;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class Ex01 extends Frame{
	
	public Ex01() {
		java.awt.Toolkit kit = Toolkit.getDefaultToolkit();
		kit.beep(); // 소리가 남, 운영체제에서 이루어짐
		Dimension screen = kit.getScreenSize(); // 주 모니터의 스크린 사이즈
		
		int scrW,scrH;
		
		scrW = screen.width;
		scrH = screen.height;
//		System.out.println(scrW+","+scrH); // 주 모니터의 해상도 출력
		
		Dimension app = new Dimension(300,400);
		
		this.setSize(300,400);
//		this.setLocation(scrW/2-300/2, scrH/2-400/2); // 창을 가운데에 띄우는 방법 1
		this.setLocation(scrW/2-app.width/2, scrH/2-app.height/2); // 창을 가운데에 띄우는 방법 2
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Ex01();

	}

}
