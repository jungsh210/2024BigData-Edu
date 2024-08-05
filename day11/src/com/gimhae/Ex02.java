package com.gimhae;

interface Pen{
	void drow();
}

class Ballpen implements Pen{
	String bold = "진한";
	public void drow() {
		System.out.println(bold+" 선을 긋습니다.");
	}
}

class Pencil implements Pen{
	String bold = "희미한";
	public void drow() {
		System.out.println(bold+" 선을 긋습니다.");
	}
}


class Box <T>{  // 제네릭, <T> : T라는 자료형은 Box 클래스를 사용할 때 결정
	T pen;
	public void setPen(T pen) { // 연필 집어넣기
		this.pen = pen;
	}
	public T getPen() {  // 연필 꺼내기
		return this.pen;
	}
}

public class Ex02 {

	public static void main(String[] args) {
		
		Pencil pen1 = new Pencil();
		Ballpen pen3 = new Ballpen();
		
		//Box box = new Box();
		Box<Ballpen> box = new Box<Ballpen>();
		Box<Pencil> box2 = new Box<Pencil>();
		
		box2.setPen(pen1);
		//box.setPen(pen3);
		
		//Pen pen2 = box.getPen();
		//Ballpen pen4 = box.getPen2();
		//pen2.drow();
		//pen3.drow();
		
		///Pencil pen2 = (Pencil) box.getPen();
		///pen2.drow();
		
		////Ballpen pen4 = box.getPen();
		////pen4.drow();
		
		Pencil pen5 = box2.getPen();
		pen5.drow();
		
		

	}

}
