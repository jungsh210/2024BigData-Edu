package com.gimhae;

class Ex02 {
    public static void main(String[] args) {
        // ���ڿ�
    	// ���ڵ��� ����
    	// "" ���� - 
        java.lang.String msg1 = "hello"; // msg1?? java.lang ?��?��?��?�� ?��?��?��?�� 참조 �??��
        System.out.println(msg1);
        String msg2 = new String();  // ?��?��?�� �? -> 공백
        // String msg2 = new String("heello");
        System.out.println(msg2);
        char [] ch = new char[5];
        ch[0] = 'H';
        ch[1] = 'E';
        ch[2] = 'L';
        ch[3] = 'L';
        ch[4] = 'O';
        String msg3 = new String(ch);
        System.out.println(msg3);

        byte [] byt = new byte[3];
        byt[0] = 65; // A
        byt[1] = 66; // B
        byt[2] = 67; // C
        String msg4 = new String(byt);
        System.out.println(byt);
        System.out.println(msg4);
    }
}
