package com.gimhae;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex04 {
	static File f = new File("test01.bin");
	
	public static void main(String[] args) {
		OutputStream os = null;
		try {
			f.createNewFile();
			os = new FileOutputStream(f);
//			os.write(45);
//			os.write(66);
//			os.write(67);
			
			os.write(new byte[] {97,98,99,100});
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(os!=null) os.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
