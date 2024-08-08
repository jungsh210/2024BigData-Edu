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
		    System.out.println("�л� ���� ���� ���α׷� (ver 0.10.0)");

	        Scanner sc = new Scanner(System.in);

	        int choice;
	        String studentData = "";
	        String filename = "Student_Information.txt";
	        File file = new File(filename);

	        // ���α׷� ���� �� ���� ������ �ε�
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
	            String menu = "1.���� 2.�Է� (3.����) 0.����>";
	            System.out.print(menu);

	            choice = sc.nextInt();

	            if (choice == 0) {
	                System.out.println("���α׷��� �����մϴ�.");
	                break;
	            }
	            if (choice == 1) {
	                System.out.println("--------------------------------");
	                System.out.println("�й� |�̸�     |����  |����  |����  ");
	                System.out.print(studentData);
	                System.out.println("--------------------------------");
	                continue;
	            } else if (choice == 2) {
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
	                studentData += stNumber + " | " + stName + " | " + kr + " | " + en + " | " + math + "\n";
	            }
	        }

	        // ���α׷� ���� �� ���Ͽ� ������ ����
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
