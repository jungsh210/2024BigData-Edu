package com.gimhae;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex14 {

	public static void main(String[] args) {
		File src = new File("img01.jpg");
		
		File copy = new File("copy01.jpg");
		
		InputStream is = null;
		
		OutputStream os = null;
		
		try {
			copy.createNewFile();
			is = new FileInputStream(src);
			os = new FileOutputStream(copy);
			
			int su =- 1;
			long before = System.currentTimeMillis();
			while(true) {
				su = is.read();
				if(su==-1) {
					break;
				}
				os.write(su);
			}
			System.out.println("����Ϸ�");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(os!=null)os.close();
				if(is!=null)is.close();
			} catch()
		}
	}
}

