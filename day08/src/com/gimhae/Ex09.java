package com.gimhae;

public class Ex09 implements Cloneable{  
	// Cloneable 인터페이스는 현재 아무것도 선언이 안되어있는 상태지만 인터페이스를 Ex09가 상속함으로써 clone 사용 가능

	public static void main(String[] args) throws Exception{
		Ex09 me = new Ex09();
		Object obj = me.clone();
		System.out.println(me);
		System.out.println(obj);
		// me와 obj는 서로 다른 객체를 가르키고 있다.
		

	}

}
