package com.gimhae;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex13 {

	public static void main(String[] args) throws IOException {
		// 파일 읽기
		
		File f = new File("target01.txt");
		java.io.InputStream is = null;
		try {
			is = new FileInputStream(f);
			int su = is.read();
			System.out.println(su);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(os!=null) {
					os.close();
				}
			}
		}

	}

}
