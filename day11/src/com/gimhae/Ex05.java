package com.gimhae;

/*
 * ���׸��� ǥ�� ���
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

class Box05<T extends Pen>{  // Pen�� ���, Pen�� ����ϴ� ��� Ŭ���� ��� ����
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
		
		// �⺻ ������ ���׸�
		//Box05<Ballpen> box = new Box05<Ballpen>();
		
		// ���׸� �߷� Ÿ�� - <���� ����> jdk 1.7 �������� ��� ����~
		Box05<Ballpen> box = new Box05<>();
		Box05<Pencil> box1 = new Box05<>();
		
		// ���׸� Ÿ�� ������ �̷�� ���
		Box05<?> temp = new Box05<>(); // <?> : Ÿ�� ������ �̷�� ��, ����ϱ� ������ ������ �����ؾ� ��
		Box05<Ballpen> box2 = (Box05<Ballpen>) temp; // ����ϱ� �� Ÿ�� ����
		
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
