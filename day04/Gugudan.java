package com.day04;
// 현재 보이는 구구단의 모습이 2차원의 모습이기 때문에 for문을 두개 사용
public class Gugudan {
    public static void main(String[] args){
        for(int danNumber=2;danNumber<10;danNumber++){
            System.out.print(danNumber+"단"+"\t");
        }
        System.out.println();
            for(int number=1;number<10;number++){
                for(int dan=2;dan<10;dan++){
                    String result = dan*number +"";
                    System.out.print(dan+"x"+number+"="+result+"\t");
             }
            System.out.println();
        }
        

    }
}