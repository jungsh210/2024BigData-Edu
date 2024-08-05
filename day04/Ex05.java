package com.day04;

public class Ex05 {
    // static, non-static 동일
    /* 
    public static int su1; // 디폴트 값은 0
    public final static int su2; // final 변수에서 변수의 값을 못 바꾸기 때문에 디폴값의 의미가 없다. 
    */
    
    public int su1; // 디폴트 값은 0
    public final int su2;
    
    public Ex05(){
        su2 = 2222;
    }
    public static void main(String[] args) {
        Ex05 me = new Ex05();
        System.out.println(me.su1);
        // su2++; // final: 변수 값을 바꾸지 못한다.
        System.out.println(me.su2);
        //System.out.println(su1);
        //System.out.println(su2);


        int a;
        a = 1111;
        a = 1000;
        System.out.println(a);

        final int b;  // final : 상수형 변수, 변수 값을 바꾸지 못한다.
        b = 2222;
        // b = 2000; // 에러 발생
        System.out.println(b);
    }
}
