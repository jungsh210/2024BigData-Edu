package com.gimhae;
/*
 * 접근 제한자
 * 1. public
 * 2. protected
 * 3. default
 * 3. private
 * public > protected = default > private 순으로 열려있음
 * 
 * 필드 == 메서드
 * 
 * 클래스에서 접근 제한자
 * 한 문서 상의 public class는 오직 하나만 존재
 * 그리고 메인 메서드를 갖는 클래스가 public
 * 오직 public과 default만 클래스 존재
 */
class Lec06{
	
	// 모든 접근 허용
	public void func01() {
		System.out.println("f1 public");
	}
	// 동일 패키지 내에서만 접근을 허용
	// 상속을 통해서는 모든 접근 허용
	protected void func02() {  // default
		System.out.println("f2 protected");
	}
	// 동일 패키지 내에서만 접근을 허용
	void func03() {  // default
		System.out.println("f3 default");
	}
	// 해당 클래스 내부에서만 접근 허용
	private void func04() {
		System.out.println("f4 private");
	}
}
//public class Ex06 extends Lec06{
public class Ex06 extends com.etc.Lec06{
	public Ex06() {
		super("aaa");
	}
	public static void main(String[] args) {
		com.gimhae.Lec06 lec = new com.gimhae.Lec06();
		
		lec.func01(); // 다른 패키지 안 클래스 파일 메서드 접근 가능
		lec.func02();
		lec.func03();
		// lec.func04(); // 에러
		
		Ex06 me = new Ex06();
		me.func01();
		me.func02();
		me.func03();
		me.func04();

	}
	public void func01() {
		System.out.println("f1 public");
	}
	protected void func02() {  // default
		System.out.println("f2 protected");
	}
	void func03() {  // default
		System.out.println("f3 default");
	}
	private void func04() {
		System.out.println("f4 private");
	}

}
