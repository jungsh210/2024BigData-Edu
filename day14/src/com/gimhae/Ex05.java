package com.gimhae;

class IdException extends Exception{
	public IdException() {
		super("�ߺ����̵�");
	}
}
public class Ex05 {
	
	public static void main(String[] args) {
		try {
			func01();
		}catch(IdException e) {
			e.printStackTrace(); // error �޽��� ���
		}
	}
	
	public static void func01() throws IdException{
		throw new IdException(); // throw�� ���� ��ü ����
	}
}
