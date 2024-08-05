package com.gimhae;

/*
 * 학생성적관리프로그램(ver 1.4.0)
 * 
 * 1.보기 2.입력 3.수정 4.삭제 0.종료>
 * 
 * 학번, 이름, 국어, 영어, 수학 입력 받기
 * 총원 지정 X
 * 
 * 객체 student 생성(Class Student 생성)
 */
public class Ex13 {

	public static void main(String[] args) {
		System.out.println("학생 성적 관리 프로그램 (ver 1.4.0)");
		
		java.util.Scanner sc;
		
		sc = new java.util.Scanner(System.in);
		
		int choice;
		String studentData = "";
		
		while(true) {
			String menu = "1.보기 2.입력 3.수정 4.삭제 0.종료>";
			System.out.print(menu);
			
			choice = sc.nextInt();
			
			if(choice==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			if(choice==1) {
				System.out.println("--------------------------------");
                System.out.println("학번 |이름     |국어  |영어  |수학  ");
                System.out.print(studentData);
                System.out.println("--------------------------------");
                continue;
			}else if(choice==2) {
				System.out.print("학번>");
				int stNumber = sc.nextInt();
				System.out.print("이름>");
				String stName = sc.next();
				System.out.print("국어>");
				int kr = sc.nextInt();
				System.out.print("영어>");
				int en = sc.nextInt();
				System.out.print("수학>");
				int math = sc.nextInt();
				studentData += stNumber + " | " + stName + " | " + kr + " | " + en + " | " + math + "\n";
			}
		}
	}

}
