package com.gimhae;

class Lec02 extends Object{
	int su = 1111;
	public void func01() {
		System.out.println("부모의 기능");
	}
}

public class Ex02 extends Lec02{
	int su = 2222;
	
	public void func01() {
		super.func01(); // 부모의 기능을 같이 들고오는 것
		System.out.println("자식의 기능");
		System.out.println(super.su); // 부모의 su를 들고옴
		System.out.println(this.su);  // 자식의 su를 들고옴
	}
	
	public static void main(String[] args) {
		Ex02 me = new Ex02();
		me.func01();
		System.out.println(me.toString()); 
		// toString을 가지고 있는 것이 object 클래스, 부모 클래스는 object 클래스를 상속받고 있다.(명시되어 있지 않아도)
	}

}
