package com.day04;

/*
 * 2차 반복문
 * 
 * ex)
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 
 * x축, y축으로 보고, y축은 바깥쪽 반복문에 해당, x축은 안쪽 반복문에 해당
 */
public class Ex11 {

    public static void main(String[] args) {
        for(int i=1; i<5; i++){
            for(int j=0;j<i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }

        int a = 1;
        for(int i=1;i<5;i++){
            for(int j=a; j<a+i;j++){
                System.out.print(j);
            }
            a = a + i;
            System.out.println();
        }
    }
    
}
