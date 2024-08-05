public class Ex10 {
    public static void main(String[] args){
        // 조건문
        // 1. while(조건){반복문 실행} - 잘못하면 무한루프에 빠짐
        // 무한로프에 빠지는 것을 두려워하지 않기
        // do~while
        // do{반복}while{조건};
        // 조건을 만족하지 않을지라도 1번의 실행을 보장

        int su = 1;
        do{
            System.out.println("실행" + su++);
        } while(su <1);

    }
    
}
