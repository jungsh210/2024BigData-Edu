package com.gimhae;

public class ex15 {

	public static void main(String[] args) {
		int su = 25;
		char ch = 'A';
		
		System.out.println("20"+su); //문자열과 더하면 문자열이 된다.
		System.out.println("20"+ch);
		System.out.println(20+String.valueOf(su));
		System.out.println(20+String.valueOf(ch));
		
		System.out.println(String.join(",", "java","web","framework"));
		System.out.println(String.join("+", "5","2"));

	}

}
