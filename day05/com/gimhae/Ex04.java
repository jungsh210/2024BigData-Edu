package com.gimhae;

public class Ex04 {
	
	// String 형의 매개변수를 입력으로 받음 -> String[] : length가 0인 배열 생성
	//public static void main(String[] args){
	//	 System.out.println(args.length);
	// }
	// class 파일 실행 시 java Ex04 -> 0을 출력
	// java Ex04 111 -> 1을 출력
	// ("111"이라는 문자열을 args에 전달하고, args에 전달된 문자열이 String[] 배열에 저장)
	
	public static void main(String[] args) { 
		String[] arr1 = new String[3];
		arr1[0] = "item1";
		arr1[1] = "item2";
		arr1[2] = "item3";
		
		String[] arr2 = new String[] {"Item1","Item2","Item3"};  // arr1 축약, 사용 추천, 갯수를 지정안해줘도 됨
		
		String[] arr3 = {"ITEM1","ITEM2","ITME3"};  // 추천 X
		
		for(int i=0; i<arr1.length;i++) {
			System.out.println(arr1[i]);
			System.out.println(arr2[i]);
			System.out.println(arr3[i]);
		}

	}

}
