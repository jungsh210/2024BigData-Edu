package com.gimhae;

import java.util.Set;
import java.util.TreeSet;

class Lotto implements java.lang.Comparable<Lotto> {
    final int num;
    String color;

    public Lotto(int num) {
        this.num = num;
        if (num < 10) {
            color = "���";
        } else if (num < 20) {
            color = "������";
        } else if (num < 30) {
            color = "�Ķ���";
        } else if (num < 40) {
            color = "�����";
        } else {
            color = "��Ȳ��";
        }
    }

    @Override
    public int compareTo(Lotto o) {
        return this.num - o.num;
    }

    @Override
    public String toString() {
        return color +" "+num + "�� ��";
    }
}

public class Ex13_1 {

    public static void main(String[] args) {
        // �ζǹ�ȣ ������(ver 0.4.0)

        // 1~45 ������ 6���� �ߺ����� �ʴ� ��ȣ
        System.out.println("�ζǹ�ȣ ������(ver 0.4.0)");

        Set<Lotto> lotto = new TreeSet<>();

        while (lotto.size() < 6) {
            lotto.add(new Lotto((int) (Math.random() * 45) + 1));
        }

        System.out.println(lotto);
    }
}
