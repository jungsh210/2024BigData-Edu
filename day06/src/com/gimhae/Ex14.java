package com.gimhae;

public class Ex14 {

	public static void main(String[] args) {
		String msg = "http://naver.com";
		
		System.out.println(msg.codePointAt(0));
		System.out.println(msg.endsWith(".com"));
		System.out.println(msg.startsWith("http"));
		
		// String msg2 = ""; // 객체는 있지만 내용이 비어있는 것, null은 아님
		String msg2 = "abcd";
		
		System.out.println(msg2.length()==0);
		System.out.println(msg2.isEmpty()); // 비어있으면 true, 비어있지 않으면 false
		
		System.out.println(msg.substring(7)); // () 안 인덱스부터 문자열 출력
		System.out.println(msg.substring(7,12)); // 7부터 12 전까지의 문자열 출력
		
		System.out.println(msg.subSequence(7, 12));
		
		String msg3 = "Hello Java";
		
		System.out.println(msg3.toUpperCase()); // 전부 대문자 변환
		System.out.println(msg3.toLowerCase()); // 전부 소문자 변환
		System.out.println(msg3.toString()); // String에서는 toString이 다른 것과 다르게 수행
		
		
		String msg4 = "    Hello Java    ";
		System.out.println(">>>"+msg4.toString()+"<<<");
		System.out.println(">>>"+msg4.trim()+"<<<");  // trim 사용 권장, 앞 뒤 공백 삭제, 웹에서는 중요
		// 웹에서는 "java"를 넣어도 "   java   "를 넣어도 똑같은 결과를 보여줘야 하기 때문에 앞 뒤 공백 삭제
		}

}
