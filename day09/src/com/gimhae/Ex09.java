package com.gimhae;

public class Ex09 {

	public static void main(String[] args) {
		// ���ڿ�
		String msg1 = "java";
		String msg2 = new String("java");
		
		// �����忡 ������
		StringBuilder msg3;
		StringBuilder msg4;
		
		msg3 = new StringBuilder("ja");
		String msg5 = msg3+"va";
		String msg8 = msg3 + "17";
		StringBuilder msg6 = msg3.append("va");
		StringBuilder msg7 = msg3.append("2");
		System.out.println(msg7); // ���������� ���� ������Ʈ�� msg3�� ���
		System.out.println(msg8); // ���� msg3�� +17�� ���

	}

}
