package com.gimhae;

/*
 * finally
 * error�� �߻��ص� �ݵ�� ó����
 */

public class Ex04 {

	public static void main(String[] args) {
		int su = 1;
		try {
			int a = 1/su;
			System.out.println("a="+a);
		}catch(ArithmeticException e) {
			System.out.println("����ó��");
		}finally {
			System.out.println("�ݵ�� ó��");
		}

	}

}
