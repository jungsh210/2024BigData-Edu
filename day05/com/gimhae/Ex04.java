package com.gimhae;

public class Ex04 {
	
	// String ���� �Ű������� �Է����� ���� -> String[] : length�� 0�� �迭 ����
	//public static void main(String[] args){
	//	 System.out.println(args.length);
	// }
	// class ���� ���� �� java Ex04 -> 0�� ���
	// java Ex04 111 -> 1�� ���
	// ("111"�̶�� ���ڿ��� args�� �����ϰ�, args�� ���޵� ���ڿ��� String[] �迭�� ����)
	
	public static void main(String[] args) { 
		String[] arr1 = new String[3];
		arr1[0] = "item1";
		arr1[1] = "item2";
		arr1[2] = "item3";
		
		String[] arr2 = new String[] {"Item1","Item2","Item3"};  // arr1 ���, ��� ��õ, ������ ���������൵ ��
		
		String[] arr3 = {"ITEM1","ITEM2","ITME3"};  // ��õ X
		
		for(int i=0; i<arr1.length;i++) {
			System.out.println(arr1[i]);
			System.out.println(arr2[i]);
			System.out.println(arr3[i]);
		}

	}

}
