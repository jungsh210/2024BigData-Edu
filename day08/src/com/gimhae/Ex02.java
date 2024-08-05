package com.gimhae;

abstract class Machine01{
	void on() {
		System.out.println("�Ѱ�");
	}
	void off() {
		System.out.println("����");
	}
	abstract void work();
}

class Tv extends Machine01{
	@Override
	void work() {
		System.out.println("ȭ���� ����ϰ�");
	}
}
class Radio extends Machine01{
	@Override
	void work() {
		System.out.println("�Ҹ��� ����ְ�");
	}
}

// �θ� Ŭ������ �߻� Ŭ������ ����� �������̵��� �κ��� �߻� �޼ҵ�� �������ָ�
// �ڽ� Ŭ������ �������̵��� �Լ��� ���ٸ� ���� �߻� ǥ��
// �������̵� ����ȭ
//class Audio extends Machine01{
	 // ���� �߻�
//}

class Audio extends Machine01{
	@Override
	void work() {
		System.out.println("������ ����ְ�");
	}
}
public class Ex02 {

	public static void main(String[] args) {
		Machine01 remote = null;
		
		java.util.Scanner sc;
		
		sc = new java.util.Scanner(System.in);
		
		int input = 0;
		
		while(true) {
			System.out.print("1.Tv 2.Radio 3.audio 0.exit>");
			input = sc.nextInt();
			if(input==0) {
				break;
			}else if(input==1) {
				remote = new Tv();
			}else if(input==2) {
				remote = new Radio();
			}else if(input==3) {
				remote = new Audio();
			}
			remote.on();
			remote.work();
			remote.off();
		}

	}

}
