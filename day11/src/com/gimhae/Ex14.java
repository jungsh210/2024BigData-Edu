package com.gimhae;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Ex14 {

	public static void main(String[] args) {
		// �л������������α׷�(ver 0.8.0)
		// 1.����(��������, ��������) 2.�Է� 3.���� 4. ���� 0.����>
		// Set ���
		System.out.println("�л������������α׷�(ver 0.8.0)");
		Scanner sc = new java.util.Scanner(System.in);
		
		int choice = 0;
		int total;
		int stNumber = 0;
		String stName = "";
		int kr = 0;
		int en = 0;
		int math = 0;
		
		System.out.print("�ѿ�>");
		total = sc.nextInt();
		
		Set<String> set = new TreeSet<>();
		Set<String> set1 = new TreeSet<>();
		
		while(true) {
			System.out.print("1.���� 2.�Է� 3.���� 4. ���� 0.����>");
			choice = sc.nextInt();
			if(choice == 0) {
				System.out.println("�����մϴ�.");
				break;
			}
			if(choice == 1) {
				System.out.println("------------------------------------");
				System.out.println("�й� |�̸�     |����  |����  |����  ");
				System.out.println(set);
				System.out.println(set1);
				System.out.println("------------------------------------");
				continue;
			}
			else if(choice == 2) {
				if(set.size()==total) {
					System.out.println("�� �ۼ��� �л��� �����ϴ�.");
					continue;
				}
				System.out.print("�й�>");
				stNumber = sc.nextInt();
				System.out.print("�̸�>");
				stName = sc.next();
				System.out.print("����>");
				kr = sc.nextInt();
				System.out.print("����>");
				en = sc.nextInt();
				System.out.print("����>");
				math = sc.nextInt();
				for(int i=0; i<total; i++) {
					set.add(stNumber + " | " + stName + " | " + kr + " | " + en + " | " + math+"\n");	
				}
			}
			else if(choice == 3) {
				System.out.println("������ �л��� �й�>");
				int newNumber = sc.nextInt();
				if(newNumber==stNumber) {
					stNumber.remove(set);
					System.out.println("�й�>");
					stNumber = sc.nextInt();
					System.out.println("�̸�>");
					stName = sc.next();
					System.out.println("����>");
					kr = sc.nextInt();
					System.out.println("����>");
					en = sc.nextInt();
					System.out.println("����>");
					math = sc.nextInt();
					for(int i=0; i<set.size(); i++) {
						set.add(stNumber + " | " + stName + " | " + kr + " | " + en + " | " + math+"\n");	
					}
				} else {
					System.out.println("������ �л��� �й��� �����ϴ�.");
				}
			}
		}
	}

}
