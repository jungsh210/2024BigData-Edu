package com.gimhae;

public class Ex12 {

	public static void main(String[] args) {
		String msg = "a ab abc abcd";
		
		System.out.println(msg.charAt(3)); // Ư�� �ε��� �� ��������
		System.out.println(msg.indexOf('d'));
		System.out.println(msg.indexOf('b', 4));
		System.out.println(msg.lastIndexOf('b'));
		System.out.println(msg.indexOf("ab"));
		System.out.println(msg.indexOf("ab",3));
		
		System.out.println(msg.contains("abcdf"));  // ���ڿ� �ִ���
	}

}
