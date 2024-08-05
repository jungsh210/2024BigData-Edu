package com.gimhae;

public class Ex05 {
	static int[] arr2;

	public static void main(String[] args) {
		// 참조변수
		int[] arr1; // 배열변수 선언, 변수 선언 후 무조건 초기화를 해야 사용할 수 있음.
		arr1 = new int[3]; // 초기화
		//arr1[1] = 1111;
		arr1[2] = 2222;
		//arr1[3] = 3333;
		System.out.println(arr1); // 참조변수로 hashcode값이 나온다.
		System.out.println(arr2);  // 참조 변수가 아니면 hashcode값이 아닌 default값인 null이 출력된다.
		
		Ex05 me = new Ex05();
		System.out.println(me); // 
		System.out.println(me.toString()); // 클래스정보.hashcode 값, 16진수
		System.out.println(me.getClass()); // 클래스정보
		System.out.println("@");
		System.out.println(me.hashCode()); // 클래스정보.hashcode 값, 10진수
		System.out.println(Integer.toHexString(me.hashCode())); // hashcode값 출력
	}

}
