package com.gimhae;

// static inner class

class Outter02{
	static int su1 = 1111; // static ����
	int su2 = 2222; // non-static ����
	
	// ������
	public Outter02() {
		
	}
	
	// static �޼ҵ�
	static void func01() {
		System.out.println(Inner02.su3);
		Inner02.func03();
		////////////////////
		Inner02 inner = new Inner02();
		System.out.println(inner.su4);
		inner.func04();
		
	}
	
	// non-static �޼ҵ�
	void func02() {
//		System.out.println(Inner02.su3);  // ���� Ŭ������ ���� ȣ��
//		Inner02.func03();
//		////////////////////
//		Inner02 inner = new Inner02();
//		System.out.println(inner.su4);
//		inner.func04();
	}
	
	// static inner class
	static class Inner02{  // Outter02�� ���
		static int su3 = 3333;
		int su4 = 4444;
		
		public Inner02() {
			
		}
		
		static void func03() {
			System.out.println(su3); // ���� Ŭ���� �� ���� ȣ��
			
			//System.out.println(Outter02.su1); // ��Ģ��
			System.out.println(su1);
			
			// Outter02.func01(); // ��Ģ��
			func01(); // Outter02�� ����̱� ������ static �޼ҵ��� func01�� func01�� ��� ȣ���� ����
			
			Outter02 outt = new Outter02();
			System.out.println(outt.su2);
			outt.func02();
			
		}
		void func04() {
			System.out.println(su3);
			System.out.println(su1);
			
			func01();
			
			Outter02 outt = new Outter02();
			System.out.println(outt.su2);
			outt.func02();
			
		}
	}
}
public class Ex02 {

	public static void main(String[] args) {
		System.out.println(Outter02.su1);
		Outter02 outt = new Outter02();
		System.out.println(outt.su2);
		
		// entry - ���� Ŭ���� ����ϴ� ��
		// java.util.Map.Entry entry; // Map Ŭ���� �ȿ� �����ϴ� Entry Ŭ����
		
		System.out.println(Outter02.Inner02.su3); // ���� �� Ŭ����.���� Ŭ����.������
		
		// non/static ����, �޼ҵ忡 ���� -> ���� ��ü�� ���� �� ����, �޼ҵ忡 ���� ����
		Outter02.Inner02 inn = new Outter02.Inner02();
		System.out.println(inn.su4);
	}

}
