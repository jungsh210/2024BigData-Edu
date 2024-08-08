package com.gimhae;

import java.io.File;
import java.io.IOException;

/*
 * 디렉토리 삭제
 */
public class Ex10 {

	public static void main(String[] args) throws IOException{
//		File f = new File("test01/ex01.txt");  // 첫번째로 디렉토리 안 파일 삭제
		File f = new File("test01"); // 내부 파일 삭제 후 디렉토리 삭제
		
		boolean result = f.delete(); // 디렉토리 안 파일이 있으면 삭제 불가, 내부 파일을 먼저 지운 후 삭제
		System.out.println(result); 

	}

}
