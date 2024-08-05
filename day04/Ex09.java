package com.day04;

/*
 * public Ex09() 생성자 먼저 실행하고 싶으면 Ex09(int a)에 this를 추가 -> Ex09()에 매개변수가 따로 없기 때문에 this()를 작성
 * public Ex09(int a) 생성자를 먼저 실행하고 싶으면 Ex09()에 this를 추가 -> Ex09(int a)에 매개변수가 하나있기 때문에 this(매개변수)를 작성
 */
public class Ex09 {
    public Ex09(){ 
        super(); // 생략 가능, this가 없으면 super()가 생략, super()와 this는 같이 있을 수 없다.
        System.out.println("생성자");
    }
    public Ex09(int a){  
        this(); // 위 public Ex09 생성자를 받아옴, 생성자 제일 상단에 와야함, 첫번째 객체를 찍어옴, this가 없는 생성자를 먼저 실행
        // this가 있으면 this가 없는 생성자를 먼저 실행하여 객체를 생성
        // this가 없는 부분을 다 돌고 나면 this가 있는 부분을 실행
        System.out.println("a="+a);
    }
    public static void main(String[] args) {
        new Ex09(1111); // 객체를 두번 받아오지만, 객체는 하나만 생성됨
    }
}
