package com.gimhae;

public class Ex03_1 {

	public static void main(String[] args) {
		final String VERSION = "1.2.0"; 
		String title = "�л��������� ���α׷�(ver "+VERSION+")";
		String menu = "1.��� 2.�Է� 3.�󼼺��� 0.����>";
		String table = "---------------------------------\n";
		table+="�й�\t����\t����\t����\n";
		table+="----------------------------------";
		System.out.println(title);
		
		
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);
		
		int input = -1;
		int[][] data = new int[3][];
		System.out.println(title);
		
		while(true) {
			System.out.print(menu);
			input = sc.nextInt();
			if(input==0) break;
			if(input==1) {
				System.out.println(table);
			}
			if(input==2) {
				int[] stu = new int[3];
				System.out.println("����>");
				stu[0] = sc.nextInt();
				System.out.println("����>");
				stu[1] = sc.nextInt();
				System.out.println("����>");
				stu[3] = sc.nextInt();
				data[]=stu;
			}
			if(input == 3) {
				System.out.println("�й�>");
				input = sc.nextInt();
				System.out.println("----------------------------");
				System.out.println("����:"+"����:"+"����:");
				System.out.println("----------------------------");
				System.out.println("�հ�>");
				System.out.println("���>");
				System.out.println("����>");
			}
		}
		System.out.println("�̿����ּż� �����մϴ�.");

	}

}
