package com.gimhae;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex15 {

	public static void main(String[] args) throws IOException {
		String msg = "한글 입력";
		
		byte[] arr1 = msg.getBytes();
		
		File f = new File("target01.txt");
		
		OutputStream os = null;
		
		try {
			os = new FileOutputStream(f);
			for(int i=0; i<arr1.length; i++) {
				os.write(arr1[i]);
				System.out.println("작성 완료");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(os!=null) os.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}

	}

}
