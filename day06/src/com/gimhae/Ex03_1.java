package com.gimhae;

public class Ex03_1 {

	public static void main(String[] args) {
		final String VERSION = "1.2.0"; 
		String title = "학생성적관리 프로그램(ver "+VERSION+")";
		String menu = "1.목록 2.입력 3.상세보기 0.종료>";
		String table = "---------------------------------\n";
		table+="학번\t국어\t영어\t수학\n";
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
				System.out.println("국어>");
				stu[0] = sc.nextInt();
				System.out.println("영어>");
				stu[1] = sc.nextInt();
				System.out.println("수학>");
				stu[3] = sc.nextInt();
				data[]=stu;
			}
			if(input == 3) {
				System.out.println("학번>");
				input = sc.nextInt();
				System.out.println("----------------------------");
				System.out.println("국어:"+"영어:"+"수학:");
				System.out.println("----------------------------");
				System.out.println("합계>");
				System.out.println("평균>");
				System.out.println("학점>");
			}
		}
		System.out.println("이용해주셔서 감사합니다.");

	}

}
