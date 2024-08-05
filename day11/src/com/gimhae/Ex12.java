package com.gimhae;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Car implements Comparable<Car>{ // Treeset������ Comparable�� �־�� Car Ŭ���� ��� ����
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
//		if(color.equals("����")) {
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
		// �ߺ� �˻�
		
		// Set<String> set;
//		Set<Integer> set;
		Set<Car> set;
		
		//set = new HashSet<>();
		
		set = new TreeSet<>();
		
		set.add(new Car("����"));
		set.add(new Car("��Ȳ"));
		set.add(new Car("����")); 
		// ������ hashset������ �ߺ����� �ϳ��� ����� ������, 
		// Car Ŭ������ ���ؼ� ����� ���ο� ��ü�� �����߱� ������ ���� �ٸ� ��ü�� ����
		// ������ �� �� ��� ����
		set.add(new Car("�ʷ�"));
		
//		
//		set.add(1111);
//		set.add(2222);
//		set.add(3333);
//		// set.add(1111); // Treeset������ �ߺ� ���� ����
//		set.add(4444);
		
		Iterator<Car> ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}

	}

}
