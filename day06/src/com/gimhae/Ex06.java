package com.gimhae;

public class Ex06 {

	public static void main(String[] args) {
		int[] arr1;
		arr1 = new int[] {1,2,3,7}; // ���� ���� ����ϴ� ���, �� ������� �ۼ��ϵ��� ���� ���̱�
		// arr1 = {1,3,5,7}; -> ����, ������ ������ ������ {} �� �ڷ����� ���� �ڷ������� ��ð� �� �Ǿ� �־ ����
		int[] arr2 = {1,2,3,4};  // ��� ����, �߷� Ÿ��
		int arr3[] = new int[5]; // ������ ������ X
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
			System.out.println(arr2[i]);
		}

	}

}
