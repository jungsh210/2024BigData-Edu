package com.etc;

public class Lec06 {
	
	// ����Ʈ ������ - pulic Ŭ������() {}
	Lec06(){}
	protected Lec06(String msg) {
		
	}
	Lec06(int a){}
	private Lec06(double a) {
		
	}
	public void func01() {
		System.out.println("lec06 f1 public");
	}
	protected void func02() {  // default
		System.out.println("lec06 f2 protected");
	}
	void func03() {  // default
		System.out.println("lec06 f3 default");
	}
	// �ش� Ŭ���� ���ο����� ���� ���
	private void func04() {
		System.out.println("lec06 f4 private");
	}
}
