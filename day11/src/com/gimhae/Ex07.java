package com.gimhae;

import java.util.Enumeration;
import java.util.Vector;

/*
 * Vector
 * ���� �ְ�, ���� �ٲ� �� ����
 */

public class Ex07 {

	public static void main(String[] args) {
		Vector vec = new Vector();
		
		// ������ �ִ� vector
		vec.addElement("ù��°"); // vector�� ���� ���� ��
		vec.addElement("�ι�°");
		vec.addElement("����°");
		vec.addElement("�׹�°");
		for(int i=0; i<vec.size(); i++) {
			System.out.println(vec.elementAt(i)); // vetor�� ���� ���� ��
		}
		
		System.out.println("--------------------------");
		
		Enumeration eles = vec.elements();
		System.out.println(eles.nextElement());
		System.out.println(eles.nextElement());
		System.out.println(eles.nextElement());
		System.out.println(eles.nextElement());
		// System.out.println(eles.nextElement()); // vec�� ����ִ� ���� �� 4�� �ۿ� ���� ������ �� �ҷ����� ����
		
		eles = vec.elements(); // �ٽ� �ҷ��ͼ� ���� ���
		System.out.println(eles.nextElement());
		System.out.println(eles.nextElement());
		System.out.println(eles.nextElement());
		System.out.println(eles.nextElement());
		
		
	}

}
