package com.gimhae;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Ex14 {

	public static void main(String[] args) {
		// 학생성적관리프로그램(ver 0.8.0)
		// 1.보기(오른차순, 내림차순) 2.입력 3.수정 4. 삭제 0.종료>
		// Set 사용
		System.out.println("학생성적관리프로그램(ver 0.8.0)");
		Scanner sc = new java.util.Scanner(System.in);
		
		int choice = 0;
		int total;
		int stNumber = 0;
		String stName = "";
		int kr = 0;
		int en = 0;
		int math = 0;
		
		System.out.print("총원>");
		total = sc.nextInt();
		
		Set<String> set = new TreeSet<>();
		Set<String> set1 = new TreeSet<>();
		
		while(true) {
			System.out.print("1.보기 2.입력 3.수정 4. 삭제 0.종료>");
			choice = sc.nextInt();
			if(choice == 0) {
				System.out.println("종료합니다.");
				break;
			}
			if(choice == 1) {
				System.out.println("------------------------------------");
				System.out.println("학번 |이름     |국어  |영어  |수학  ");
				System.out.println(set);
				System.out.println(set1);
				System.out.println("------------------------------------");
				continue;
			}
			else if(choice == 2) {
				if(set.size()==total) {
					System.out.println("더 작성할 학생이 없습니다.");
					continue;
				}
				System.out.print("학번>");
				stNumber = sc.nextInt();
				System.out.print("이름>");
				stName = sc.next();
				System.out.print("국어>");
				kr = sc.nextInt();
				System.out.print("영어>");
				en = sc.nextInt();
				System.out.print("수학>");
				math = sc.nextInt();
				for(int i=0; i<total; i++) {
					set.add(stNumber + " | " + stName + " | " + kr + " | " + en + " | " + math+"\n");	
				}
			}
			else if(choice == 3) {
				System.out.println("수정할 학생의 학번>");
				int newNumber = sc.nextInt();
				if(newNumber==stNumber) {
					stNumber.remove(set);
					System.out.println("학번>");
					stNumber = sc.nextInt();
					System.out.println("이름>");
					stName = sc.next();
					System.out.println("국어>");
					kr = sc.nextInt();
					System.out.println("영어>");
					en = sc.nextInt();
					System.out.println("수학>");
					math = sc.nextInt();
					for(int i=0; i<set.size(); i++) {
						set.add(stNumber + " | " + stName + " | " + kr + " | " + en + " | " + math+"\n");	
					}
				} else {
					System.out.println("수정할 학생의 학번이 없습니다.");
				}
			}
		}
	}

}
