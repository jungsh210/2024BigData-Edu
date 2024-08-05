package com.gimhae;

public class Ex17 {

	public static void main(String[] args) {
		String msg1 = "abcd";
		String msg2 = "abce";
		
		System.out.println(msg1.compareTo(msg2)); // 같으면 0( == 대신)
		
		// compareTo : 문자가 얼마나 다른지(길이 차이점) 알려주는 것도 알려줌
		// 다름에서 얼마나 다른지(앞에서부터 문자단위로 하나씩 뽑아서 연산(-) 같으면 0, 다르면 음수나 양수의 값 출력
		// 모든 문자가 같을 경우 길이가 얼마나 다른지
		

	}

}
