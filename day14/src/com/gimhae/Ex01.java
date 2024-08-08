package com.gimhae;

/*
 * 예외 처리
 * 예외 - 에러가 발생할 수 있는 상황 회피
 * 
 * try{예외가 발생할 수 있는 구문} catch(exception e){처리}
 * 
 */
public class Ex01 {

	public static void main(String[] args) {
		int a = 1;
		int b = 0; // b가 0이면 error 발생
		int c = 0;
		
		// b가 0일 때의 상황을 피하기 위한 로직 - 계속 해왔던 방식
//		if(b!=0) {
//			c = a/b;
//		} else {
//			c = 0;
//		}
		
		try {
			c = a/b; // 예외가 발생하면 catch 부분으로 넘어감, try에 있는 구문 처리 x
			
		}catch (ArithmeticException e){ // Exception이 발생하면 -> (예외 처리)
			c = 0;
		}
		
		System.out.println(a+"÷"+b+"="+c);

	}

}
