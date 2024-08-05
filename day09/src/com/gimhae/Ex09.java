package com.gimhae;

public class Ex09 {

	public static void main(String[] args) {
		// 문자열
		String msg1 = "java";
		String msg2 = new String("java");
		
		// 스레드에 안전성
		StringBuilder msg3;
		StringBuilder msg4;
		
		msg3 = new StringBuilder("ja");
		String msg5 = msg3+"va";
		String msg8 = msg3 + "17";
		StringBuilder msg6 = msg3.append("va");
		StringBuilder msg7 = msg3.append("2");
		System.out.println(msg7); // 마지막으로 최종 업데이트된 msg3를 출력
		System.out.println(msg8); // 본래 msg3에 +17을 출력

	}

}
