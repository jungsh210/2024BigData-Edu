package com.gimhae;

public class Ex03 {

	public static void main(String[] args) {
//		try {
			func01();
//		}catch(ArithmeticException e) {
//			System.out.println("error");
//		}
	}
	
	// 1.
//	public static void func01() {
//		func02();
//		System.out.println("end func01");
//	}
	
	// 2.
	public static void func01() {
		try {
			func02();
		}catch(CloneNotSupportedException e) {
			System.out.println("end func01");
		}
	}
	
	// 1.
//	public static void func02() {
//		try {
//			int su = 1/0;
//		}catch(ArithmeticException e){
//			System.out.println("err");
////			System.out.println(e.getClass()); // error�� �߻��� class ���
////			System.out.println(e.getMessage()); // error �޽��� ���
////			e.printStackTrace(); // error �޽��� ���
//		}
//		System.out.println("end func02");
//	}
	
	// 1.func01 - 2.func02
//	public static void func02() {
//	Ex03 me = new Ex03();
//	try {
//		Object obj = me.clone();
//	}catch(CloneNotSupportedException e) { // ���� ó���� error�� �� �ʿ� �ۼ�
//		
//	}
//}
	
	// 3.
	public static void func02() throws CloneNotSupportedException{
		Ex03 me = new Ex03();
	    Object obj = me.clone();
	    System.out.println("�̹� ������");
}
	

}
