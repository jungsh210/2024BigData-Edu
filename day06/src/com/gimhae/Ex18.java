package com.gimhae;
/*
 * �ֹι�ȣ üũ(ver 0.3.0)
 * �ֹι�ȣ> 991231-1234567
 * 
 * ����� 00�� �����Դϴ�.
 *-------------------------------
 * �ֹι�ȣ> 1234561234567
 * ������ ������� 000000-0000000���� �Է��ϼ���
 * �ֹι�ȣ> 123456-123456
 * �Է��ڸ����� �����մϴ�.
 * �ֹι�ȣ>a12345-1234567
 * �ֹι�ȣ�� ���ڷθ� �����Ǿ�� �մϴ�.
 */

public class Ex18 {

	public static void main(String[] args) {
		// String msg = "12";
		
		// ���ڿ� -> 10��� ���� ��ȯ
		// int su = Integer.parseInt(msg);
		
		// System.out.println(su);
		
		// �ֹι�ȣ üũ��(ver 0.3.0)
		// �ѱ� ����
		System.out.println("�ֹι�ȣ üũ��(ver 0.3.0)");
		while(true) {
			int year = 2024;
			String gender;
			String number;
			
			System.out.println("�ֹι�ȣ>");
			java.util.Scanner sc = new java.util.Scanner(System.in);
			number = sc.next();
			
			if(number.length() > 14 || number.charAt(6)!='-') {
				System.out.println(number.length()+"�ڸ��̰�,"+" �Է��ڸ����� �ʹ� �����ϴ�. 14�ڸ��� �Է����ּ���.");
				System.out.println("������ ������� 000000-0000000���� �Է��ϼ���.");
				continue;
			}else if(number.length() < 14 || number.charAt(6)!='-') {
				System.out.println(number.length()+"�ڸ��̰�,"+" �Է��ڸ����� �����ϴ�. 14�ڸ��� �Է����ּ���.");
				System.out.println("������ ������� 000000-0000000���� �Է��ϼ���.");
				continue;
			}
			String genderCode = number.substring(7,8);
			String ageCode = number.substring(0,1);
			int birthYear = 0;
			int age = 0;
			
			// �����ؾ� ��
			// ���� ���
			if(genderCode.equals("1") || genderCode.equals("2")) {
				birthYear = 1900 + Integer.parseInt(ageCode);
			}else if(genderCode.equals("3") || genderCode.equals("4")) {
				birthYear = 2000 + Integer.parseInt(ageCode);
			}
			
			age = year - birthYear + 1;
			
			if(age < 0) {
				age = -age;
			}
			
			if(genderCode.equals("1") || genderCode.equals("3")) {
				gender = "����";
			}else {
				gender = "����";
			}
			
			System.out.println("����� " + age + "�� "+ gender + "�Դϴ�.");
		}
		
	}

}
