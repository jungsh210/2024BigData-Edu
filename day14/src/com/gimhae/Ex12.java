package com.gimhae;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex12 {

	public static void main(String[] args) throws IOException {
		
		// target01.txt 파일 생성
		File f = new File("target01.txt");
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/////////////
		
		java.io.OutputStream os = null; // OutputStream은 추상 클래스
		
		try {
			os = new FileOutputStream(f);
			os.write(65); // 알파벳 A 작성
			System.out.println("작성 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(os!=null) {
					os.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
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
