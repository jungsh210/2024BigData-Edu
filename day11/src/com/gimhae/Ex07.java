package com.gimhae;

import java.util.Enumeration;
import java.util.Vector;

/*
 * Vector
 * 값을 넣고, 값을 바꿀 순 없음
 */

public class Ex07 {

	public static void main(String[] args) {
		Vector vec = new Vector();
		
		// 순서가 있는 vector
		vec.addElement("첫번째"); // vector에 값을 넣을 때
		vec.addElement("두번째");
		vec.addElement("세번째");
		vec.addElement("네번째");
		for(int i=0; i<vec.size(); i++) {
			System.out.println(vec.elementAt(i)); // vetor의 값을 꺼낼 때
		}
		
		System.out.println("--------------------------");
		
		Enumeration eles = vec.elements();
		System.out.println(eles.nextElement());
		System.out.println(eles.nextElement());
		System.out.println(eles.nextElement());
		System.out.println(eles.nextElement());
		// System.out.println(eles.nextElement()); // vec에 들어있는 값이 총 4개 밖에 없기 때문에 더 불러내면 에러
		
		eles = vec.elements(); // 다시 불러와서 값을 출력
		System.out.println(eles.nextElement());
		System.out.println(eles.nextElement());
		System.out.println(eles.nextElement());
		System.out.println(eles.nextElement());
		
		
	}

}
