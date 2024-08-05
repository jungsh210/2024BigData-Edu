package com.gimhae;
/*
 * �ֹι�ȣ üũ(ver 0.1.0)
 * �ֹι�ȣ> 991231-1234567
 * 
 * ����� 00�� �����Դϴ�.
 *-------------------------------
 * �ֹι�ȣ> 1234561234567
 * ������ ������� 000000-0000000���� �Է��ϼ���
 * �ֹι�ȣ> 123456-123456
 * �Է��ڸ����� �����մϴ�.
 * �ֹι�ȣ>a12345-1234567
 * �ֹι�ȣ�� ���ڷθ� �����Ǿ�� �մϴ�.
 */

public class Ex05 {
    // ���� �迭�� ������ ��ȯ �������� Ȯ���ϴ� �޼���
    public static boolean isValidNumber(final char[] arr) {
        for (char c : arr) {
            // '-' ���ڴ� ���ܷ� ó���ϰ� ������ ���ڰ� �������� Ȯ��
            if (c != '-' && !Character.isDigit(c)) {
                return false; // ���ڰ� �ƴϸ� ��ȿ���� ����
            }
        }
        return true; // ��� ���ڰ� ���� �Ǵ� '-'�� �ִ� ��� ��ȿ��
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.println("�ֹι�ȣ üũ(ver 0.1.0)");
        
        while (true) {
        	System.out.println("�ֹι�ȣ>");
            String number = sc.nextLine();
            
            // �ֹι�ȣ ���� �� ������ ����
            if (number.charAt(6) != '-') {
                System.out.println("������ ������� 000000-0000000���� �Է��ϼ���");
                continue;
            }
            
            if(number.length() < 14) {
				System.out.println("�Է��ڸ����� �����մϴ�.");
				continue;
			}
            
            char[] numberArray = number.toCharArray();
            
            // �Էµ� �ֹι�ȣ �κ��� �������� Ȯ��
            boolean isValid = isValidNumber(numberArray);
            if (!isValid) {
                System.out.println("�߸� �ԷµǾ����ϴ�.");
                continue;
            }
            
            char genderCode = numberArray[7];
            String gender = "";
            char ageCode1 = numberArray[0];
            char ageCode2 = numberArray[1];
            int age;
            int birthYear = 0;
            
            // ���� �Ǻ�
            if (genderCode == '1' || genderCode == '3') {
                gender = "����";
            } else if (genderCode == '2' || genderCode == '4') {
                gender = "����";
            } else {
                System.out.println("�߸��� �ֹι�ȣ �����Դϴ�.");
                continue;
            }
            
            // ��� ���� ���
            if (genderCode == '1' || genderCode == '2') {
                birthYear = 1900 + Integer.parseInt("" + ageCode1 + ageCode2);
            } else if (genderCode == '3' || genderCode == '4') {
                birthYear = 2000 + Integer.parseInt("" + ageCode1 + ageCode2);
            }
            
            // ���� ���
            age = 2024 - birthYear + 1;
            
            // ���
            System.out.println("����� " + age + "�� " + gender + "�Դϴ�.");
        }
    }
}

