package com.gimhae;

public class Ex09 {

	public static void main(String[] args) {
		// �迭 ���� ���� 2. -> �⺻ arr1�� ���� �����ص� 
		
		int[] arr1 = new int[] {1111,2222,3333,4444};
		
		// �迭 ���� ���� 1)
		int[] arr2 = new int[arr1.length]; // arr1�� ���� �������� �迭 ����
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = arr1[i];
		}
		
		// �迭 ���� ���� 2) ���� ���� ���Ǵ� ���� ���
		
		int[] arr3 = new int[arr1.length];
		System.arraycopy(arr1, 0, arr3, 0, 4);
		
		// �迭 ���� ���� 3)
		int[] arr4 = java.util.Arrays.copyOfRange(arr1, 0, arr1.length);
		
		arr1[1] = 2000; // arr1�� ���� ����
		
		// ��� �κ�
		for(int i=0; i<arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		// �Ź� for������ ������ ����ϱ� ����ϱ� �����ϰ� �迭 �� ������ Ȯ���� �� �ִ� ���
		System.out.println(java.util.Arrays.toString(arr4)); 
		
	}

}
