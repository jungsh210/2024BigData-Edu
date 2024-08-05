package com.gimhae;
/*
 * ���� ������
 * 1. public
 * 2. protected
 * 3. default
 * 3. private
 * public > protected = default > private ������ ��������
 * 
 * �ʵ� == �޼���
 * 
 * Ŭ�������� ���� ������
 * �� ���� ���� public class�� ���� �ϳ��� ����
 * �׸��� ���� �޼��带 ���� Ŭ������ public
 * ���� public�� default�� Ŭ���� ����
 */
class Lec06{
	
	// ��� ���� ���
	public void func01() {
		System.out.println("f1 public");
	}
	// ���� ��Ű�� �������� ������ ���
	// ����� ���ؼ��� ��� ���� ���
	protected void func02() {  // default
		System.out.println("f2 protected");
	}
	// ���� ��Ű�� �������� ������ ���
	void func03() {  // default
		System.out.println("f3 default");
	}
	// �ش� Ŭ���� ���ο����� ���� ���
	private void func04() {
		System.out.println("f4 private");
	}
}
//public class Ex06 extends Lec06{
public class Ex06 extends com.etc.Lec06{
	public Ex06() {
		super("aaa");
	}
	public static void main(String[] args) {
		com.gimhae.Lec06 lec = new com.gimhae.Lec06();
		
		lec.func01(); // �ٸ� ��Ű�� �� Ŭ���� ���� �޼��� ���� ����
		lec.func02();
		lec.func03();
		// lec.func04(); // ����
		
		Ex06 me = new Ex06();
		me.func01();
		me.func02();
		me.func03();
		me.func04();

	}
	public void func01() {
		System.out.println("f1 public");
	}
	protected void func02() {  // default
		System.out.println("f2 protected");
	}
	void func03() {  // default
		System.out.println("f3 default");
	}
	private void func04() {
		System.out.println("f4 private");
	}

}
