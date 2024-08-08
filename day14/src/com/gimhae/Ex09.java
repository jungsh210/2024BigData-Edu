package com.gimhae;

import java.io.File;
import java.io.IOException;

/*
 * 디렉토리 생성
 */

public class Ex09 {

	public static void main(String[] args) throws IOException{
		File f = new File("test01");
		
		boolean result = f.mkdir();
		if(result) {
			System.out.println("만들었습니다.");
		} else {
			boolean reslut = f.createNewFile();
			System.out.println("파일을 만들었습니다." + result);
		}

	}

}
