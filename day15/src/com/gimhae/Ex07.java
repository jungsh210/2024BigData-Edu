package com.gimhae;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Ex07 {

	public static void main(String[] args) throws IOException {
		File f = new File("test01.bin");
		
		Reader fr = null;
		
		char[] cbuf = new char[2]; // 문자를 두개씩 저장
		try {
			fr = new FileReader(f);
			while(true) {
				int su = fr.read(cbuf);
				if(su==-1) break;
				System.out.println(new String(cbuf));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr!=null) fr.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
