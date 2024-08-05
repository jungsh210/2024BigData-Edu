package com.gimhae;
/*
 * 주민번호 체크(ver 0.3.0)
 * 주민번호> 991231-1234567
 * 
 * 당신은 00세 남성입니다.
 *-------------------------------
 * 주민번호> 1234561234567
 * 다음의 출렷포멧 000000-0000000으로 입력하세요
 * 주민번호> 123456-123456
 * 입력자리수가 부족합니다.
 * 주민번호>a12345-1234567
 * 주민번호는 숫자로만 구성되어야 합니다.
 */

public class Ex18 {

	public static void main(String[] args) {
		// String msg = "12";
		
		// 문자열 -> 10빈수 정수 변환
		// int su = Integer.parseInt(msg);
		
		// System.out.println(su);
		
		// 주민번호 체크기(ver 0.3.0)
		// 한글 지원
		System.out.println("주민번호 체크기(ver 0.3.0)");
		while(true) {
			int year = 2024;
			String gender;
			String number;
			
			System.out.println("주민번호>");
			java.util.Scanner sc = new java.util.Scanner(System.in);
			number = sc.next();
			
			if(number.length() > 14 || number.charAt(6)!='-') {
				System.out.println(number.length()+"자리이고,"+" 입력자리수가 너무 많습니다. 14자리로 입력해주세요.");
				System.out.println("다음의 출렷포멧 000000-0000000으로 입력하세요.");
				continue;
			}else if(number.length() < 14 || number.charAt(6)!='-') {
				System.out.println(number.length()+"자리이고,"+" 입력자리수가 적습니다. 14자리로 입력해주세요.");
				System.out.println("다음의 출렷포멧 000000-0000000으로 입력하세요.");
				continue;
			}
			String genderCode = number.substring(7,8);
			String ageCode = number.substring(0,1);
			int birthYear = 0;
			int age = 0;
			
			// 수정해야 함
			// 연도 계산
			if(genderCode.equals("1") || genderCode.equals("2")) {
				birthYear = 1900 + Integer.parseInt(ageCode);
			}else if(genderCode.equals("3") || genderCode.equals("4")) {
				birthYear = 2000 + Integer.parseInt(ageCode);
			}
			
			age = year - birthYear + 1;
			
			if(age < 0) {
				age = -age;
			}
			
			if(genderCode.equals("1") || genderCode.equals("3")) {
				gender = "남성";
			}else {
				gender = "여성";
			}
			
			System.out.println("당신은 " + age + "세 "+ gender + "입니다.");
		}
		
	}

}
