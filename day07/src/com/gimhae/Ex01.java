package com.gimhae;

/*
 * ���
 * �θ��� ����� �����޴� ��
 * ���� ���(���߻���� �������� ����)
 * class Ŭ������ extends ��ӹ��� Ŭ������(�θ� Ŭ����) {}
 * ��� Ŭ������ ������� �̷����
 * extends �θ� �ڵ���� ���� �� java.lang.Object
 * �θ� -> �ڽ����� ���
 * ����� �ϴ� ���� : �ߺ��� �ڵ带 �����ϱ� ����(�ݺ��� �ּ��� �ϱ� ����)
 */

class Parent{
	public int money = 1000;
	public void how() {
		System.out.println(money+"�� ����");
	}
}

// class child{} // �� �ڽ� Ŭ����

class Child extends Parent{ // �θ� Ŭ������ ��ӹ��� �ڽ� Ŭ����
	public int money = 100;
	public void func01() {
		System.out.println("�ڽĸ��� ���");
	}
	// �����ε�(������. �޼���) �������̵�(�޼���)�� ���̴� �����ΰ�?
	// �����ε� : �̸��� �ߺ�(��Ģ�� �Ұ�, �Ϻ� ���, �Ķ����, ����, ����, Ÿ��, ����)
	// �޼��� �������̵�(���� �޼��忡���� ����)
	// ��ӿ��� �θ�κ��� �������� ���(�޼���)�� ������ �ؼ� ���
	// �����ε� ���� ���� : �Ű�����
	
	@Override // ������̼�, �ƹ� ��� ������, �������̵带 ������ �� �߸��� �κ��� �������� �˷���, Ȯ���� �������̵带 �� �� ����
	public void how() {  // �θ� �޼����� ���� Ÿ��, �������� �״�� ��� �ͼ� ������
		System.out.println("������");
	}
}
public class Ex01 {

	public static void main(String[] args) {
		Child me1 = new Child(); 
		me1.how();  // �θ� Ŭ������ ��ӹ��� ���� �ڽ� Ŭ���������� how�� ���� ������ ���� x, �������̵��ϸ� �������̵� �� �κ��� ���
		
		Parent me2 = new Parent();
		me2.how();
		// me2.func02();  // �θ�� �ڽ��� �޼ҵ带 ���� �� ����
		
		Ex01 me = new Ex01();
		System.out.println(me);
		System.out.println(me.toString());  // �ؿ� toString�̶�� �޼��带 �������̵��߱� ������ "���� ������"��� ���� ���
	}
	
	@Override
	public String toString() {
		return "���� ������";
	}
}
