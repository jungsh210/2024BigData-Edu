/* 
* 클래스 구성 요소(3가지)
 * 1. 메서드
 * 1-1 static 메서드
 * public static 리턴타입 메서드명(매개변수){실행코드;}
 * 메서드 = 코드의 반복
 * 
 * 메서드 명
 * 키워드 x
 * 문자로 시작(시작 소문자)
 * 특수문자 : _,$ : 사용 X
 * 카멜케이스(두 단어를 조합하되, 두번째 단어의 첫 글자를 대문자로)
 * 
 * 리턴타입
 * 메서드 말단의 리턴의 타입
 * 리턴값이 없을 경우 : void
 * 
 * 메서드의 호출
 * 메서드명()
 * 메서드명(매개변수 값)
 * 메서드명(매개변수 값, 매개변수 값,...) // func01 매개변수를 만들 때 여러 매개변수를 가지고 있어야 함 - public static void func01(int dan, int one,...)
 * (타입 변수명, 타입 변수명,...)
 * 매개변수-파라미터,인자,argument
 * 2. 필드
 * 3. 생성자
 */

class Ex02 {
    // main 메서드(기본 메서드, 이 메서드가 없으면 에러)
    public static void main(String[] args){   // String : 타입, args : 변수명
        System.out.println("시작");
        func01(2); // 2단 , 메서드를 변수 값으로 지정할 수 있는데, 이때 func01 메서드에 return 값이 있어야 함
        System.out.println("종료" );
    }

    // func01 메서드
    public static int func01(int dan){   // () 안에 매개변수를 처음부터 지정하면, return 값의 타입을 넣어준다.
                                          // int dan = 2; 이런식으로 안 넣어도 되고, func01(매개변수 값)을 넣어주면 자동으로 변수 안에 값이 들어간다.
        System.out.println("구구단"+dan+"단 출력");
        for(int i=1; i<10; i++){
            System.out.println(dan+"x"+i+"="+dan*i);
}
}
}