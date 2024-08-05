package com.gimhae;

public class Ex06 {

	public static void main(String[] args) {
		int[] arr1;
		arr1 = new int[] {1,2,3,7}; // 제일 많이 사용하는 방식, 이 방식으로 작성하도록 습관 들이기
		// arr1 = {1,3,5,7}; -> 오류, 위에서 선언을 했지만 {} 안 자료형이 무슨 자료형인지 명시가 안 되어 있어서 오류
		int[] arr2 = {1,2,3,4};  // 사용 가능, 추론 타입
		int arr3[] = new int[5]; // 가능은 하지만 X
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
			System.out.println(arr2[i]);
		}

	}

}
