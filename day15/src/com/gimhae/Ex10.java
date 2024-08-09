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

public class Ex10 {

	public static void main(String[] args) throws IOException {
		File src = new File("img01.jpg");
		File target = new File("copy.jpg");
		
		InputStream is = null;
		OutputStream os = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		// ����� ����
		byte[] buf = new byte[2];
		
		try {
			is = new FileInputStream(src);
			os = new FileOutputStream(target);
			
			bis = new BufferedInputStream(is);
			bos = new BufferedOutputStream(os);
			long before = System.currentTimeMillis();
			while(true){
				int su = bis.read(buf);
				if(su==-1) break;
				bos.write(buf,0,su);
			}
			long after = System.currentTimeMillis();
			System.out.println(after-before+"ms");
			// buffered : 13ms
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis!=null) bis.close();
				if(bos!=null) bos.close(); // ��ü ������ �ݴ�� close ����� �Ѵ�.
				if(os!=null) os.close();
				if(is!=null) is.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		} 
	}

}
