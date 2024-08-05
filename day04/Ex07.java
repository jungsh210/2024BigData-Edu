package com.day04;

/*
 * Call method
 * static   - > static을 호출   :  [패키지.클래스명]메서드명 -> 같은 패키지, 같은 클래스면 [패키지, 클래스명] 생략 가능 
 * static   - > non-static을 호출  : 참조변수.메서드명
 * non-static   - > static을 호출  : [패키지.클래스명]메서드명
 * non-statid   - > non-static을 호출  : [this]메서드명
 */
public class Ex07 {
    // static Ex07 me = new Ex07();
    public static void main(String[] args) {
        com.day04.Ex07.func01(); // com.day04 : 같은 패키지면 생략 가능, .Ex07 : 같은 클래스면 생략 가능

        Ex07 me = new Ex07(); // 객체를 찍고 객체를 받고 있음
        Ex07 you = new Ex07(); // 객체를 찍고 객체를 받고 있음
        Ex07 me2 = me;  // me2는 이미 객체를 찍고 객체를 받고 있는 me가 대입되어 있기 때문에 서로 같은 객체를 가리키고 있다. = me2와 me의 주소가 같다. 
        System.out.println(me == you);
        System.out.println(me == me2);

        me.func02(me);
    }
    public static void func01(){ // static에서는 this 사용 x, static은 객체를 받아오지 않기 때문에 this 존재 X
        // System.out.println(this); //에러 발생
        // static에서 객체로 불러온 변수를 사용하려면
        // main 밖으로 static Ex07 me = new Ex07();를 추가해주면 된다.
    }
    public void func02(Ex07 me3){  // me3는 위 main에서 받아온 me
        // Ex07 me = new Ex07(); // 새로운 객체로 받아오면 X 이미 func02이가 Ex07 객체를 받아왔는데 다시 Ex07 객체를 받아오는 꼴이 된다.
        // thiw.func03(); // this 생략 가능
        System.out.println(me3 == this); // 위 main에서 me를 받아온 me3와 this는 같다. -> this.func03()으로 대체 가능 
        // -> non-static에서만 this 사용 가능
    }
    public void func03(){
        System.out.println("f3");
    }
}
