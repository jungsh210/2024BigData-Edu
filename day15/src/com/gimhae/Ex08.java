package com.gimhae;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Ex08 {

	public static void main(String[] args) throws IOException {
		File f = new File("test01.bin");
		InputStream is = null;
		
		BufferedInputStream bis = null;
		
		try {
			is = new FileInputStream(f);
			bis = new BufferedInputStream(is);
			while(true) {
				int su = bis.read();
				if(su==-1) break;
				System.out.println((char)su);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(bis!=null) bis.close(); // 객체 생성과 반대로 close 해줘야 한다.
				if(is!=null) is.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		} 
	}

}
