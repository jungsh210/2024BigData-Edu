/*
 * 학생성적관리프로그램(ver 0.1.0)
 * 
 * 총원>3
 * 
 * 1.보기 2. 입력>1
 * -------------------------
 * 학번 |국어  |영어  |수학
 * -------------------------
 * -------------------------
 * 1.보기 2. 입력>2
 * 학번>1
 * 국어>90
 * 영어>80
 * 수학>70
 * 
 * 1.보기 2. 입력>1
 * -------------------------
 * 학번 |국어  |영어  |수학
 * -------------------------
 * 1    |90    |80    |70
 * 
 * 1.보기 2. 입력>2
 * 학번>2
 * 국어>90
 * 영어>80
 * 수학>70
 
 * 1.보기 2. 입력>1
 * -------------------------
 * 학번 |국어  |영어  |수학
 * -------------------------
 * 1    |90    |80    |70
 * 2    |90    |80    |70
 * 
 * ...
 * 3번의 학생 수가 다차면
 * 1.보기 2.입력>2
 * 더이상 입력할 학생이 없습니다.
 */
class Ex01 {
	public static void main(String[] args) {
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);
		
		System.out.println("주민번호 체크(ver 0.1.0)");
		System.out.println("주민번호>");
		
		int year = 2024;
		String gender;
		
		String number = sc.next();
		
		String genderCode = number.substring(7, 8);
		
		if(genderCode.equals("1") || genderCode.equals("3")) {
			gender = "남성";
		}else if(genderCode.equals("2") || genderCode.equals("4")) {
			gender = "여성";
		}
		
		String ageCode = number.substring(0,2);
		
		int age;
		int birthyear;
		
		if(ageCode.equals("1") || ageCode.equals("2")) {
			birthyear = 1900+Integer.parseInt(ageCode);
			System.out.print(birthyear);
		}else if(ageCode.equals("3") || ageCode.equals("4")) {
			birthyear = 2000+Integer.parseInt(ageCode);
			System.out.print(birthyear);
		}	
	}

}
