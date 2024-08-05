package com.gimhae;

/*
 * �߻� Ŭ����
 * �߻� �޼��带 0�� �̻� ���� Ŭ������ �ǹ�
 * ȥ�ڼ� ��ü ���� �Ұ���
 * 
 */

// ���

// �߻� Ŭ����
abstract class Parent{
	void func01() {
		System.out.println("�θ��� ���");
	}
	// �߻� �޼��� - �޼����� ����, ������ ����
	public abstract void func02();
}

// �߻� Ŭ������ ��ӹ޴� �ڽ� Ŭ������ 
// 1. �θ� Ŭ������ ���� abstract class�� �ۼ� 2. �θ� Ŭ������ ���� �޼��� ����
// 2���� ��� �� ����

class Child extends Parent{
	@Override
	public void func02() {  // �θ� Ŭ������ ���� �޼��� ����
		System.out.println("�ڽ��� �������̵��� ���");
	}
}
public class Ex01 {

	public static void main(String[] args) {
		Child c1 = new Child();
		c1.func01();
		c1.func02();
		
		// Parent p = new Parent(); // �߻� Ŭ������ ��ü ������ �Ұ�
		
		Parent p = new Child();
		
		p.func01();
		p.func02(); // Parent���� func02�� ���� �Ǿ� �ֱ� ������ Child�� func02�� ���� ����

	}

}
