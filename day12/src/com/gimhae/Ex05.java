package com.gimhae;

// �͸� Ŭ����

class Anony{
	void func() {
		
	}
}

interface Inter{
	void func();
}

public class Ex05 {
	int su = 1111;
	
	// �͸� Ŭ����
	
	static Inter local = new Inter() { // static
	
	// Inter local = new Inter() { // non-static
		int su2 = 2222;
		
		public void func() {
			System.out.println("����");
//			System.out.println(this.su); // error
			System.out.println(this.su2);
		}
	};
	
	public static void main(String[] args) {
		
		// Inter Local�� non-static�� ��
//		Ex05 me = new Ex05();
//		me.local.func();
		
		// Inter Local�� static�� ��
		local.func();
		
		// ���ٽ�
//		Inter local2 = () -> System.out.println("���ٽ�");
//		local2.func();
	}

}
