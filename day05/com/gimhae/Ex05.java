package com.gimhae;
/*
 * 주민번호 체크(ver 0.1.0)
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

public class Ex05 {
    // 문자 배열을 정수로 변환 가능한지 확인하는 메서드
    public static boolean isValidNumber(final char[] arr) {
        for (char c : arr) {
            // '-' 문자는 예외로 처리하고 나머지 문자가 숫자인지 확인
            if (c != '-' && !Character.isDigit(c)) {
                return false; // 숫자가 아니면 유효하지 않음
            }
        }
        return true; // 모든 문자가 숫자 또는 '-'만 있는 경우 유효함
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.println("주민번호 체크(ver 0.1.0)");
        
        while (true) {
        	System.out.println("주민번호>");
            String number = sc.nextLine();
            
            // 주민번호 길이 및 하이픈 검증
            if (number.charAt(6) != '-') {
                System.out.println("다음의 출력포멧 000000-0000000으로 입력하세요");
                continue;
            }
            
            if(number.length() < 14) {
				System.out.println("입력자리수가 부족합니다.");
				continue;
			}
            
            char[] numberArray = number.toCharArray();
            
            // 입력된 주민번호 부분이 숫자인지 확인
            boolean isValid = isValidNumber(numberArray);
            if (!isValid) {
                System.out.println("잘못 입력되었습니다.");
                continue;
            }
            
            char genderCode = numberArray[7];
            String gender = "";
            char ageCode1 = numberArray[0];
            char ageCode2 = numberArray[1];
            int age;
            int birthYear = 0;
            
            // 성별 판별
            if (genderCode == '1' || genderCode == '3') {
                gender = "남성";
            } else if (genderCode == '2' || genderCode == '4') {
                gender = "여성";
            } else {
                System.out.println("잘못된 주민번호 형식입니다.");
                continue;
            }
            
            // 출생 연도 계산
            if (genderCode == '1' || genderCode == '2') {
                birthYear = 1900 + Integer.parseInt("" + ageCode1 + ageCode2);
            } else if (genderCode == '3' || genderCode == '4') {
                birthYear = 2000 + Integer.parseInt("" + ageCode1 + ageCode2);
            }
            
            // 나이 계산
            age = 2024 - birthYear + 1;
            
            // 출력
            System.out.println("당신은 " + age + "세 " + gender + "입니다.");
        }
    }
}

