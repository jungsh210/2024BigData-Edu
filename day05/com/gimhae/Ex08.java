package com.gimhae;
/*
 * �л������������α׷�(ver 0.1.0)
 * 
 * �ѿ�>3
 * 
 * 1.���� 2. �Է�>1
 * -------------------------
 * �й� |����  |����  |����
 * -------------------------
 * -------------------------
 * 1.���� 2. �Է�>2
 * �й�>1
 * ����>90
 * ����>80
 * ����>70
 * 
 * 1.���� 2. �Է�>1
 * -------------------------
 * �й� |����  |����  |����
 * -------------------------
 * 1    |90    |80    |70
 * 
 * 1.���� 2. �Է�>2
 * �й�>2
 * ����>90
 * ����>80
 * ����>70
 
 * 1.���� 2. �Է�>1
 * -------------------------
 * �й� |����  |����  |����
 * -------------------------
 * 1    |90    |80    |70
 * 2    |90    |80    |70
 * 
 * ...
 * 3���� �л� ���� ������
 * 1.���� 2.�Է�>2
 * ���̻� �Է��� �л��� �����ϴ�.
 */
import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        System.out.println("�л������������α׷�(ver 0.1.0)");

        Scanner sc = new Scanner(System.in);

        System.out.print("�ѿ�>");
        int totalStudents = sc.nextInt();

        int[][] scores = new int[totalStudents][4];
        int count = 0;

        while (true) {
            System.out.print("1.���� 2.�Է�>");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("-------------------------");
                System.out.println("�й� |����  |����  |����");
                System.out.println("-------------------------");

                for (int i = 0; i < count; i++) {
                    System.out.printf("%d    |%d    |%d    |%d\n",
                            scores[i][0], scores[i][1], scores[i][2], scores[i][3]);
                }

                if (count == 0) {
                    System.out.println("-------------------------");
                }
            } else if (choice == 2) {
                if (count >= totalStudents) {
                    System.out.println("���̻� �Է��� �л��� �����ϴ�.");
                    break;
                } else {
                    System.out.print("�й�>");
                    scores[count][0] = sc.nextInt();
                    System.out.print("����>");
                    scores[count][1] = sc.nextInt();
                    System.out.print("����>");
                    scores[count][2] = sc.nextInt();
                    System.out.print("����>");
                    scores[count][3] = sc.nextInt();

                    count++;
                }
            } else {
                System.out.println("�߸��� �����Դϴ�. �ٽ� �Է��ϼ���.");
            }
        }
    }
}
