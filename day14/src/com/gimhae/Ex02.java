package com.gimhae;

public class Ex02 {

	public static void main(String[] args) {
		int[] arr = {1,3,5,7};
		int[] arr1 = {-1,0,1,2};
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
		
		// 1.
//		for(int i=4; i>=0; i--) {
//			try {
//				System.out.println(arr[i]);
//			} catch(ArrayIndexOutOfBoundsException e) {
//				System.out.println("���� �ε���");
//			}
//			
//		}
		
		// 2.
		
//		try {
//		for(int i=4; i>=0; i--) {
//		System.out.println(arr[i]);
//		}
//	} catch(ArrayIndexOutOfBoundsException e) {
//		System.out.println("���� �ε���");
//	}
		
		// 3.
		
//		for(int i=4; i>=0; i--) {
//			try {
//				System.out.println(4/arr1[i]);
//			} catch(RuntimeException e) {  // arr1������ ArrayIndexOutOfBoundsException�� error, RuntimeException���� ����ó��
//				// Exception���� �θ� Ŭ������ �ְ�, �ڽ� Ŭ������ ����
//				// ArrayIndexOutOfBoundsException�� �θ� Ŭ������ IndexOutOfBoundsException Ŭ����
//				// IndexOutOfBoundsException�� �θ� Ŭ������ RuntimeException
//				// �θ� Ŭ������ ���� ó���� �ϸ� �ڽ� Ŭ������ �˾Ƽ� ����Ͽ� ���� ó��
//				System.out.println("error �߻�");
//			}
//			
//		}
		
		//4.
		
//		for(int i=4; i>=0; i--) {
//		try {
//			System.out.println(4/arr1[i]);
//		} catch(RuntimeException e) {  // arr1������ ArrayIndexOutOfBoundsException�� error, RuntimeException���� ����ó��
//			// Exception���� �θ� Ŭ������ �ְ�, �ڽ� Ŭ������ ����
//			// ArrayIndexOutOfBoundsException�� �θ� Ŭ������ IndexOutOfBoundsException Ŭ����
//			// IndexOutOfBoundsException�� �θ� Ŭ������ RuntimeException
//			// �θ� Ŭ������ ���� ó���� �ϸ� �ڽ� Ŭ������ �˾Ƽ� ����Ͽ� ���� ó��
//			System.out.println("error �߻�");
//		}
//		
//	}
		
		// 5.
		// ���� �ֻ��� �θ� Ŭ������ RuntimeException�� �ҷ����� �ڽ� Ŭ������ �ҷ��� �ʿ䰡 ����
		// ���� Ŭ������ �ҷ����� error �߻�
		
		for(int i=4; i>=0; i--) {
		try {
			System.out.println(4/arr1[i]);
		} catch(RuntimeException e) {
			System.out.println("pass");
		}
//		  catch(ArrayIndexOutOfBoundsException e) { 
//			System.out.println("passs");
//		} catch(ArithmeticException e) { // ������ 0�� �� ���� ó��
//			System.out.println(0);
//		}
		
	}		
		
		
	}

}
