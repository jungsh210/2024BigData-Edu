package com.gimhae;

class Lec09{
	public Lec09() {
		this(1234);
		System.out.println("����Ʈ");
	}
	public Lec09(int a) {
		this("su="+a);
		System.out.println("�Ű����� ����"+a);
	}
	public Lec09(String msg) {
		super(); // �θ� ������ ȣ��
		System.out.println("�Ű����� ���ڿ�"+msg);
	}
}
public class Ex09 {

	public static void main(String[] args) {
		Lec09 lec = new Lec09();

	}

}
