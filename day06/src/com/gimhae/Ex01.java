package com.gimhae;
/*
 * 주민번호 체크기(ver 0.2.0)
 * 숫자변환 메소드 삽입
 */
public class Ex01 {

	public static void main(String[] args) {
		final String VERSION = "0.2.0";
		String title = "주빈번호 체크기(ver "+VERSION+")";
		String menu = "주민번호>";
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);
		
		System.out.println(title);
		String input = "";
		int age = 0;
		char gender = '여';
		char[] arr;
		int year = 1900;
		while(true) {
			System.out.println(menu);
			input = sc.nextLine();
			arr = input.toCharArray();
			if(arr[6] != '-') continue;
			if(arr.length != 14) continue;
			boolean re = true;
			for(int i=0; i<arr.length; i++) {
				if(i==6) continue;
				if(!checkSu(arr[i]))re = false;
			}
			if(!re) continue;
			year += changeSu(arr[0])*10+changeSu(arr[1]);
			if(arr[7] > '2') year += 100;
			age = 2024 - year + 1;
			if(arr[7]%2 == '1'%2) gender = '남';
			break;
		}
		
		System.out.println("당신은 "+ age + "세 "+ gender+"성 입니다.");
		System.out.println("이용해주셔서 감사합니다.");
	}
	
	public static boolean checkSu(char ch) {
		if(ch<'0') return false;  // if 구문
		if(ch>'9') return false;  // if 구문
		return true;  // else 구문
	}
	
	public static int changeSu(char ch) {
		if(ch == '-') return '-';
		return ch-'0';

	}

}
