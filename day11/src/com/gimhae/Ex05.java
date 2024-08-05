package com.gimhae;

/*
 * 제네릭의 표현 방식
 */

//class Box05<T>{
//	T t;
//	public void setT(T t) {
//		this.t = t;
//	}
//	public T getT() {
//		return t;
//	}
//}

class Box05<T extends Pen>{  // Pen을 상속, Pen을 상속하는 모든 클래스 사용 가능
	T t;
	public void setT(T t) {
		this.t = t;
	}
	public T getT() {
		return t;
	}
}

public class Ex05 {

	public static void main(String[] args) {
		Ballpen pen1 = new Ballpen();
		Pencil pen2 = new Pencil();
		
		// 기본 형태의 제네릭
		//Box05<Ballpen> box = new Box05<Ballpen>();
		
		// 제네릭 추론 타입 - <생략 가능> jdk 1.7 버전부터 사용 가능~
		Box05<Ballpen> box = new Box05<>();
		Box05<Pencil> box1 = new Box05<>();
		
		// 제네릭 타입 결정을 미루는 경우
		Box05<?> temp = new Box05<>(); // <?> : 타입 결정을 미루는 것, 사용하기 전에는 무조건 결정해야 함
		Box05<Ballpen> box2 = (Box05<Ballpen>) temp; // 사용하기 전 타입 결정
		
		Box05<Pen> box3 = new Box05<>();
		
		box.setT(pen1);
		//pen1 = box.getT();
		// pen1.drow();
		
		box1.setT(pen2);
		pen2 = box1.getT();
		pen2.drow();
		
		box2.setT(pen1);
		pen1 = box2.getT();
		pen1.drow();
		
		box3.setT(pen1);
		Pen pen5 = box.getT();
		pen5.drow();
	}

}
