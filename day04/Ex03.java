package com.day04; // com 폴더 안에 day04 폴더 생성 후 class 파일 저장
public class Ex03 {
    // Math가 내가 만든 클래스와 자바에서 만든 클래스가 두 개 있는데
    // 이름이 같기 때문에 두 개를 모두 사용하려면 자바에서 만든 클래스 앞에 java.lang을 붙인다.
    // 별다른 지정이 없으면 현재 구현된 클래스를 불러온다.
    public static void main(String[] args) {
        double su = com.day04.Math.random();  // 내가 만든 Math 클래스에서 값을 받아오는 부분, 기계어로 변경할 때는 해당 파일이 있는 폴더를 알려줘야 한다.
        System.out.println("내가 만든"+su);
        su = java.lang.Math.random();  // 자바에서 만든 Math 클래스에서 값을 받아오는 부분
        System.out.println("자바가 만든"+ su);
        su = com.day04.Math.PI;  // 내가 만든 Math 클래스에서 값을 받아오는 부분, 기계어로 변경할 때는 해당 파일이 있는 폴더를 알려줘야 한다.
        System.out.println("내가 만든 pi="+su);
        su = java.lang.Math.PI;  // 자바에서 만든 Math 클래스에서 값을 받아오는 부분
        System.out.println("자바가 만든 pi="+ su);
    }
}

class Math{
    public static double PI = 2.14;
    public static double random(){
        return 1.0;
    }
}
