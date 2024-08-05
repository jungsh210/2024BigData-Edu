public class Ex06 {
    public static void main(String[] args){
        // 제어문
        // 1. 조건문(if)
        // if(조건) {실행}
        // if(조건) {실행} else{조건을 만족하지 못할때 실행}
        // if-else문은 조건을 만족하든 안하든 모두 실행하기 때문에 실행을 보장
        // if문은 실행을 보장 X
        // if(조건) {실행1} else if(조건) {실행2} else if (조건) {실행3} ... 
        // : 조건이 맞지 않으면 다음 조건을 탐색, else가 있을 수도 있고 없을 수도 있음
        System.out.println("조건전");
        int su = 2;
        int a;
        if(su>3){
            System.out.println("실행");
            a = 1234;
        }else{
            System.out.println("실행안함");
            a = 4321;
        }
        System.out.println("조건후"+a);

    }
    
}
