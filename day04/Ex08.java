package com.day04;
/*
 * 전역 변수와 지역 변수의 우선순위
 * 전역 변수와 지역 변수가 동시에 사용될 때
 * 지역 변수 > 전역 변수
 */
public class Ex08 {

    // 전역 변수 : 모든 곳에서 사용 가능 - static일 때
    // public static int a = 9999;

    // 전역 변수 : non-static일 때
    public int a = 9999;

    public static void main(String[] args) {
        int a = 1111;  // 지역 변수 : main 메서드 안에서만 사용 가능
        System.out.println(a);   // 1111 출력
        // System.out.println(Ex08.a); // staitc 전역 변수 출력
        Ex08 me = new Ex08();
        System.out.println(me.a); // non-static 전역 변수 출력
        me.func01();
    }

    public void func01(){
        int a = 1000;  // 위 main의 a와는 다른 메서드에 들어있기 때문에 서로 다른 a이다.
        System.out.println(a);  // 1000 출력
    }
    
}
