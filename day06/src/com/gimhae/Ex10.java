package com.gimhae;

public class Ex10 {

	public static void main(String[] args) {
		// ���ڿ�
		String msg1 = "abcd";
		String msg2 = new String("abcd"); // new�� ���� ���ο� ��ü�� ���� �ִ� ����
		String msg3 = new String(new char[] {'a','b','c','d'});
		String msg4 = new String(new byte[] {97,98,99,100});
		System.out.println(msg1);
		System.out.println(msg2);
		System.out.println(msg3);
		System.out.println(msg4);
		
		String msg5 = "abcd";
		
		// ���ڿ� = ��������
		System.out.println(msg1 == msg5); // ���� �ּҸ� ����Ŵ, msg1�� msg5�� "abcd" �ϳ��� ��ü�� ����Ŵ
		System.out.println(msg1 == msg2);
		
		java.util.Scanner sc;
		
		sc = new java.util.Scanner(System.in);
		
		String msg6 = sc.nextLine(); // scanner�� �Է¹޴� ���� ���ο� ��ü�� ��
		
		System.out.println(msg1==msg6);
	}

}
