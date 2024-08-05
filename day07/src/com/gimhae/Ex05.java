package com.gimhae;

// 따로 클래스에 명시하지 않으면 java.lang.Object 클래스를 상속
public class Ex05{

	public static void main(String[] args) throws CloneNotSupportedException{
		Object obj = new Object();
		System.out.println(obj.toString());  // 클래스명.hashcode
		System.out.println(obj.hashCode());
		System.out.println(obj.getClass());
		// System.out.println(obj.clone()); // object에서는 불가
		System.out.println("-----------------");
		Ex05 me = new Ex05();
		System.out.println(me.toString());
		System.out.println(me.hashCode());
		System.out.println(me.getClass());
		
		int[] arr1 = {1,3,5,7};
		int[] arr2 = (int[])arr1.clone();
		arr1[2] = 6;
		System.out.println(java.util.Arrays.toString(arr1));
		System.out.println(java.util.Arrays.toString(arr2)); // 배열의 깊은 복사 수행
	}

}
