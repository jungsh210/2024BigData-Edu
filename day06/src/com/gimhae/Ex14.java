package com.gimhae;

public class Ex14 {

	public static void main(String[] args) {
		String msg = "http://naver.com";
		
		System.out.println(msg.codePointAt(0));
		System.out.println(msg.endsWith(".com"));
		System.out.println(msg.startsWith("http"));
		
		// String msg2 = ""; // ��ü�� ������ ������ ����ִ� ��, null�� �ƴ�
		String msg2 = "abcd";
		
		System.out.println(msg2.length()==0);
		System.out.println(msg2.isEmpty()); // ��������� true, ������� ������ false
		
		System.out.println(msg.substring(7)); // () �� �ε������� ���ڿ� ���
		System.out.println(msg.substring(7,12)); // 7���� 12 �������� ���ڿ� ���
		
		System.out.println(msg.subSequence(7, 12));
		
		String msg3 = "Hello Java";
		
		System.out.println(msg3.toUpperCase()); // ���� �빮�� ��ȯ
		System.out.println(msg3.toLowerCase()); // ���� �ҹ��� ��ȯ
		System.out.println(msg3.toString()); // String������ toString�� �ٸ� �Ͱ� �ٸ��� ����
		
		
		String msg4 = "    Hello Java    ";
		System.out.println(">>>"+msg4.toString()+"<<<");
		System.out.println(">>>"+msg4.trim()+"<<<");  // trim ��� ����, �� �� ���� ����, �������� �߿�
		// �������� "java"�� �־ "   java   "�� �־ �Ȱ��� ����� ������� �ϱ� ������ �� �� ���� ����
		}

}
