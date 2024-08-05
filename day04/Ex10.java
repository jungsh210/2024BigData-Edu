package com.day04;

/*
 * 무려 나혼자 작성한 코드!!
 * 
 * 다양한 메서드를 이용해서 코드 줄여보기
 */
/*
 * 계산기(ver 0.1.0)
 * 
 * 첫번째 숫자 입력>
 * 두번째 숫자 입력>
 * 1.+ 2.- 3.x 4.÷ 0.종료> 3
 * 5x3=15
 * 
 */
public class Ex10 {
    public static int number1;
    public static int number2;
    public static String result; // int나 double형은 메모리가 정해져 있기 때문에 모든 결과값은 문자열로 변환
    public static String result1;
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("계산기(ver 0.1.0)");
        System.out.print("1.+ 2.- 3.x 4.÷ 0.종료>");
        while(true){
            int cal = sc.nextInt();
            if(cal==0){
                System.out.println("이용해주셔서 감사합니다.");
                break;
            } else if(cal < 0 || cal > 4){
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                continue;
            }
            System.out.print("첫번째 숫자 입력>");
            int number1 = sc.nextInt();
            System.out.print("두번째 숫자 입력>");
            int number2 = sc.nextInt();
            if(cal == 1){
                result = number1 + number2+"";
                System.out.println(number1+"+"+number2+"="+result);
            }else if(cal == 2){
                result = number1 - number2+"";
                System.out.println(number1+"-"+number2+"="+result);
            }else if(cal == 3){
                result = number1 * number2+"";
                System.out.println(number1+"x"+number2+"="+result);
            }else if(cal == 4){
                double result = (double) number1 / number2;
                double result1 = (double) number1 % number2;
                if(result1==0){
                    System.out.println(number1+"÷"+number2+"="+(int)result);
                }else{
                    System.out.println(number1+"÷"+number2+"="+(double)result);
                }
            }
        System.out.print("1.+ 2.- 3.x 4.÷ 0.종료>"); // 연산이 끝나면 새로운 연산 출력
        }
        sc.close(); // while문이 종료되면 사용자에게 입력받는 scanner 종료
            
}
}
