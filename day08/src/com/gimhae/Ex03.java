package com.gimhae;

// ����� ���� Ŭ����
abstract class Lec03{
	void func01() {
		System.out.println("���");
	}
}
public class Ex03 extends Lec03{

	public static void main(String[] args) {
		// Lec03 lec = new Lec03(); // ���� �߻�
		Lec03 me = new Ex03();
		me.func01();
		
	}

}
