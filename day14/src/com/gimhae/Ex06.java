package com.gimhae;

import java.io.File;
import java.io.IOException;

/*
 * io
 * 
 */

public class Ex06{

	public static void main(String[] args) throws IOException{
		java.io.File file;
		// ��� ��� - ���� ����("./ex01.txt");
//		file = new File("./ex01.txt"); // ������ day14�� ����Ǿ� �־�� ��
		
		// ���� ���
		file = new File("C:\\workspace\\day14\\ex01.txt");
		
		System.out.println(file.exists());
		System.out.println("���丮"+file.isDirectory());
		System.out.println("����"+file.isFile());
		
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath()); // ���� ��� �����Ͽ� ���
		System.out.println(file.getCanonicalPath()); // ���� ��� ���, IOExcpetion�� �־�� ��
		
		System.out.println("------------------------");
		System.out.println(file.getParent());
		System.out.println(file.getName());
		
		System.out.println(file.canRead()); // �б�
		System.out.println(file.canWrite()); // ����, �б� ���� ���Ͽ��� false
		System.out.println(file.canExecute()); // ����
		
		System.out.println(file.length()+"byte"); // ���� ũ��
		
		System.out.println(file.lastModified()); // ���� ��¥, long Ÿ��
		
		System.out.println(new java.util.Date(file.lastModified())); // ���� ��¥, �ð�
		
		
	}

}
