package com.gimhae;

public class Ex05 {
	static int[] arr2;

	public static void main(String[] args) {
		// ��������
		int[] arr1; // �迭���� ����, ���� ���� �� ������ �ʱ�ȭ�� �ؾ� ����� �� ����.
		arr1 = new int[3]; // �ʱ�ȭ
		//arr1[1] = 1111;
		arr1[2] = 2222;
		//arr1[3] = 3333;
		System.out.println(arr1); // ���������� hashcode���� ���´�.
		System.out.println(arr2);  // ���� ������ �ƴϸ� hashcode���� �ƴ� default���� null�� ��µȴ�.
		
		Ex05 me = new Ex05();
		System.out.println(me); // 
		System.out.println(me.toString()); // Ŭ��������.hashcode ��, 16����
		System.out.println(me.getClass()); // Ŭ��������
		System.out.println("@");
		System.out.println(me.hashCode()); // Ŭ��������.hashcode ��, 10����
		System.out.println(Integer.toHexString(me.hashCode())); // hashcode�� ���
	}

}
