package com.gimhae;

/*
 * �л��������� ���α׷�(ver 1.2.0)
 * 1.��� 2.�Է� 3.�󼼺��� 0. ����> 3
 * �й� > 1
 * ���� > 90
 * ���� > 80
 * ���� > 70
 * �հ� > 000
 * ��� > 00.00(�Ҽ� ��°�ڸ�����)
 * ���� > A(~90)
 * ���� > B(~80)
 * ���� > C(~70)
 * ���� > D(~60)
 * ���� > F(60�̸�)
 */

public class Ex03 {

	public static void main(String[] args) {
		final String VERSION = "1.2.0"; 
		String title = "�л��������� ���α׷�(ver "+VERSION+")";
		String menu = "1.��� 2.�Է� 3.�󼼺��� 0.����>";
		String table = "---------------------------------";
		table+="�й�\t����\t����\t����\n";
		table+="----------------------------------";
		System.out.println(title);
		
		
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);
		
		int input = -1;
		
		System.out.println(title);
		while(true) {
			System.out.println(menu);
			input = sc.nextInt();
			if(input==0) break;
			if(input==1) {
				System.out.println(table);
			}
		}
		System.out.println("�̿����ּż� �����մϴ�.");
	}

}
