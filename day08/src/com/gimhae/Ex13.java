package com.gimhae;

/*
 * �л������������α׷�(ver 1.4.0)
 * 
 * 1.���� 2.�Է� 3.���� 4.���� 0.����>
 * 
 * �й�, �̸�, ����, ����, ���� �Է� �ޱ�
 * �ѿ� ���� X
 * 
 * ��ü student ����(Class Student ����)
 */
public class Ex13 {

	public static void main(String[] args) {
		System.out.println("�л� ���� ���� ���α׷� (ver 1.4.0)");
		
		java.util.Scanner sc;
		
		sc = new java.util.Scanner(System.in);
		
		int choice;
		String studentData = "";
		
		while(true) {
			String menu = "1.���� 2.�Է� 3.���� 4.���� 0.����>";
			System.out.print(menu);
			
			choice = sc.nextInt();
			
			if(choice==0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			if(choice==1) {
				System.out.println("--------------------------------");
                System.out.println("�й� |�̸�     |����  |����  |����  ");
                System.out.print(studentData);
                System.out.println("--------------------------------");
                continue;
			}else if(choice==2) {
				System.out.print("�й�>");
				int stNumber = sc.nextInt();
				System.out.print("�̸�>");
				String stName = sc.next();
				System.out.print("����>");
				int kr = sc.nextInt();
				System.out.print("����>");
				int en = sc.nextInt();
				System.out.print("����>");
				int math = sc.nextInt();
				studentData += stNumber + " | " + stName + " | " + kr + " | " + en + " | " + math + "\n";
			}
		}
	}

}
