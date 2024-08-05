package com.gimhae;

public class Ex07 {

	public static void main(String[] args) {
		int[] arr1 = {1,3,5};
		int[] arr2 = {2,4,6};
		
		// arr1과 arr2를 담는 arr3
		int[][] arr3 = new int[2][];
		arr3[0] = arr1;
		arr3[1] = arr2;
		
		int[][] arr4 = {{1,3,5},{2,4,6}};
		
		arr4[0][1] = 30;// 0번째 배열에 1번째 index값 변경
		arr4[1][2] = 60;
		
		for(int i=0; i<arr4.length;i++) {
			int[] arr5 = arr4[i];
			for(int j=0; j<arr5.length; j++) {
				System.out.print(arr5[j]+" ");
			}
			System.out.println();
		}
	}

}
