package com.gimhae;

class Lec02 extends Object{
	int su = 1111;
	public void func01() {
		System.out.println("�θ��� ���");
	}
}

public class Ex02 extends Lec02{
	int su = 2222;
	
	public void func01() {
		super.func01(); // �θ��� ����� ���� ������ ��
		System.out.println("�ڽ��� ���");
		System.out.println(super.su); // �θ��� su�� ����
		System.out.println(this.su);  // �ڽ��� su�� ����
	}
	
	public static void main(String[] args) {
		Ex02 me = new Ex02();
		me.func01();
		System.out.println(me.toString()); 
		// toString�� ������ �ִ� ���� object Ŭ����, �θ� Ŭ������ object Ŭ������ ��ӹް� �ִ�.(��õǾ� ���� �ʾƵ�)
	}

}
