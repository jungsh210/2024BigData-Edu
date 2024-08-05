public class Ex08 {
    public static void main(String[] args){
        // 제어문
        // 1. 조건문(switch)
        // switch문은 타겟값을 넣어야 함
        // 맞는 case를 찾아서 수행을 한 후 break문으로 빠져나오는 방식, break가 없으면 조건문을 빠져나가지 않음 -> 모든 조건문 실행
        // default 문은 필수가 아닌 선택
        String su = "ja";
        su+="va";
        switch (su) {
            case "web":
                System.out.println("삼");
                break;
            case "java":
                System.out.println("이");
                break;
            case "db":
                System.out.println("일");
                break;
            
            default: // 선택
                System.out.println("몰라");
                break;
        }
    }
    
}
