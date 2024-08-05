public class Ex09 {
    public static void main(String[] args){
        // 반복문 사용 x
        /*int su = 1;
        System.out.println("2x1="+2*1);
        System.out.println("2x2="+2*2);
        System.out.println("2x3="+2*3);
        System.out.println("2x4="+2*4);
        System.out.println("2x5="+2*5);
        System.out.println("2x6="+2*6);
        System.out.println("2x7="+2*7);
        System.out.println("2x8="+2*8);
        System.out.println("2x9="+2*9);
*/
        // 반복문 사용 전 패턴 분석
        /*int su = 1;
        System.out.println("2x"+su+"="+2*su);
        su++;
        System.out.println("2x"+su+"="+2*su);
        su++;
        System.out.println("2x"+su+"="+2*su);
        su++;
        System.out.println("2x"+su+"="+2*su);
        su++;
        System.out.println("2x"+su+"="+2*su);
        su++;
        System.out.println("2x"+su+"="+2*su);
        su++;
        System.out.println("2x"+su+"="+2*su);
        su++;
        System.out.println("2x"+su+"="+2*su);
        su++;
        System.out.println("2x"+su+"="+2*su);
        su++;
        */

        // 반복문 사용
        // 1. for문
        // for(초기화;조건;증감){반복할 내용}
        // 코드 수행 순서 -> for문 진입 -> 초기화 -> 조건 검사-> 조건이 true -> 반복할 내용 수행 -> 증감 ...
        // 반복할 내용 수행 -> 증감 -> 조건 검사 -> 조건이 false -> for문 빠져나옴
        for(int su=1;su<10;su++) {
            System.out.println("2x"+su+"="+2*su);
            System.out.println("su="+su);
        }

    }
    
}
