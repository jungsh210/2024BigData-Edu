package com.gimhae;

// �������̵�� ���������ڰ� ���� ���Ǵ� �������δ� ����
// default : default�� public ����
// private : private�� ����

class Lec08{
	void func01() {
		System.out.println("�θ���1");
	}
	// �������̵� ����
	final void func02() {
		System.out.println("�θ���2");
	}
	private void func03() {
		
	}
	public void func04() {
		
	}
}

// final Ŭ������ ��� �Ұ���
// ��� �ź�
final class Lec88 {
	
}
public class Ex08 extends Lec08{
	final static int su1 = 1111;
	final int su2 = 2222;
	final int su3;
	
	public Ex08() {
		su3 = 3333;
	}
	
	@Override
	void func01() {
		System.out.println("�����ǵ� ���1");
	}
	// @Override
	// ����
	//final void func02() {
		//System.out.println("�����ǵ� ���2");
	//}
	
	//@Override
	//void func03() {
	//	System.out.println("�����ǵ� ���3");
	//}
	@Override
	public void func04() {
		System.out.println("�����ǵ� ���4");
	}

	public static void main(String[] args) {
		final int su; // ����� ����
		
		su = 1111;
		//su++;
		//su2++;
		
		Ex08 me = new Ex08();
		me.func01();
		me.func02();
		

	}

}
