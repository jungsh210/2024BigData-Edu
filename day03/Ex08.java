/*
 * 객체를 보여주기 위한 클래스를 설계
 * 자동차 시승
 * Class Car에서는 변수들을 지정
 * class Ex08에서는 해당 변수값을 지정
 * 객체 : 붕어빵
 * 클래스 : 붕어빵 틀
 */

class Car {
    // 속성
    public String name; // 차 이름
    public String model; // 차 모델명
    public String company; // 차 제작 회사, company에 값을 넣지 않으면 null값 출력
    // public String company = " "; // 차 제작 회사, null값이 들어가지 않게 하기 위해
    public String color = "흰"; // 차 색상
    public int speed = 0; // 차 속도
    public int maxSpeed = 150; // 차 최대 속도

    // 기능
    // 속도 증가
    public void speedUp(int up){
        speed += up;
        if (speed > maxSpeed){ // 최고 속도인 150을 넘지 않도록
            speed = maxSpeed;
        }
    } 
    // 속도 감속
    public void speedDown(){
        speed -= 13;
        if(speed < 0){
            speed=0;
        }
        }
    public void speedShow(){ // 속도 보여주는 기계판
        System.out.println(company+" 차 "+color+"색 "+model+"의 현재 속도는 "+speed+"km");
    }
}
class Ex08 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.company ="기아";
        myCar.model = "모닝";
        myCar.speedShow();
        for(int i=0; i<30; i++){
            myCar.speedUp(10);
            myCar.speedShow();
        }
        for(int i=0; i<30; i++){
            myCar.speedDown();
            myCar.speedShow();
        }
        myCar.company ="현대";
        myCar.model = "소나타";
        myCar.color = "검정";
        myCar.maxSpeed = 180;
        myCar.speedShow();
        for(int i=0; i<30; i++){
            myCar.speedUp(17);
            myCar.speedShow();
        }
        for(int i=0; i<30; i++){
            myCar.speedDown();
            myCar.speedShow();
        }
    }
}

