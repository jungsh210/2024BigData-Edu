package com.gimhae;

class Box3{
//	public static Pencil func01(Pencil pen) {
//		Box<Pencil> box = new Box<Pencil>();
//		box.setPen(pen);
//		return box.getPen();
//	}
	
	public static <T> T func01(T pen) {
		Box<T> box = new Box<T>();
		box.setPen(pen);
		return box.getPen();
		
	}
}
public class Ex04 {

	public static void main(String[] args) {
		//Pencil pen = Box3.func01(new Pencil());
		Ballpen pen = Box3.<Ballpen>func01(new Ballpen()); // 매개변수 앞 타입 <Ballpen> 지정
		Pencil pen1 = Box3.<Pencil>func01(new Pencil());
		pen.drow();
		pen1.drow();

	}

}
