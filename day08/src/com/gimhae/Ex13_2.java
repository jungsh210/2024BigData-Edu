package com.gimhae;

import java.util.Scanner;

class Student {
    private int stNumber;
    private String stName;
    private int kr;
    private int en;
    private int math;

    public Student(int stNumber, String stName, int kr, int en, int math) {
        this.stNumber = stNumber;
        this.stName = stName;
        this.kr = kr;
        this.en = en;
        this.math = math;
    }

    public int getStNumber() {
        return stNumber;
    }

    public String getStName() {
        return stName;
    }

    public int getKr() {
        return kr;
    }

    public int getEn() {
        return en;
    }

    public int getMath() {
        return math;
    }

    public void newStName(String stName) {
        this.stName = stName;
    }

    public void newKr(int kr) {
        this.kr = kr;
    }

    public void newEn(int en) {
        this.en = en;
    }

    public void newMath(int math) {
        this.math = math;
    }

    @Override
    public String toString() {
        return stNumber + " | " + stName + " | " + kr + " | " + en + " | " + math;
    }
}
public class Ex13_2 {

    private static Student student = null; // ���� �л� ������ ������ ����

    public static void main(String[] args) {
        System.out.println("�л� ���� ���� ���α׷� (ver 1.4.0)");

        Scanner sc = new Scanner(System.in);
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
                if (student == null) {
                    System.out.println("�л� ������ �����ϴ�.");
                } else {
                    System.out.println("--------------------------------");
                    System.out.println("�й� | �̸�     | ����  | ����  | ����");
                    System.out.println(student.toString());
                    System.out.println("--------------------------------");
                }
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

                student = new Student(stNumber, stName, kr, en, math);
            } else if (choice == 3) {
                // �л� ���� ����
                if (student == null) {
                    System.out.println("�л� ������ �����ϴ�.");
                } else {
                    System.out.print("������ �л��� �й�> ");
                    int stNumber = sc.nextInt();
                    if (student.getStNumber() == stNumber) {
                        System.out.print("�� �̸�> ");
                        String stName = sc.next();
                        System.out.print("�� ����> ");
                        int kr = sc.nextInt();
                        System.out.print("�� ����> ");
                        int en = sc.nextInt();
                        System.out.print("�� ����> ");
                        int math = sc.nextInt();

                        student.newStName(stName);
                        student.newKr(kr);
                        student.newEn(en);
                        student.newMath(math);
                    } else {
                        System.out.println("�ش� �й��� �л��� ã�� �� �����ϴ�.");
                    }
                }
            } else if (choice == 4) {
                // �л� ���� ����
                if (student == null) {
                    System.out.println("�л� ������ �����ϴ�.");
                } else {
                    System.out.print("������ �л��� �й�> ");
                    int stNumber = sc.nextInt();
                    if (student.getStNumber() == stNumber) {
                        student = null; // �л� ���� ����
                        System.out.println("�л� ������ �����Ǿ����ϴ�.");
                    } else {
                        System.out.println("�ش� �й��� �л��� ã�� �� �����ϴ�.");
                    }
                }
            } else {
                System.out.println("�߸��� �����Դϴ�. �ٽ� �������ּ���.");
            }
        }

        sc.close();
    }
}