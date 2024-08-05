package com.gimhae;

public class Ex16 {

	public static void main(String[] args) {
		String msg = "java,database,web,spring";
		String msg1 = "java,database,web,,spring";
		
		String[] arr1 = msg.split(","); // 문자열 나누기
		String[] arr2 = msg1.split(",");
		
		System.out.println(java.util.Arrays.toString(arr1));
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		System.out.println(java.util.Arrays.deepToString(arr2));

	}

}
