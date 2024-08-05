package com.gimhae;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Car implements Comparable<Car>{ // Treeset에서는 Comparable이 있어야 Car 클래스 사용 가능
	String color;
	public Car(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return color;
	}
	@Override
	public int compareTo(Car o) {
		return this.color.compareTo(o.color);
	}
	
//	@Override
//	public int hashCode() {
//		if(color.equals("빨강")) {
//			return 1;
//		}
//		return super.hashCode();
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		return true;
//	}
	
}

public class Ex12 { 

	public static void main(String[] args) {
		// 중복 검사
		
		// Set<String> set;
//		Set<Integer> set;
		Set<Car> set;
		
		//set = new HashSet<>();
		
		set = new TreeSet<>();
		
		set.add(new Car("빨강"));
		set.add(new Car("주황"));
		set.add(new Car("빨강")); 
		// 원래는 hashset에서는 중복값이 하나만 출력이 되지만, 
		// Car 클래스를 통해서 현재는 새로운 객체를 생성했기 때문에 서로 다른 객체로 인지
		// 빨강이 두 번 출력 가능
		set.add(new Car("초록"));
		
//		
//		set.add(1111);
//		set.add(2222);
//		set.add(3333);
//		// set.add(1111); // Treeset에서는 중복 값에 제거
//		set.add(4444);
		
		Iterator<Car> ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}

	}

}
