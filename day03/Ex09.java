/*
 *  가위바위보 게임(ver 0.1.0)
 * 가위(1),바위(2),보(3),종료(0)>
 * ex) 가위(1),바위(2),보(3),종료(0)> 1
 * 당신-가위, 컴퓨터-바위
 * 당신은 졌습니다.
 * 
 * 가위(1),바위(2),보(3),종료(0)> 2
 * 당신-바위, 컴퓨터-가위
 * 당신이 이겼습니다.
 * 
 * 가위(1),바위(2),보(3),종료(0)> 3
 * 당신-바위, 컴퓨터-바위
 * 비겼습니다.
 * 
 * 가위(1),바위(2),보(3),종료(0)> 0
 * 총점 1승 1무 1패
 * 이용해주셔서 감사합니다.
 */

 class Ex09 {
     public static void main(String[] args) {
         java.util.Scanner sc = new java.util.Scanner(System.in);
         int user;
         int wins = 0, draws = 0, losses = 0;
         
         System.out.println("가위(1), 바위(2), 보(3), 종료(0)>");
         
         while (true) {
             user = sc.nextInt();
             
             if (user == 0) {
                 System.out.printf("총점 %d승 %d무 %d패\n", wins, draws, losses);
                 System.out.println("이용해주셔서 감사합니다.");
                 break;
             } else if (user < 0 || user > 3) {
                 System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                 continue;
             }
             
             int computer = (int)(Math.random() * 3) + 1; // 곱한만큼의 숫자 개수 출력, 
             
             // 사용자 입력과 컴퓨터의 선택 비교
             String userChoice = "";
             String computerChoice = "";
             
             switch (user) {
                 case 1:
                     userChoice = "가위";
                     break;
                 case 2:
                     userChoice = "바위";
                     break;
                 case 3:
                     userChoice = "보";
                     break;
             }
             
             switch (computer) {
                 case 1:
                     computerChoice = "가위";
                     break;
                 case 2:
                     computerChoice = "바위";
                     break;
                 case 3:
                     computerChoice = "보";
                     break;
             }
             
             // 결과 출력
             System.out.printf("당신-%s, 컴퓨터-%s\n", userChoice, computerChoice);
             
             if (user == computer) {
                 System.out.println("비겼습니다.");
                 draws++;
             } else if ((user == 1 && computer == 3) || (user == 2 && computer == 1) || (user == 3 && computer == 2)) {
                 System.out.println("당신이 이겼습니다.");
                 wins++;
             } else {
                 System.out.println("당신이 졌습니다.");
                 losses++;
             }
             
             System.out.println();
             System.out.println("가위(1), 바위(2), 보(3), 종료(0)>");
         }
         
         sc.close();
     }
 }
 