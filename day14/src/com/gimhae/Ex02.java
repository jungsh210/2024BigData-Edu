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
//				System.out.println("없는 인덱스");
//			}
//			
//		}
		
		// 2.
		
//		try {
//		for(int i=4; i>=0; i--) {
//		System.out.println(arr[i]);
//		}
//	} catch(ArrayIndexOutOfBoundsException e) {
//		System.out.println("없는 인덱스");
//	}
		
		// 3.
		
//		for(int i=4; i>=0; i--) {
//			try {
//				System.out.println(4/arr1[i]);
//			} catch(RuntimeException e) {  // arr1에서는 ArrayIndexOutOfBoundsException이 error, RuntimeException으로 예외처리
//				// Exception에도 부모 클래스가 있고, 자식 클래스가 존재
//				// ArrayIndexOutOfBoundsException의 부모 클래스는 IndexOutOfBoundsException 클래스
//				// IndexOutOfBoundsException의 부모 클래스는 RuntimeException
//				// 부모 클래스로 예외 처리를 하면 자식 클래스를 알아서 사용하여 예외 처리
//				System.out.println("error 발생");
//			}
//			
//		}
		
		//4.
		
//		for(int i=4; i>=0; i--) {
//		try {
//			System.out.println(4/arr1[i]);
//		} catch(RuntimeException e) {  // arr1에서는 ArrayIndexOutOfBoundsException이 error, RuntimeException으로 예외처리
//			// Exception에도 부모 클래스가 있고, 자식 클래스가 존재
//			// ArrayIndexOutOfBoundsException의 부모 클래스는 IndexOutOfBoundsException 클래스
//			// IndexOutOfBoundsException의 부모 클래스는 RuntimeException
//			// 부모 클래스로 예외 처리를 하면 자식 클래스를 알아서 사용하여 예외 처리
//			System.out.println("error 발생");
//		}
//		
//	}
		
		// 5.
		// 제일 최상의 부모 클래스인 RuntimeException을 불러오면 자식 클래스를 불러올 필요가 없음
		// 하위 클래스를 불러오면 error 발생
		
		for(int i=4; i>=0; i--) {
		try {
			System.out.println(4/arr1[i]);
		} catch(RuntimeException e) {
			System.out.println("pass");
		}
//		  catch(ArrayIndexOutOfBoundsException e) { 
//			System.out.println("passs");
//		} catch(ArithmeticException e) { // 변수가 0일 때 예외 처리
//			System.out.println(0);
//		}
		
	}		
		
		
	}

}
