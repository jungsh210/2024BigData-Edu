package com.gimhae;

abstract class Machine01{
	void on() {
		System.out.println("켜고");
	}
	void off() {
		System.out.println("껐음");
	}
	abstract void work();
}

class Tv extends Machine01{
	@Override
	void work() {
		System.out.println("화면을 출력하고");
	}
}
class Radio extends Machine01{
	@Override
	void work() {
		System.out.println("소리를 들려주고");
	}
}

// 부모 클래스를 추상 클래스로 만들고 오버라이딩할 부분을 추상 메소드로 지정해주면
// 자식 클래스에 오버라이딩할 함수가 없다면 에러 발생 표시
// 오버라이딩 강제화
//class Audio extends Machine01{
	 // 에러 발생
//}

class Audio extends Machine01{
	@Override
	void work() {
		System.out.println("음악을 들려주고");
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
