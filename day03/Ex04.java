class Ex04 {
    public static void main(String[] args){
        // static이 없는 메서드를 불러오는 방법, 존재할 곳을 만드는 것 -> 객체 생성 -> 클래스 필요
        // me;  // 클래스타입 변수명;
        for(int i=0; i<3; i++){
            Ex04 me = new Ex04();
            me.func01();
        }
    }
    public void func01(){  // static 메서드 X, 1) 존재할 곳을 먼저 만들어야 한다.
        System.out.println("non-static method func01");

    }
    
}
