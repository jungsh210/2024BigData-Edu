package com.gimhae;

public class Ex02 {

	public static void main(String[] args) {
		// 10���� ����Ÿ��
		int su = 11111;
		Integer su2 = new Integer(22222); // ���ڿ��� ���ڷ� ��ȯ
		System.out.println(su2+1);
		Integer su3 = new Integer("-3333");
		System.out.println(su3);
		Integer su4 = 4444; // ����ڽ� - ��üȭ
		System.out.println(su+1);
		int su5 = new Integer(5555); // ��ڽ�
		System.out.println(su5+1);
		
		System.out.println(Integer.MIN_VALUE); // Integer ������(�ּ�)
		System.out.println(Integer.MAX_VALUE); // Integer ������(�ִ�)
		

	}

}
