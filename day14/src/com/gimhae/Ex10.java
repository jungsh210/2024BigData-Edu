package com.gimhae;

import java.io.File;
import java.io.IOException;

/*
 * ���丮 ����
 */
public class Ex10 {

	public static void main(String[] args) throws IOException{
//		File f = new File("test01/ex01.txt");  // ù��°�� ���丮 �� ���� ����
		File f = new File("test01"); // ���� ���� ���� �� ���丮 ����
		
		boolean result = f.delete(); // ���丮 �� ������ ������ ���� �Ұ�, ���� ������ ���� ���� �� ����
		System.out.println(result); 

	}

}
