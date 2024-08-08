package com.gimhae;

import java.io.File;
import java.io.IOException;

/*
 * io
 * 
 */

public class Ex06{

	public static void main(String[] args) throws IOException{
		java.io.File file;
		// 상대 경로 - 현재 기준("./ex01.txt");
//		file = new File("./ex01.txt"); // 파일은 day14에 저장되어 있어야 함
		
		// 절대 경로
		file = new File("C:\\workspace\\day14\\ex01.txt");
		
		System.out.println(file.exists());
		System.out.println("디렉토리"+file.isDirectory());
		System.out.println("파일"+file.isFile());
		
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath()); // 절대 경로 포함하여 출력
		System.out.println(file.getCanonicalPath()); // 절대 경로 출력, IOExcpetion이 있어야 함
		
		System.out.println("------------------------");
		System.out.println(file.getParent());
		System.out.println(file.getName());
		
		System.out.println(file.canRead()); // 읽기
		System.out.println(file.canWrite()); // 쓰기, 읽기 전용 파일에는 false
		System.out.println(file.canExecute()); // 실행
		
		System.out.println(file.length()+"byte"); // 파일 크기
		
		System.out.println(file.lastModified()); // 파일 날짜, long 타입
		
		System.out.println(new java.util.Date(file.lastModified())); // 파일 날짜, 시간
		
		
	}

}
