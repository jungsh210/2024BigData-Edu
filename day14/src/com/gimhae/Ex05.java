package com.gimhae;

class IdException extends Exception{
	public IdException() {
		super("중복아이디");
	}
}
public class Ex05 {
	
	public static void main(String[] args) {
		try {
			func01();
		}catch(IdException e) {
			e.printStackTrace(); // error 메시지 출력
		}
	}
	
	public static void func01() throws IdException{
		throw new IdException(); // throw을 통해 객체 생성
	}
}
