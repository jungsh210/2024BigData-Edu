package com.gimhae;

// non-static inner class

class Outter03{
	static int su1=1111;
	int su2 = 2222;
	
	public Outter03() {
		
	}
	
	static void func01() {
		System.out.println(Inner03.su3);
		
//		Inner03 inn = new Inner03(); // error, non-static class�� ���� �ۿ� �ִ� Ŭ���� ���� ��ü�� ����
		
		Outter03 outt = new Outter03();
		
		Inner03 inn = outt.new Inner03();
		
		System.out.println(inn.su4);
		inn.func04();
		
	}
	
	void func02() {
		System.out.println(Inner03.su3);
//		Inner03 inn = new Inner03(); // errorX
		// non-static �޼ҵ忡���� error�� ���� ���� ������ this�� �����Ǿ� �ֱ� �����̴�.
		Inner03 inn = this.new Inner03();
		System.out.println(inn.su4);
		inn.func04();
	}
	
	// non-static inner class
	class Inner03{
//		static int su3 = 3333;  // non-static Ŭ���� �ȿ��� static ����, �޼ҵ尡 ������ �� ����.
		final static int su3 = 3333; // �����(final) ������ ���� static ��� ����
		int su4 = 4444;
		
//		static void func03() {
//			
//		}
		void func04() {
			System.out.println(su1);
			// non-static Ŭ���������� non-static ������ �׳� �ҷ����� ����, ��ü ���� X
			System.out.println(su2);
			func01();
			func02();
			
//			Outter03.func01();
//			this.fun02();
			
		}
	}
}
public class Ex03 {

	public static void main(String[] args) {
		System.out.println(Outter03.Inner03.su3); // Outter03 �տ� com.gimhae ��Ű���� ������
		
//		Outter03.Inner03 inn = new Outter03.Inner03(); // static������ ����, non-static������ �Ұ���
		
		// non-static���� ������ ���, Outter03�� ��ü�� ���� �ҷ�����
		Outter03 outt = new Outter03();
		
		Outter03.Inner03 inn = outt.new Inner03();
		
		System.out.println(inn.su4);
		
		inn.func04();

	}

}
