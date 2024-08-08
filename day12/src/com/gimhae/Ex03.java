package com.gimhae;

// non-static inner class

class Outter03{
	static int su1=1111;
	int su2 = 2222;
	
	public Outter03() {
		
	}
	
	static void func01() {
		System.out.println(Inner03.su3);
		
//		Inner03 inn = new Inner03(); // error, non-static class는 가장 밖에 있는 클래스 먼저 객체로 생성
		
		Outter03 outt = new Outter03();
		
		Inner03 inn = outt.new Inner03();
		
		System.out.println(inn.su4);
		inn.func04();
		
	}
	
	void func02() {
		System.out.println(Inner03.su3);
//		Inner03 inn = new Inner03(); // errorX
		// non-static 메소드에서는 error가 나지 않은 이유는 this가 생략되어 있기 때문이다.
		Inner03 inn = this.new Inner03();
		System.out.println(inn.su4);
		inn.func04();
	}
	
	// non-static inner class
	class Inner03{
//		static int su3 = 3333;  // non-static 클래스 안에는 static 변수, 메소드가 생성될 수 없다.
		final static int su3 = 3333; // 상수형(final) 변수일 때는 static 사용 가능
		int su4 = 4444;
		
//		static void func03() {
//			
//		}
		void func04() {
			System.out.println(su1);
			// non-static 클래스에서는 non-static 변수를 그냥 불러오기 가능, 객체 생성 X
			System.out.println(su2);
			func01();
			func02();
			
//			Outter03.func01();
//			this.fun02();
			
		}
	}
}
public class Ex03 {

	public static void main(String[] args) {
		System.out.println(Outter03.Inner03.su3); // Outter03 앞에 com.gimhae 패키지명 생략됨
		
//		Outter03.Inner03 inn = new Outter03.Inner03(); // static에서는 가능, non-static에서는 불가능
		
		// non-static에서 가능한 방법, Outter03을 객체로 먼저 불러오기
		Outter03 outt = new Outter03();
		
		Outter03.Inner03 inn = outt.new Inner03();
		
		System.out.println(inn.su4);
		
		inn.func04();

	}

}
