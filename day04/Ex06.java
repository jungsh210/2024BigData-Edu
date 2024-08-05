package com.day04;

class Car {
    public String model; // 다른 값을 넣지 않으면 null 값이 대입
    public String color; // 다름 값을 넣지 않으면 null 값이 대입
    public int speed;
    public final int MAX; // final은 고정값이지만 객체(생성자)마다 값을 다르게 변경할 수 있음

    public Car(){  // 생성자
        //color = "쥐";
        //model = "아반떼";
        //MAX = 80;

        // this가 있을 때
        this("쥐","아반떼",80);
    }

    /*
    public Car(String a){  // 생성자
        color = a;
        model = "소나타";
        MAX = 95;
    }
    */
    public Car(String color){  // 생성자
        //this.color = color; // 전역 변수인 public String color 초기화
        //model = "소나타";
        //MAX = 95;

        // this가 있을 때
        this(color,"소나타",95);
    }

    public Car(String a, String b){ // 강제성 부여, 값을 안 넣으면 에러 발생, 생성자
        //color = a;
        //model = b;
        //MAX=100;

        // this가 있을때
        this(a,b,100); // 생성자 내부에서 다른 생성자를 불러올 때, public Car(String color, String model, int max) 생성자를 불러옴
    }

    public Car(String color, String model, int max){
        this.color = color;
        this.model = model;
        this.MAX = max;
    }

    public void speedUp(){
        speed += 10;
        if(speed>MAX)speed=MAX;
        
    }
    public void speedDown(){
        speed -= 10;
        if(speed<0)speed=0;
    }
    public void show(){
        System.out.println(color+"색 "+model+"의 현재 속도는 "+ speed+"km");
    }

}

public class Ex06 {
    public static void main(String[] args) {
        Car myCar = new Car(); // 안에 넣고 싶은 변수를 넣으면 해당하는 생성자가 호출됨
        myCar.show();
        for(int i=0; i<10;i++){
            myCar.speedUp();
            myCar.show();
        }
        for(int i=0;i<10;i++){
            myCar.speedDown();
            myCar.show();
        }
    }
    
}
