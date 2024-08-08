package com.gimhae;

/*
 * ���� ó��
 * ���� - ������ �߻��� �� �ִ� ��Ȳ ȸ��
 * 
 * try{���ܰ� �߻��� �� �ִ� ����} catch(exception e){ó��}
 * 
 */
public class Ex01 {

	public static void main(String[] args) {
		int a = 1;
		int b = 0; // b�� 0�̸� error �߻�
		int c = 0;
		
		// b�� 0�� ���� ��Ȳ�� ���ϱ� ���� ���� - ��� �ؿԴ� ���
//		if(b!=0) {
//			c = a/b;
//		} else {
//			c = 0;
//		}
		
		try {
			c = a/b; // ���ܰ� �߻��ϸ� catch �κ����� �Ѿ, try�� �ִ� ���� ó�� x
			
		}catch (ArithmeticException e){ // Exception�� �߻��ϸ� -> (���� ó��)
			c = 0;
		}
		
		System.out.println(a+"��"+b+"="+c);

	}

}
