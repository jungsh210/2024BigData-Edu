package com.gimhae;

import java.io.File;
import java.io.IOException;

/*
 * ���� ����
 */

public class Ex08 {

	public static void main(String[] args) throws IOException{
		File f = new File("ex01.txt");
		
		if(f.exists()) {
			System.out.println("�����մϴ�.");
		}else {
			boolean result = f.createNewFile();
			System.out.println("������ ��������ϴ�.");
		}

	}

}
