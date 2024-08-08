package com.gimhae;

/*
 * 내가 짠 코드
 */

import java.io.File;
import java.util.Scanner;
import java.util.Date;

/* 사용자에게 주소를 입력받으면 해당 디렉토리 안 파일들 확인 기능
 * > C:\workspace\day14
 * rwx 오전 11:40   <DIR>
 * rwx 오전 09:03   <DIR>
 * rwx 오전 09:03   <DIR>
 * rwx 오전 09:03   <DIR>
 * r-x 오전 09:03   <DIR>
 * rwx 오전 09:03   <DIR>
 * rwx 오전 09:03   <DIR>
 * rwx 오전 09:03   <DIR>
 * 
 */
public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">");
		
		String input = sc.next();
		
		File f = new File(input); // C:\workspace\day14\src\com\gimhae만 들어있음, gimhae 폴더에 접속
		
		if(f.isDirectory()) {
			String[] fn = f.list();
			
//			System.out.println(f); // C:\workspace\day14\src\com\gimhae 출력 
			
			for(int i=0; i<fn.length; i++) {
				
//				System.out.println(fn[i]); // 파일 이름만 담겨져 있음
				
				// 이렇게 해야 C:\workspace\day14\src\com\gimhae\파일 이름으로 설정됨
				
				File dir = new File(f, fn[i]); // gimhae 파일 안 파일에 접근 가능
				
//				System.out.println(dir);
				
				String r;
                String w;
                String x;
                long len = 0;
                String dirn = null;
                
                if (dir.canRead()) {
                    r = "r";
                } else {
                    r = "-";
                }
                
                if (dir.canWrite()) {
                    w = "w";
                } else {
                    w = "-";
                }
                
                if (dir.canExecute()) {
                    x = "x";
                } else {
                    x = "-";
                }
                if(dir.isFile()) {
                	len = dir.length();
                	dirn = "FILE";
                }
                if(dir.isDirectory()){
                	dirn = "DIR";
                }
                System.out.println(r + w + x + " " +new Date(dir.lastModified())+ " " +"["+len+"]"+" "+"["+dirn+"]"+" "+fn[i]);
				
			}
		}
		
	}
}