package com.gimhae;

public class Ex08 {

	public static void main(String[] args) {
		// Number num = new Number(); // �߻� Ŭ����
		Number num1 = new Integer(1);
		Number num2 = new Double(3.14);
		Number num3 ;
		num3 = 1.0+1;
		System.out.println(num3);
		System.out.println(div(5,2)); // �⺻ �ڷ����� Number�� ��ӹް� �ִ� div �޼��� ���

	}
	public static Number div(int a, int b) {
		if(a%b!=0) {
			return 1.0*a/b;
		}
		return a/b;
	}

}
