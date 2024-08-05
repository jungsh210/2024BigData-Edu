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

    private static Student student = null; // 현재 학생 정보를 저장할 변수

    public static void main(String[] args) {
        System.out.println("학생 성적 관리 프로그램 (ver 1.4.0)");

        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            String menu = "1.보기 2.입력 3.수정 4.삭제 0.종료>";
            System.out.print(menu);

            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (choice == 1) {
                // 학생 정보 보기
                if (student == null) {
                    System.out.println("학생 정보가 없습니다.");
                } else {
                    System.out.println("--------------------------------");
                    System.out.println("학번 | 이름     | 국어  | 영어  | 수학");
                    System.out.println(student.toString());
                    System.out.println("--------------------------------");
                }
            } else if (choice == 2) {
                // 학생 정보 입력
                System.out.print("학번> ");
                int stNumber = sc.nextInt();
                System.out.print("이름> ");
                String stName = sc.next();
                System.out.print("국어> ");
                int kr = sc.nextInt();
                System.out.print("영어> ");
                int en = sc.nextInt();
                System.out.print("수학> ");
                int math = sc.nextInt();

                student = new Student(stNumber, stName, kr, en, math);
            } else if (choice == 3) {
                // 학생 정보 수정
                if (student == null) {
                    System.out.println("학생 정보가 없습니다.");
                } else {
                    System.out.print("수정할 학생의 학번> ");
                    int stNumber = sc.nextInt();
                    if (student.getStNumber() == stNumber) {
                        System.out.print("새 이름> ");
                        String stName = sc.next();
                        System.out.print("새 국어> ");
                        int kr = sc.nextInt();
                        System.out.print("새 영어> ");
                        int en = sc.nextInt();
                        System.out.print("새 수학> ");
                        int math = sc.nextInt();

                        student.newStName(stName);
                        student.newKr(kr);
                        student.newEn(en);
                        student.newMath(math);
                    } else {
                        System.out.println("해당 학번의 학생을 찾을 수 없습니다.");
                    }
                }
            } else if (choice == 4) {
                // 학생 정보 삭제
                if (student == null) {
                    System.out.println("학생 정보가 없습니다.");
                } else {
                    System.out.print("삭제할 학생의 학번> ");
                    int stNumber = sc.nextInt();
                    if (student.getStNumber() == stNumber) {
                        student = null; // 학생 정보 삭제
                        System.out.println("학생 정보가 삭제되었습니다.");
                    } else {
                        System.out.println("해당 학번의 학생을 찾을 수 없습니다.");
                    }
                }
            } else {
                System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
            }
        }

        sc.close();
    }
}