package com.gimhae;

/*
 * ���� Ŭ����
 * Ŭ���� ���ο� �����ϴ� Ŭ����
 * 
 * 4���� ����
 * 1. ����ƽ Ŭ����(static inner class) static class
 * 2. �ν��Ͻ� Ŭ����(non-static inner class) instance class
 * 3. ���� Ŭ���� local class
 * 4. �͸� Ŭ���� anonymous class
 */

public class Ex01 {
	
	// 1. static class
	static class Lec01{}
	
	// 2. instance class
	class Lec02{}
	
	// 3. local class
	public void func01() {
		class lec03{}
	}
	public static void main(String[] args) {
		

	}

}
