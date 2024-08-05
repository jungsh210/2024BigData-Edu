package com.gimhae;

import java.util.Scanner;

public class Ex13_1 {

    public static void main(String[] args) {
        System.out.println("�л� ���� ���� ���α׷� (ver 1.4.0)");

        Scanner sc = new Scanner(System.in);
        String studentData = ""; // �л� �����͸� ������ ���ڿ� ����
        int choice;

        while (true) {
            String menu = "1.���� 2.�Է� 3.���� 4.���� 0.����>";
            System.out.print(menu);

            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("���α׷��� �����մϴ�.");
                break;
            } else if (choice == 1) {
                // �л� ���� ����
                System.out.println("--------------------------------");
                System.out.println("�й� | �̸�     | ����  | ����  | ����");
                System.out.print(studentData);  // ������ �л� �����͸� ���
                System.out.println("--------------------------------");
            } else if (choice == 2) {
                // �л� ���� �Է�
                System.out.print("�й�> ");
                int stNumber = sc.nextInt();
                System.out.print("�̸�> ");
                String stName = sc.next();
                System.out.print("����> ");
                int kr = sc.nextInt();
                System.out.print("����> ");
                int en = sc.nextInt();
                System.out.print("����> ");
                int math = sc.nextInt();

                studentData += stNumber + " | " + stName + " | " + kr + " | " + en + " | " + math + "\n";
            } else if (choice == 3) {
                // �л� ���� ����
                System.out.print("������ �л��� �й�> ");
                int stNumber = sc.nextInt();
                String[] lines = studentData.split("\n");
                studentData = "";  // �л� ������ �ʱ�ȭ

                for (String line : lines) {
                    if (line.startsWith(String.valueOf(stNumber))) {
                        // �ش� �й��� �л� ���� ����
                        String[] parts = line.split(" \\| ");
                        System.out.print("�̸�> ");
                        parts[1] = sc.next();
                        System.out.print("����> ");
                        parts[2] = String.valueOf(sc.nextInt());
                        System.out.print("����> ");
                        parts[3] = String.valueOf(sc.nextInt());
                        System.out.print("����> ");
                        parts[4] = String.valueOf(sc.nextInt());

                        line = String.join(" | ", parts);
                    }
                    studentData += line + "\n";
                }
            } else if (choice == 4) {
                // �л� ���� ����
                System.out.print("������ �л��� �й�> ");
                int stNumber = sc.nextInt();
                String[] lines = studentData.split("\n");
                studentData = "";  // �л� ������ �ʱ�ȭ

                for (String line : lines) {
                    if (!line.startsWith(String.valueOf(stNumber))) {
                        studentData += line + "\n";
                    }
                }
            } else {
                System.out.println("�߸��� �����Դϴ�. �ٽ� �������ּ���.");
            }
        }

        sc.close();
    }
}
