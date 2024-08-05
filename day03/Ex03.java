class Ex03 {
    // 변수가 적용되는 부분은 {부터 }까지 {} 이게 다 나오면 같은 변수가 나와도 상관없음
    public static void main(String[] args){
        int a = 1111;  // main 메서드 {} 괄호 안에서만 a = 1111 적용
        System.out.println("main before a ="+a);
        int b = 2222;
        func01();
        System.out.println("main after a ="+a);
        int i = 0;
        for(i=0; i<0; i++){} // 에러 X
        for(i=0;i<0;i++){} // 에러 X
    }
    public static void func01(){
        int a = 3333;
        System.out.println("func01 a = "+a);
    }
}
