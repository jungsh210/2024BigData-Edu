package com.gimhae;

public class Ex12 {

	public static void main(String[] args) {
		
		// StringBuffer�� ���� 16 -> 34(17�� 2��) -> 70(35�� 2��) -> 142(71�� 2��) ��Ģ���� �÷�������
		// �޸𸮸� ȿ�������� ����Ϸ��� StringBuilder�� StringBuffer�� ����ϴ� ���� ������,
		// StringBuffer�� StringBuilder�� �ͼ����� ������ ������ ���� ���ɼ��� ũ��.
		// �ͼ����� ������, ���ݾ� ����غ��� ���� ��õ
		
		StringBuffer sb = new StringBuffer();
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("-----------------");
		
		sb.append("java");
		
		System.out.println(sb.length()); // ���̴� �þ����
		System.out.println(sb.capacity()); // capacity�� �þ�� ����
		System.out.println("-----------------");
		for(int i=0; i<16; i++)
		sb.append("a");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("-----------------");
		for(int i=0; i<17; i++)
		sb.append("a");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}

}
