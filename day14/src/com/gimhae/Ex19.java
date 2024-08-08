package com.gimhae;

/*
 * 학생 성적 관리 프로그램
 * IO - 종료후 재시작시 데이터 유지
 * 1. 보기 2. 입력 (3. 삭제) 0. 종료>
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class Ex19 {

	public static void main(String[] args) throws IOException{
		System.out.println("학생 성적 관리 프로그램 (ver 0.10.0)");
		
		java.util.Scanner sc;
		
		sc = new java.util.Scanner(System.in);
		
		int choice;
		String studentData = "";
		//String information = "학번 |이름     |국어  |영어  |수학  ";
		
		while(true) {
			String menu = "1.보기 2.입력 3.수정 4.삭제 0.종료>";
			System.out.print(menu);
			
			choice = sc.nextInt();
			
			if(choice==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			if(choice==1) {
				System.out.println("--------------------------------");
                System.out.println("학번 |이름     |국어  |영어  |수학  ");
                System.out.print(studentData);
                System.out.println("--------------------------------");
                continue;
			}else if(choice==2) {
				System.out.print("학번>");
				int stNumber = sc.nextInt();
				System.out.print("이름>");
				String stName = sc.next();
				System.out.print("국어>");
				int kr = sc.nextInt();
				System.out.print("영어>");
				int en = sc.nextInt();
				System.out.print("수학>");
				int math = sc.nextInt();
				studentData += "학번 |이름     |국어  |영어  |수학  "+"\n"+
						stNumber + " | " + stName + " | " + kr + " | " + en + " | " + math + "\n";
			}
			
		}
		File f = new File("Student_Information.txt");
		try {
			f.createNewFile();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		java.io.OutputStream os = null;
		
		try {
			os = new FileOutputStream(f);
			byte[] content = studentData.getBytes();
			//byte[] content1 = information.getBytes();
			//os.write(content1);
			os.write(content);
			System.out.println("작성 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(os!=null) {
					os.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
	}

}
