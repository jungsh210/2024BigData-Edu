package com.gimhae;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Stu{
	int num;
	String name;
	int kor, eng, math;
}
public class Ex14_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set data = new HashSet<Stu>();
		
		String title = "�л������������α׷�(ver 0.8.0)";
		String menu = "1.���� 2.�Է� 3.���� 4. ���� 0.����>";
		String input="";
		
		while(true) {
			System.out.println(menu);
			input = sc.nextLine();
			if(input.equals("0")) {
				break;
			}
			if(input.equals("1")) {
				System.out.println("-----------------------------");
				System.out.println("�й�\t�̸�\t����\t����\t����\t");
				System.out.println("-----------------------------");
				Iteration<Stu> ite = data
			}
			if(input.equals("2")) {
				Stu stu = new Stu();
				System.out.print("�й�>");
				stu.num = Integer.parseInt(sc.nextLine());
				System.out.print("�̸�>");
				stu.name = sc.nextLine();
				System.out.print("����>");
				stu.kor = Integer.parseInt(sc.nextLine());
				System.out.print("����>");
				stu.eng = Integer.parseInt(sc.nextLine());
				System.out.println("����>");
				stu.math = Integer.parseInt(sc.nextLine());
			}
		}
		System.out.println("�����մϴ�.");
		

	}

}
