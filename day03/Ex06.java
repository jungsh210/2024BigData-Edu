/*
 * 클래스의 구성요소
 * 2. 변수
 * 2-1 클래스 변수(static)
 * 2-2 멤버필드(non-static)
 */
class Ex06 {
    public static int su1 = 111; // 클래스 변수
    public int su2 = 2222;  // 멤버 필드
    public static int su5; // 선언 또는 변수 초기화만 수행, su5 = 0
    // su5 = 5555; -> 불가능, static에서는 변수를 선언하거나 선언하면서 초기화가 동시 진행, 따로 변수의 값을 넣어서 수행하는 것은 메서드
    public static String msg = null; // 참조 변수들의 초기값은 null(0), 표시가 안 되어있으면 무조건 0

    public static void func01(){
        System.out.println(su1);
        Ex06 me = new Ex06();
        System.out.println(me.su2);
    }
    public static void main(String[] args){
        int su3 = 3333;
        int su4;
        su4 = 4444;
        System.out.println(su1);
        Ex06 me = new Ex06();
        System.out.println(me.su2);
        func01();
    }
}
