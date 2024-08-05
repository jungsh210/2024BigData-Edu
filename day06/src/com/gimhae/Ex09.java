package com.gimhae;

public class Ex09 {

	public static void main(String[] args) {
		// 배열 깊은 복사 2. -> 기본 arr1의 값을 변경해도 
		
		int[] arr1 = new int[] {1111,2222,3333,4444};
		
		// 배열 깊은 복사 1)
		int[] arr2 = new int[arr1.length]; // arr1과 같은 사이즈의 배열 생성
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = arr1[i];
		}
		
		// 배열 깊은 복사 2) 가장 많이 사용되는 복사 방법
		
		int[] arr3 = new int[arr1.length];
		System.arraycopy(arr1, 0, arr3, 0, 4);
		
		// 배열 깊은 복사 3)
		int[] arr4 = java.util.Arrays.copyOfRange(arr1, 0, arr1.length);
		
		arr1[1] = 2000; // arr1의 값만 변경
		
		// 출력 부분
		for(int i=0; i<arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		// 매번 for문으로 돌려서 출력하기 힘드니까 간단하게 배열 안 내용을 확인할 수 있는 방법
		System.out.println(java.util.Arrays.toString(arr4)); 
		
	}

}
