package com.gimhae;

public class Ex10 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("java");  
		// StringBuilder�� ������ �� �ִ��� �ٸ� ������ ������ϴ� �� ����
		sb.append("DB");
		sb.append("Web");
		sb.append("Spring");
		
		System.out.println(sb);
		
		sb.replace(4, 6, "DataBase");
		
		System.out.println(sb);
		
		sb.delete(12, 15);
		
		System.out.println(sb);
		
		sb.insert(12, "WEB");
		
		System.out.println(sb);
		
		System.out.println(sb.charAt(0));
		
		char[] arr = new char[sb.length()];
		sb.getChars(0, sb.length()-1, arr, 0);
		System.out.println(java.util.Arrays.toString(arr));
		System.out.println(sb.indexOf("Data"));
		sb.delete(4, sb.length());
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.setCharAt(0, 'j');
		System.out.println(sb);
		System.out.println(sb.toString());
		
		

	}

}
