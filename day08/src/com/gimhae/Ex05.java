package com.gimhae;

// �������̽�
/*
 * �������̽� Ư¡
 * 1. �߻� �޼��常 ���´�.
 * 2. �ʵ带 ���� ���Ѵ�.(��ü�� ���� X) -> ��� ���� ����(��ü�� �������� �ʱ� ������), ���� X
 * 3. �������̽� ��� : implements ���
 * 4. �������̽��� ��� ����ض��� ���� ���� -> ���� ����� �ȵǴ� ���� �����ϱ� ���� ����
 */

interface Inter01{
	// int su1; // ����
	// su = 11111; // ����
	public static final int su = 1111;  // �̷� ������ ����� ������ ����
	public static int su2 = 222;
	public int su3 = 3333;
	int su4 = 444;
	
	public abstract void func01();
	public  void func02(); // �߻� �޼��常 ���� ������ abstract ���� ����
	void func03();
}
public class Ex05 implements Inter01{

	public static void main(String[] args) {
		Ex05 me = new Ex05();
		Object me3 = new Ex05();
		Inter01 me2 = new Ex05();
		
		me2.func01();
		me2.func02();
		me2.func03();

	}
	
	@Override
	public void func01() {
		
	}
	
	@Override
	public void func02() {
		
	}
	
	@Override
	public void func03() {
		
	}

}
