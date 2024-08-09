package com.gimhae;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

public class Ex09 {

	public static void main(String[] args) throws IOException {
		File f = new File("test01.bin");
		
		String msg = "hello world";
		
		byte[] msgs = msg.getBytes();
		OutputStream os = null;
		BufferedOutputStream bos = null;
		
		try {
			os = new FileOutputStream(f);
			bos = new BufferedOutputStream(os);
			
			for(int i=0; i<msg.length(); i++) {
				bos.write(msgs[i]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(bos!=null) bos.close(); // 객체 생성과 반대로 close 해줘야 한다.
				if(os!=null) os.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		} 
	}

}
