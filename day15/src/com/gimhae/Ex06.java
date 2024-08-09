package com.gimhae;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex06 {

	public static void main(String[] args) throws IOException {
		File src = new File("test01.bin");
		File copy = new File("test02.bin");
		InputStream is = null;
		OutputStream os = null;
		byte[] buf = new byte[4];
		
		
		try {
			is = new FileInputStream(src);
			os = new FileOutputStream(copy);
			long before = System.currentTimeMillis();
			while(true) {
				int su = is.read(buf);
				if(su==-1) {
					break;
				}
				os.write(buf);
			}
			long after = System.currentTimeMillis();
			
			// No buffer : 608ms -> 6.08초
			// 2 buffer : 303ms -> 3.03초
			// 4 buffer : 153ms -> 1.53초
			// buffer가 두 배씩 증가하면 copy 시간은 줄어든다.
			
			System.out.println("복사완료"+(after-before)+"ms");
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(os!=null) os.close();
				if(is!=null) is.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
