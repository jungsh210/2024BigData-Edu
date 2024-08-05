package com.day04;

public class Ex04 {
    /*
     * 생성자
     * public 클래스명(매개변수){하고자 하는 일;}
     * 객체의 생성 시점에 하고자하는 일을 명세 : 생성자 하는 일
     * 생성자 코드 생략시 디폴드 생성자를 자동 생성
     * 
     * 디폴트 생성자
     * public 클래스명(){}
     * 
     * 생성자 오버로드
     * 매개변수 유무, 갯수, 타입, 순서 등이 다르면 이름이 같은 생성자 여러 개 생성 가능
     * 
     */
    
    /*
    public Ex04(){ // 이전에는 생략되어서 안 보였던 부분, 생성자
        System.out.println("객체가 생성");
        System.out.println("생성자");
    */
    public Ex04(){
        System.out.println("매개변수없이 객체 생성");
    }
    public Ex04(int a){ // 이전에는 생략되어서 안 보였던 부분, 생성자
        System.out.println("매개변수 하나" +a);
    }
    public static void func01(){
        System.out.println("실행");
    }
    public static void main(String[] args) { // 실행 부분
        Ex04 me ; // 선언
        // me = new Ex04(); // 초기화, Ex04(): 생성자 부분, Ex04(int a) -> 에러 발생, 매개변수가 있기 때문에 ()안에 변수가 들어가야 한다.
        me = new Ex04(1234); // Ex04(int a) : 생성자 부분
        me.func01();
    }
    
}
