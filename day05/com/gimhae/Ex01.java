package com.gimhae;
/*
 * ë°°ì—´
 * ?ë£Œí˜•[]
 * 
 * ?ë£Œí˜•[] ë³??ˆ˜ëª? = new ?ë£Œí˜•[ê°??ˆ˜]
 * 
 * ë°°ì—´ ?˜¸ì¶?
 * ë³??ˆ˜ëª?[index]
 * 
 * index
 * 0ë¶??„° ?‹œ?‘ ~ ê°??ˆ˜-1ê¹Œì? ì¡´ì¬
 * ë²”ìœ„ë¥? ?„˜?–´?„¤ ê²½ìš° exception ë°œìƒ
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
        for(int i=0; i<a.length; i++){  // a.length = 5, i<5?? ê°™ìŒ
            a[i] = i*2;
        }

        System.out.println("ë°°ì—´ ê¸¸ì´?Š”"+a.length);
        //for(int i=0; i<5; i++){
        //    System.out.println(a[i]);
        //}
        for(int i=0; i<a.length; i++){  // a.length = 5, ?œ„?? ê°™ìŒ
            System.out.println(a[i]);
        }
    }
}