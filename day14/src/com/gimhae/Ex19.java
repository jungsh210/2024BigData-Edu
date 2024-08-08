package com.gimhae;

/*
 * �л� ���� ���� ���α׷�
 * IO - ������ ����۽� ������ ����
 * 1. ���� 2. �Է� (3. ����) 0. ����>
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
		System.out.println("�л� ���� ���� ���α׷� (ver 0.10.0)");
		
		java.util.Scanner sc;
		
		sc = new java.util.Scanner(System.in);
		
		int choice;
		String studentData = "";
		//String information = "�й� |�̸�     |����  |����  |����  ";
		
		while(true) {
			String menu = "1.���� 2.�Է� 3.���� 4.���� 0.����>";
			System.out.print(menu);
			
			choice = sc.nextInt();
			
			if(choice==0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			if(choice==1) {
				System.out.println("--------------------------------");
                System.out.println("�й� |�̸�     |����  |����  |����  ");
                System.out.print(studentData);
                System.out.println("--------------------------------");
                continue;
			}else if(choice==2) {
				System.out.print("�й�>");
				int stNumber = sc.nextInt();
				System.out.print("�̸�>");
				String stName = sc.next();
				System.out.print("����>");
				int kr = sc.nextInt();
				System.out.print("����>");
				int en = sc.nextInt();
				System.out.print("����>");
				int math = sc.nextInt();
				studentData += "�й� |�̸�     |����  |����  |����  "+"\n"+
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
			System.out.println("�ۼ� �Ϸ�");
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
