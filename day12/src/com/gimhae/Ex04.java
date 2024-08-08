package com.gimhae;

// local class
// local class는 public class 밖으로 생성하면 사용 X, local이기 때문에
// local class는 static이 존재할 수 없음

public class Ex04 {
	static int su3 = 3333;
	int su4 = 4444;
	
	public static void func01() {
		Ex04 me = new Ex04();
		
		// jdk 1.7 이하에서는 final 생략 불가능
		// jdk 1.8 이상에서는 final 생략 가능
		
		final int su5 = 5555;
		
		class Local01{
			final static int su1 = 1111; // 상수형 변수에서는 static이 가능
			int su2 = 2222;
			
			public Local01() {
				
			}
			void func01() {
				System.out.println(su1);
				System.out.println(me.su4);
			}
			void func02() {
				System.out.println(su2);
				System.out.println(su5);
			}
		}
		Local01 local = new Local01();
		System.out.println(Local01.su1);
		System.out.println(local.su2);
		local.func01();
		local.func02();
	}
	
	public void func02() {
		//상동
	}
	
	// final 값을 바꿀 수 있는 경우
	public static void func03(final int su) {  // final 생략 가능
		// Local 클래스에서만 final, 내부에서는 변경 불가, main에서 초기화 후 값 변경은 가능
		
		class Local04{
			void func01() {
				System.out.println(su);
			}
		}
		Local04 local = new Local04();
		local.func01();
	}

	public static void main(String[] args) {
		func01();
		func03(111111); // final 변수인 su를 초기화한 후 111111으로 값을 변경
		func03(22222);
	}

}
