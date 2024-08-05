package com.gimhae;

public class Ex08 {

	public static void main(String[] args) {
		int[] arr1 = new int[] {2,4,6,8};
		func(arr1); // 얕은 복사
		System.out.println("main 출력");
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}
	
	public static void func(int[] arr) { // 얕은 복사
		arr[1] = 3;
	}

}
