package com.gimhae;

// �� �� �̻��� ���׸�

class Box2<T1,T2, T3>{
//	Pencil obj1; // ������� ����Ϸ��� Object�� �Ǿ�� �Ѵ�.
//	Ballpen obj2;
	
///	Object obj1; 
///	Object obj2;
	
	T1 obj1;
	T2 obj2;
	T3 obj3;
	
	public void setObj1(T1 obj1) {
		this.obj1 = obj1;
	}
	public void setObj2(T2 obj2) {
		this.obj2= obj2;
	}
	public void setObj3(T3 obj3) {
		this.obj3 = obj3;
	}
	public T1 getObj1() {
		return obj1;
	}
	public T2 getObj2() {
		return obj2;
	}
	public T3 getObj3() {
		return obj3;
	}
}
public class Ex03 {

	public static void main(String[] args) {
		Box2 box = new Box2();
		box.setObj1(new Pencil());
		box.setObj2(new Ballpen());
		Pencil pen1 = (Pencil) box.getObj1();
		pen1.drow();
		Ballpen pen2 = (Ballpen) box.getObj2();
		pen2.drow();
//		box.getObj1().drow(); // ���׸������� error
//		box.getObj2().drow(); // ���׸������� error
	}

}
