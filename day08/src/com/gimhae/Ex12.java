package com.gimhae;

public class Ex12 {
	int a = 111;
	String msg = "abcd";
	
	public Ex12() {}
	public Ex12(int a) {}

	// �ڹ� ���÷���
	
	public static void main(String[] args) throws Exception{
		Ex12 me = new Ex12();
		
		Class clz = me.getClass();  // Class��� Ŭ����
		Class clz2 = Ex12.class;
		// Class clz3 = Class.forName(clz.getName());
		Class clz3 = Class.forName("com.gimhae.Ex12");
		
		System.out.println(clz.getName());
		System.out.println(clz.getCanonicalName());
		System.out.println(clz.getTypeName());
		System.out.println(java.util.Arrays.toString(clz.getDeclaredAnnotations()));
		System.out.println(java.util.Arrays.toString(clz.getDeclaredConstructors()));
		System.out.println(java.util.Arrays.toString(clz.getDeclaredFields()));
		System.out.println(java.util.Arrays.toString(clz.getDeclaredMethods()));
		Object obj = clz3.newInstance(); // Ŭ������ �������� ��
		System.out.println(((Ex12)obj).msg);
		

	}

}
