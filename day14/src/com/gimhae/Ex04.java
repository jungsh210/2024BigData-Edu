package com.gimhae;

/*
 * finally
 * error가 발생해도 반드시 처리됨
 */

public class Ex04 {

	public static void main(String[] args) {
		int su = 1;
		try {
			int a = 1/su;
			System.out.println("a="+a);
		}catch(ArithmeticException e) {
			System.out.println("예외처리");
		}finally {
			System.out.println("반드시 처리");
		}

	}

}
