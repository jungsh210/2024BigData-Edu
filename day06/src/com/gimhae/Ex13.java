package com.gimhae;

public class Ex13 {

	public static void main(String[] args) {
		
		String msg = "a ab abc abcd";
		
		String msg2 = msg.replace('a', 'A');
		
		String msg3 = msg.replace(" abc", " Abc");
		
		String msg4 = msg.replace("abc", "");
		
		String msg5 = msg.replace("ab abc", "ab @ abc ");
		
		System.out.println(msg2);
		System.out.println(msg3);
		System.out.println(msg4);
		System.out.println(msg5);
	}

}
