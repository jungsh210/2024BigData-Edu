package com.gimhae;

import java.util.Scanner;

public class Ex13_1 {

    public static void main(String[] args) {
        System.out.println("학생 성적 관리 프로그램 (ver 1.4.0)");

        Scanner sc = new Scanner(System.in);
        String studentData = ""; // 학생 데이터를 저장할 문자열 변수
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
                System.out.println("--------------------------------");
                System.out.println("학번 | 이름     | 국어  | 영어  | 수학");
                System.out.print(studentData);  // 누적된 학생 데이터를 출력
                System.out.println("--------------------------------");
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

                studentData += stNumber + " | " + stName + " | " + kr + " | " + en + " | " + math + "\n";
            } else if (choice == 3) {
                // 학생 정보 수정
                System.out.print("수정할 학생의 학번> ");
                int stNumber = sc.nextInt();
                String[] lines = studentData.split("\n");
                studentData = "";  // 학생 데이터 초기화

                for (String line : lines) {
                    if (line.startsWith(String.valueOf(stNumber))) {
                        // 해당 학번의 학생 정보 수정
                        String[] parts = line.split(" \\| ");
                        System.out.print("이름> ");
                        parts[1] = sc.next();
                        System.out.print("국어> ");
                        parts[2] = String.valueOf(sc.nextInt());
                        System.out.print("영어> ");
                        parts[3] = String.valueOf(sc.nextInt());
                        System.out.print("수학> ");
                        parts[4] = String.valueOf(sc.nextInt());

                        line = String.join(" | ", parts);
                    }
                    studentData += line + "\n";
                }
            } else if (choice == 4) {
                // 학생 정보 삭제
                System.out.print("삭제할 학생의 학번> ");
                int stNumber = sc.nextInt();
                String[] lines = studentData.split("\n");
                studentData = "";  // 학생 데이터 초기화

                for (String line : lines) {
                    if (!line.startsWith(String.valueOf(stNumber))) {
                        studentData += line + "\n";
                    }
                }
            } else {
                System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
            }
        }

        sc.close();
    }
}
