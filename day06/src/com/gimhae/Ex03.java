package com.gimhae;

/*
 * 학생성적관리 프로그램(ver 1.2.0)
 * 1.목록 2.입력 3.상세보기 0. 종료> 3
 * 학번 > 1
 * 국어 > 90
 * 영어 > 80
 * 수학 > 70
 * 합계 > 000
 * 평균 > 00.00(소수 둘째자리까지)
 * 학점 > A(~90)
 * 학점 > B(~80)
 * 학점 > C(~70)
 * 학점 > D(~60)
 * 학점 > F(60미만)
 */

public class Ex03 {

	public static void main(String[] args) {
		final String VERSION = "1.2.0"; 
		String title = "학생성적관리 프로그램(ver "+VERSION+")";
		String menu = "1.목록 2.입력 3.상세보기 0.종료>";
		String table = "---------------------------------";
		table+="학번\t국어\t영어\t수학\n";
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
		System.out.println("이용해주셔서 감사합니다.");
	}

}
