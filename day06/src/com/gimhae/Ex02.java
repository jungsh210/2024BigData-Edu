package com.gimhae;
/*
 * break, return, continue �����ؼ� ����ϱ�
 */
public class Ex02 {

	public static void main(String[] args) {
		func03();
	}
	
	// �ݺ���, switch���� Ż��(�ֱ��� �ݺ���)
	public static void func01() {
		for(int i=0; i<10; i++) {
			if(i>5)break;
			System.out.println("func01-"+i);
		}
		System.out.println("f1�� ������"); // �ݺ����� Ż���߱� ������ �� �� ��� ������ ����� ��
	}
	
	// �ش� �޼����� ����
	public static void func02() {
		for(int i=0; i<10; i++) {
			if(i>5)return;  // i�� 5���� Ŭ�� return�� ������ ������ fucn02 �޼��带 Ż���Ѵ�.
			System.out.println("func02-"+i);
		}
		System.out.println("f2�� ������"); // �ƿ� �޼��带 Ż���߱� ������ return ������ ������ ����� ���Ѵ�.
	}
	
	// �ݺ����� ������� ���ư�
	public static void func03() {
		for(int i=0; i<10; i++) {
			if(i>5)continue; // �ݺ����� ������ ���ڸ�ŭ �ݺ��� �Ѵ�. ���ǿ� �ش��ϴ� �κб����� ����ϰ� �ݺ��� Ż��
			System.out.println("func03-"+i);
		}
		System.out.println("f3�� ������"); // �ݺ����� Ż���߱� ������ �� �� ��� ������ ����� ��
	}

}
