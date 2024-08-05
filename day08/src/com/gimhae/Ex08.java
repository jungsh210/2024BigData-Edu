package com.gimhae;

/*
 * Object���� clone�� �ִ�.
 * clone���� ��ü ���簡 ����
 * ������ ���к��� clone ����� �ɰ��� ���� ������ �߻�
 * �׷��� �������̽��� ����ؾ� clone ��� ����
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

        // �׽�Ʈ ���
        ((Lec08) obj2).func(); // ���: 111
    }

}
