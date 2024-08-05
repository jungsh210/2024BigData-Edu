package com.gimhae;

public class Lec06 {
	public void func01() {
		System.out.println("lec06 f1 public");
	}
	protected void func02() {  // default
		System.out.println("lec06 f2 protected");
	}
	void func03() {  // default
		System.out.println("lec06 f3 default");
	}
	// 해당 클래스 내부에서만 접근 허용
	private void func04() {
		System.out.println("lec06 f4 private");
	}
}
