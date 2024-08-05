public class Ex14 {
    public static void main(String[] args){
        /*다음을 출력하시오
     * Q1.          Q2.         Q3.
     * 1 2 3        1 2 3       A B C
     * 4 5 6        2 3 4       D E F
     * 7 8 9        3 4 5       G H I
     * 
     * Q4.          Q5.         Q6.
     * 1            1           1
     * 2 2          1 2         2 3
     * 3 3 3        1 2 3       4 5 6
     * 
     * Q7. 1 ~ 100까지의 짝수의 합을 출력하세요
     * 
     * 
     * Q8. 다음을 출력하세요
     * 1+3+5+7+9 = 000
     * 
     * Q9. <print/>
     */
    
     // Q1-1
     /*
     String a;
     String b;
     String c;
     a = "1 2 3";
     b = "4 5 6";
     c = "7 8 9";
     System.out.println(a);
     System.out.println(b);
     System.out.println(c); 
     */
    
    //Q1-1
    /* for(int i=1; i<10; i++){
        System.out.print(i+" ");
        if(i%3==0){
            System.out.println();
        }
    }
    */

    // Q2-1
    /* 
    String a;
    String b;
    String c;
    a = "1 2 3";
    b = "2 3 4";
    c = "3 4 5";
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    */

    // Q2-2
    System.out.println("Q2-2.=====================================");
        for(int j=1; j<4; j+=1){
            for(int i=j; i<j+3; i++){
                System.out.print(i+" ");
            }
            System.out.println();
        }


    // Q3
    /*
    String a;
    String b;
    String c;
    a = "A B C";
    b = "D E F";
    c = "G H I";
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
     */

    // Q4
    /* String a;
    String b;
    String c;
    a = "1";
    b = "2 2";
    c = "3 3 3";
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    */

    // Q5
    /*String a;
    String b;
    String c;
    a = "1";
    b = "1 2";
    c = "1 2 3";
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    */

    // Q6
    /*String a;
    String b;
    String c;
    a = "1";
    b = "2 3";
    c = "4 5 6";
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    */

    // Q7
    /*for(int i = 1; i<101; i++){
        if(i % 2 ==0){
            int sum = 0;
            sum += i;
            System.out.println(sum);
        }
    }
        */
    
    // Q8
    // 10진수 정수 숫자 입력
    /* java.util.Scanner sc = new java.util.Scanner(System.in); // 준비
    System.out.print("숫자 5개 입력:");
    int su1 = sc.nextInt(); // 입력
    int su2 = sc.nextInt();
    int su3 = sc.nextInt();
    int su4 = sc.nextInt();
    int su5 = sc.nextInt();
    System.out.println(su1+"+"+su2+"+"+su3+"+"+su4+"+"+su5+"="+(su1+su2+su3+su4+su5));
*/
}
}
