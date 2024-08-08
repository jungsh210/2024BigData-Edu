package com.gimhae;

import java.io.File;

/*
 * 파일 삭제
 */

public class Ex07 {

	public static void main(String[] args) {
		File f = new File("ex01.txt");
		
		if(f.exists()) { // 파일이 존재하면
			boolean result = f.delete();
			System.out.println("지웠습니다." + result);
		} else {
			System.out.println("존재하지 않음");
		}

	}

}
