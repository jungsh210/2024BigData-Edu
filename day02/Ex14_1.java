public class Ex14_1 {
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
    
     // Q1 강사님
    /* 1) System.out.println("1 2 3 \n4 5 6 \n7 8 9"); */
    /* 2) for(int i=1; i<10; i++){
     *        System.out.println(i, " ");
     *        if(i==3 || i==6){
     *          System.out.println();
     * }
     *     } */
    /* 3) for(int i=1; i<10; i++){
     *      System.out.println(i," ")
     *      if(i%3 == 0){
     *         System.out.println()
     * }
    } */

     // Q1.1
    /*  System.out.println("Q1.=====================================");
        for(int j=1; j<=7; j+=3){
            for(int i=j; i<j+3; i++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
*/
    // Q2.
/*  System.out.println("Q2.=============");
    for(int a=0; a<3; a++){
        for(int b=1; b<4; b++){
            System.out.print(b+a+" ");
        }
        System.out.println();
    }
*/ 
    // Q3. 
/*  System.out.println("Q3.================");
    int c1 = 'A';
    int c2 = 'I';
    int cnt2 = 0;
    for(int i=c1; i<c2+1; i++){
        cnt2++;
        System.out.print((char)i+" ");
        if(cnt2==3){
            System.out.println();
            cnt2=0;
        }
    }
    */
    // Q3-1
/*      System.out.println("Q3-1.=====================================");
        for(int j=1; j<=7; j+=3){
            for(int i=j; i<j+3; i++){
                System.out.print((char)(64+i)+" ");
            }
            System.out.println();
        }
*/   
    // Q4.
/*  System.out.println("Q4.=====================================");
    for(int d = 1; d<4;d++){
        for(int i=d; i<d*2; i++){
            System.out.print(d+" ");
        }
        System.out.println();
        }
 */  
    // Q5.
    /*
    System.out.println("Q5.=====================================");
        for(int i=2; i<5; i++){
            for(int j=1; j<i; j++){ // j<i: 끝나는 시점을 결정
                System.out.print(j+" ");
            }
            System.out.println();
        }
    */

    // Q7.
    /*
    int sum=0;
    for(int i=1; i<=100; i++){
        if(i%2==0){
            sum +=i;
    }
    }    
    System.out.println("합계="+sum);
   */
  
    // Q8.
    /* 
    int sum = 0;
    for(int i=1; i<=10;i++){
        if(i%2==1){
                sum += i;
                System.out.print(i);
            }else if(i==10){
                System.out.println("="+sum);
            }
            else{
                System.out.print("+");
            }
        }
        */  
    }
}


