package com.gimhae;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Ex19_1 {

	public static void main(String[] args) {
		    System.out.println("학생 성적 관리 프로그램 (ver 0.10.0)");

	        Scanner sc = new Scanner(System.in);

	        int choice;
	        String studentData = "";
	        String filename = "Student_Information.txt";
	        File file = new File(filename);

	        // 프로그램 시작 시 기존 데이터 로드
	        if (file.exists()) {
	            try (InputStream is = new FileInputStream(file)) {
	                byte[] buffer = new byte[(int) file.length()];
	                is.read(buffer);
	                studentData = new String(buffer);
	            } catch (FileNotFoundException e) {
	                e.printStackTrace();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }

	        while (true) {
	            String menu = "1.보기 2.입력 (3.수정) 0.종료>";
	            System.out.print(menu);

	            choice = sc.nextInt();

	            if (choice == 0) {
	                System.out.println("프로그램을 종료합니다.");
	                break;
	            }
	            if (choice == 1) {
	                System.out.println("--------------------------------");
	                System.out.println("학번 |이름     |국어  |영어  |수학  ");
	                System.out.print(studentData);
	                System.out.println("--------------------------------");
	                continue;
	            } else if (choice == 2) {
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
	                studentData += stNumber + " | " + stName + " | " + kr + " | " + en + " | " + math + "\n";
	            }
	        }

	        // 프로그램 종료 시 파일에 데이터 저장
	        try (OutputStream os = new FileOutputStream(file)) {
	            byte[] content = studentData.getBytes();
	            os.write(content);
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	}

}
