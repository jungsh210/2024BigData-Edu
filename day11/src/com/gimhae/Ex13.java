package com.gimhae;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex13 {

	public static void main(String[] args) {
		// 로또번호 생성기(ver 0.4.0)
		
		// 1~45 랜덤한 6개의 중복되지 않는 번호
		
		System.out.println("로또번호 생성기(ver 0.4.0)");
		
		// Set lotto = new HashSet();
		Set lotto = new TreeSet();
		
		int cnt = 0;
		
		while(true) {
			cnt++;
			lotto.add(Integer.valueOf((int) (Math.random()*45)+1));
			if(lotto.size()==6) {
				break;
			}
		}
		System.out.println(lotto);
		System.out.println(cnt);
		
		

	}

}
