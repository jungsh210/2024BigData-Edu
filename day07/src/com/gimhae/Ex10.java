package com.gimhae;

public class Ex10 {

	public static void main(String[] args) {
		int[] arr1;
		arr1 = new int[] {1,2,3,4}; // arr1 = new int[][] : �迭�� ���� ������ ����� �ִ� ��
		
		int[] arr2;
		arr2 = new int[] {2,4,6,8};
		
		int[][] arr3;
		// arr3 = new int[][] {arr1, arr2};
		arr3 = new int[2][4]; // ����Ʈ ��, null, �ʱ�ȭ �κ�
		//arr3[0] = arr1;
		//arr3[1] = arr2;
		arr3[1] = arr2;
		
		for(int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr3[i].length; j++) {
				System.out.print(arr3[i][j]+"\t");
			}
			System.out.println();
		}
		
		// String[] arr4 = new String[2];
		

	}

}
