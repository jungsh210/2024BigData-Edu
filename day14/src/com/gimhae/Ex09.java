package com.gimhae;

import java.io.File;
import java.io.IOException;

/*
 * ���丮 ����
 */

public class Ex09 {

	public static void main(String[] args) throws IOException{
		File f = new File("test01");
		
		boolean result = f.mkdir();
		if(result) {
			System.out.println("��������ϴ�.");
		} else {
			boolean reslut = f.createNewFile();
			System.out.println("������ ��������ϴ�." + result);
		}

	}

}
