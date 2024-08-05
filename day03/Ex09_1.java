// 강사님
class Ex09_1 {
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a,b,c;
        a=0;
        b=0;
        c=0;
        boolean boo = true;
        int input = 0; // 5
        double com = 0;
        System.out.println("가위바위보 게임(ver 0.1.0)"); // 1

        while(boo){ // 4
            System.out.print("가위(1), 바위(2), 보(3), 종료(0)>");
            input = sc.nextInt(); //6
            com = (int)(Math.random()*3); // Math.random() 숫자의 범위 : 0<=com<1
            
            if(input==1){ //7
                System.out.println("당신은 가위, 컴퓨터는 ");
                if(com==1){
                    System.out.println("가위");
                    System.out.println("비겼음");
                    b++;
                }else if(com==2){
                    System.out.println("바위");
                    System.out.println("졌음");
                    c++;
                }else if(com==3){
                    System.out.println("보");
                    System.out.println("이겼음");
                    a++;
                }else{}
            }
            if(input==2){
                System.out.print("당신은 바위, 컴퓨터는 ");
                if(com==1){
                    System.out.println("가위");
                    System.out.println("이겼음");
                    a++;
                }else if(com==2){
                    System.out.println("바위");
                    System.err.println("비겼음");
                    b++;
                }else if(com==3){
                    System.out.println("보");
                    System.out.println("졌음");
                    c++;
                }else{}
            }
            if(input==3){
                System.out.print("당신은 보,컴퓨터는 ");
                if(com==1){
                    System.out.println("가위");
                    System.out.println("졌음");
                    c++;
                }else if(com==2){
                    System.out.println("바위");
                    System.out.println("이겼음");
                    a++;
                }else if(com==3){
                    System.out.println("보");
                    System.err.println("비겼음");
                    b++;
                }else{}
            }
            if(input == 0){ //4
                boo = false;
            }
        }
        System.out.println("\n총점 "+a+"승"+b+"무"+c+"패"); // 2
        System.out.println("이용해주셔서 감사합니다."); // 3


    }
}
