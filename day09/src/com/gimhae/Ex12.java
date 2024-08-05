package com.gimhae;

public class Ex12 {

	public static void main(String[] args) {
		
		// StringBuffer의 양은 16 -> 34(17의 2배) -> 70(35의 2배) -> 142(71의 2배) 규칙으로 늘려나간다
		// 메모리를 효율적으로 사용하려면 StringBuilder와 StringBuffer을 사용하는 것이 좋지만,
		// StringBuffer와 StringBuilder는 익숙하지 않으면 문제가 생길 가능성이 크다.
		// 익숙하지 않지만, 조금씩 사용해보는 것을 추천
		
		StringBuffer sb = new StringBuffer();
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("-----------------");
		
		sb.append("java");
		
		System.out.println(sb.length()); // 길이는 늘어나지만
		System.out.println(sb.capacity()); // capacity는 늘어나지 않음
		System.out.println("-----------------");
		for(int i=0; i<16; i++)
		sb.append("a");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("-----------------");
		for(int i=0; i<17; i++)
		sb.append("a");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}

}
