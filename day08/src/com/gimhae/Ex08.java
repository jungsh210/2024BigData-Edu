package com.gimhae;

/*
 * Object에는 clone이 있다.
 * clone으로 객체 복사가 가능
 * 하지만 무분별한 clone 복사는 심각한 보안 문제가 발생
 * 그래서 인터페이스를 사용해야 clone 사용 가능
 */
class Lec08 extends Object implements Cloneable {
    int su = 111;

    void func() {
        System.out.println(su);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Ex08 {

    public static void main(String[] args) throws CloneNotSupportedException {
        int[] arr = {1, 3, 5};
        Object obj1 = arr.clone();

        // String msg = "hello";
        // String msg2 = msg.clone();

        Lec08 lec1 = new Lec08();
        Object obj2 = lec1.clone();

        // 테스트 출력
        ((Lec08) obj2).func(); // 출력: 111
    }

}
