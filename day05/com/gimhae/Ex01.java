package com.gimhae;
/*
 * 배열
 * ?��료형[]
 * 
 * ?��료형[] �??���? = new ?��료형[�??��]
 * 
 * 배열 ?���?
 * �??���?[index]
 * 
 * index
 * 0�??�� ?��?�� ~ �??��-1까�? 존재
 * 범위�? ?��?��?�� 경우 exception 발생
 * 
 */

class Ex01 {
    public static void main(String[] args) {
        int[] a = new int[5];
        //a[0] = 1;
        //a[1] = 3;
        //a[2] = 5;
        //a[3] = 7;
        //a[4] = 9;
        for(int i=0; i<a.length; i++){  // a.length = 5, i<5?? 같음
            a[i] = i*2;
        }

        System.out.println("배열 길이?��"+a.length);
        //for(int i=0; i<5; i++){
        //    System.out.println(a[i]);
        //}
        for(int i=0; i<a.length; i++){  // a.length = 5, ?��?? 같음
            System.out.println(a[i]);
        }
    }
}