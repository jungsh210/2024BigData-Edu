package com.gimhae;

public class Ex09 implements Cloneable{  
	// Cloneable �������̽��� ���� �ƹ��͵� ������ �ȵǾ��ִ� �������� �������̽��� Ex09�� ��������ν� clone ��� ����

	public static void main(String[] args) throws Exception{
		Ex09 me = new Ex09();
		Object obj = me.clone();
		System.out.println(me);
		System.out.println(obj);
		// me�� obj�� ���� �ٸ� ��ü�� ����Ű�� �ִ�.
		

	}

}
