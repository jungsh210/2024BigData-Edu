package com.gimhae;
/*
 * break, return, continue 구분해서 사용하기
 */
public class Ex02 {

	public static void main(String[] args) {
		func03();
	}
	
	// 반복문, switch문의 탈출(최근접 반복문)
	public static void func01() {
		for(int i=0; i<10; i++) {
			if(i>5)break;
			System.out.println("func01-"+i);
		}
		System.out.println("f1의 나머지"); // 반복문만 탈출했기 때문에 그 뒤 출력 문장은 출력은 함
	}
	
	// 해당 메서드의 종료
	public static void func02() {
		for(int i=0; i<10; i++) {
			if(i>5)return;  // i가 5보다 클때 return을 만나기 때문에 fucn02 메서드를 탈출한다.
			System.out.println("func02-"+i);
		}
		System.out.println("f2의 나머지"); // 아예 메서드를 탈출했기 때문에 return 조건이 맞으면 출력을 안한다.
	}
	
	// 반복문의 상단으로 돌아감
	public static void func03() {
		for(int i=0; i<10; i++) {
			if(i>5)continue; // 반복문의 설정된 숫자만큼 반복은 한다. 조건에 해당하는 부분까지만 출력하고 반복문 탈출
			System.out.println("func03-"+i);
		}
		System.out.println("f3의 나머지"); // 반복문만 탈출했기 때문에 그 뒤 출력 문장을 출력은 함
	}

}
