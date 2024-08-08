package com.gimhae;

// local class
// local class�� public class ������ �����ϸ� ��� X, local�̱� ������
// local class�� static�� ������ �� ����

public class Ex04 {
	static int su3 = 3333;
	int su4 = 4444;
	
	public static void func01() {
		Ex04 me = new Ex04();
		
		// jdk 1.7 ���Ͽ����� final ���� �Ұ���
		// jdk 1.8 �̻󿡼��� final ���� ����
		
		final int su5 = 5555;
		
		class Local01{
			final static int su1 = 1111; // ����� ���������� static�� ����
			int su2 = 2222;
			
			public Local01() {
				
			}
			void func01() {
				System.out.println(su1);
				System.out.println(me.su4);
			}
			void func02() {
				System.out.println(su2);
				System.out.println(su5);
			}
		}
		Local01 local = new Local01();
		System.out.println(Local01.su1);
		System.out.println(local.su2);
		local.func01();
		local.func02();
	}
	
	public void func02() {
		//��
	}
	
	// final ���� �ٲ� �� �ִ� ���
	public static void func03(final int su) {  // final ���� ����
		// Local Ŭ���������� final, ���ο����� ���� �Ұ�, main���� �ʱ�ȭ �� �� ������ ����
		
		class Local04{
			void func01() {
				System.out.println(su);
			}
		}
		Local04 local = new Local04();
		local.func01();
	}

	public static void main(String[] args) {
		func01();
		func03(111111); // final ������ su�� �ʱ�ȭ�� �� 111111���� ���� ����
		func03(22222);
	}

}
