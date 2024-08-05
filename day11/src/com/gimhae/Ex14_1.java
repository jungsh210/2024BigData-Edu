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
		
		String title = "학생성적관리프로그램(ver 0.8.0)";
		String menu = "1.보기 2.입력 3.수정 4. 삭제 0.종료>";
		String input="";
		
		while(true) {
			System.out.println(menu);
			input = sc.nextLine();
			if(input.equals("0")) {
				break;
			}
			if(input.equals("1")) {
				System.out.println("-----------------------------");
				System.out.println("학번\t이름\t국어\t영어\t수학\t");
				System.out.println("-----------------------------");
				Iteration<Stu> ite = data
			}
			if(input.equals("2")) {
				Stu stu = new Stu();
				System.out.print("학번>");
				stu.num = Integer.parseInt(sc.nextLine());
				System.out.print("이름>");
				stu.name = sc.nextLine();
				System.out.print("국어>");
				stu.kor = Integer.parseInt(sc.nextLine());
				System.out.print("영어>");
				stu.eng = Integer.parseInt(sc.nextLine());
				System.out.println("수학>");
				stu.math = Integer.parseInt(sc.nextLine());
			}
		}
		System.out.println("감사합니다.");
		

	}

}
