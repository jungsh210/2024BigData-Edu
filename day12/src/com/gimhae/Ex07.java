package com.gimhae;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.CardLayout;
import java.awt.GridLayout;

public class Ex07 extends java.awt.Frame{
	// 배치 - 배치관리자(어떻게 배치할것 인지)
	// 요소 - UI 컴포넌트 종류 사용법
	
	public Ex07() {
		// 배치 관리차 - 상대 속성, 절대 속성
		
		// 상대 속성은 컨텐츠 크기에 맞춰서 사이즈가 알아서 조정됨
		
		// Ex07~Ex10 : 상대 속성
		// 1. FlowLayout : 가운데 정렬, 컴포넌트의 배치, 크기x
		// 컨텐츠 크기에 맞춰 사이즈 조정
		
//		LayoutManager lm = new FlowLayout(); // 위치 이동 x, 사이즈 변환 x
//		this.setLayout(lm);
		
		// 2. GridLayout
		
		LayoutManager lm = new GridLayout(2,2); // 위치 이동 x, 사이즈 변환 x 
		// (3,2) : 3행 2열의 바둑판 형태의 화면 생성, 열(세로)는 무조건 고정 
		// -> 넣으려는 버튼보다 gridlayout의 개수가 작으면 행(가로)가 늘어난다.
		
		this.setLayout(lm);
		
		Font f = new Font("궁서체", 0, 30); // 폰트 변경
		
		java.awt.Button btn= new Button(); // 버튼 객체 생성
//		btn.setFont(f); // font 변경
		btn.setLabel("첫번째 버튼");
		java.awt.Button btn2= new Button(); // 버튼 객체 생성
		btn2.setLabel("두번째 버튼");
		java.awt.Button btn3= new Button(); // 버튼 객체 생성
		btn3.setLabel("세번째 버튼");
		java.awt.Button btn4= new Button(); // 버튼 객체 생성
		btn4.setLabel("네번째 버튼");
		java.awt.Button btn5= new Button(); // 버튼 객체 생성
		btn5.setLabel("다섯째 버튼");
		java.awt.Button btn6= new Button(); // 버튼 객체 생성
		btn6.setLabel("여섯째 버튼");
		
		this.add(btn); // 화면에 버튼 추가
		this.add(btn2); // 화면에 버튼 추가
		this.add(btn3); // 화면에 버튼 추가
		this.add(btn4); // 화면에 버튼 추가
		this.add(btn5); // 화면에 버튼 추가
//		this.add(btn6);
		this.setSize(500,400); // 화면 크기 조정
		this.setVisible(true); // 화면에 보여주는 것 - true
	}

	public static void main(String[] args) {
		// GUI
		// awt    1.0~ os요청->java는 힘을 안 들임->빠르고 자원소모, 운영체제 종속(java는 운영체제의 독립)
		// swing  1.2~ java drow->java가 직접 drow->awt 못하는 것 수행 가능
		// awt와 swing을 혼합하여 GUI를 구성
		
		Ex07 me = new Ex07();

	}

}
