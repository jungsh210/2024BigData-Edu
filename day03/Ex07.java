/*
 * 자동차를 구매할 예정
 */
class Ex07 {
    public static void main(String[] args){
        // 1. 차를 준비
        int speed = 0;
        System.out.println("내 차의 현재 속도는 "+ speed + "km입니다.");
        for(int i=0; i<20; i++){
            speed = speedUp(speed); // 속도 올리기
            System.out.println("내 차의 현재 속도는 "+ speed + "km입니다.");
        }
        for(int i=0; i<10;i++){
            speed = speedDown(speed);
            System.out.println("내 차의 현재 속도는 "+ speed + "km입니다.");
        }

    }

    public static int speedUp(int a){
        a+=5; // 속도 올리는 부분
        return a;
    }
    public static int speedDown(int a){
        a-=10; // 속도 감속(브레이크)
        return a;
    }
    
}
