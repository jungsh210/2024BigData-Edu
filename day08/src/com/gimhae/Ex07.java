package com.gimhae;

class Tv07 implements Machine07{
	@Override
	public void on() {
		System.out.println("�����ڵ� �ž� �����Ѱ�");
	}
	public void work() {
		System.out.println("ȭ���� ����ϰ�");
	}
	public void off() {
		System.out.println("���� ���� �ڵ� �̴´�.");
	}
}
class Radio07 implements Machine07{
	@Override
	public void on() {
		System.out.println("�����ؼ� �����Ѱ�");
	}
	public void work() {
		System.out.println("�Ҹ��� ����ְ�");
	}
	public void off() {
		System.out.println("���� �����س��´�.");
	}
}
public class Ex07 {

	public static void main(String[] args) {
		Machine07 remote = null;
		
		remote = new Tv07();
		
		remote.on();
		remote.work();
		remote.off();

	}

}
