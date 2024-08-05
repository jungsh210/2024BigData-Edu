package com.gimhae;

class Machine{
	public void on() {
		System.out.println("전원을 켜다.");
	}
	public void off() {
		System.out.println("전원을 끄다.");
	}
	public void work() {
		System.out.println("먼가함"); // 자식 클래스들에서 재정의를 했기 때문에 출력 x
	}
}
class Tv extends Machine{
	public void work() {
		System.out.println("주파수를 잡아 화면을 보여주다");
	}
}

class Radio extends Machine{
	public void work() {
		System.out.println("주파수를 잡아 소리를 들려주다.");
	}
}

class Audio extends Machine{
	@Override
	public void work() {
		System.out.println("음악을 들려준다.");
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
			// 출력 부분 -> 여러번 작성하지 않아도 한번에 출력할 수 있는 방법
			remote.on();
			remote.work();
			remote.off();
		}

	}

}
