package com.gimhae;

class Machine{
	public void on() {
		System.out.println("������ �Ѵ�.");
	}
	public void off() {
		System.out.println("������ ����.");
	}
	public void work() {
		System.out.println("�հ���"); // �ڽ� Ŭ�����鿡�� �����Ǹ� �߱� ������ ��� x
	}
}
class Tv extends Machine{
	public void work() {
		System.out.println("���ļ��� ��� ȭ���� �����ִ�");
	}
}

class Radio extends Machine{
	public void work() {
		System.out.println("���ļ��� ��� �Ҹ��� ����ִ�.");
	}
}

class Audio extends Machine{
	@Override
	public void work() {
		System.out.println("������ ����ش�.");
	}
}
public class Ex04 {

	public static void main(String[] args) {
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);
		int input = 0;
		Machine remote = null;
		while(true) {
			System.out.print("1.Tv 2.Radio 3.audio 0.exit>");
			input = sc.nextInt();
			if(input==0) {
				break;
			}
			if(input==1) {
				remote = new Tv();
			}else if(input==2) {
				remote = new Radio();
			}else if(input==3) {
				remote = new Audio();
			}
			// ��� �κ� -> ������ �ۼ����� �ʾƵ� �ѹ��� ����� �� �ִ� ���
			remote.on();
			remote.work();
			remote.off();
		}

	}

}
