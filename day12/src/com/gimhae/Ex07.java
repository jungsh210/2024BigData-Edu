package com.gimhae;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.CardLayout;
import java.awt.GridLayout;

public class Ex07 extends java.awt.Frame{
	// ��ġ - ��ġ������(��� ��ġ�Ұ� ����)
	// ��� - UI ������Ʈ ���� ����
	
	public Ex07() {
		// ��ġ ������ - ��� �Ӽ�, ���� �Ӽ�
		
		// ��� �Ӽ��� ������ ũ�⿡ ���缭 ����� �˾Ƽ� ������
		
		// Ex07~Ex10 : ��� �Ӽ�
		// 1. FlowLayout : ��� ����, ������Ʈ�� ��ġ, ũ��x
		// ������ ũ�⿡ ���� ������ ����
		
//		LayoutManager lm = new FlowLayout(); // ��ġ �̵� x, ������ ��ȯ x
//		this.setLayout(lm);
		
		// 2. GridLayout
		
		LayoutManager lm = new GridLayout(2,2); // ��ġ �̵� x, ������ ��ȯ x 
		// (3,2) : 3�� 2���� �ٵ��� ������ ȭ�� ����, ��(����)�� ������ ���� 
		// -> �������� ��ư���� gridlayout�� ������ ������ ��(����)�� �þ��.
		
		this.setLayout(lm);
		
		Font f = new Font("�ü�ü", 0, 30); // ��Ʈ ����
		
		java.awt.Button btn= new Button(); // ��ư ��ü ����
//		btn.setFont(f); // font ����
		btn.setLabel("ù��° ��ư");
		java.awt.Button btn2= new Button(); // ��ư ��ü ����
		btn2.setLabel("�ι�° ��ư");
		java.awt.Button btn3= new Button(); // ��ư ��ü ����
		btn3.setLabel("����° ��ư");
		java.awt.Button btn4= new Button(); // ��ư ��ü ����
		btn4.setLabel("�׹�° ��ư");
		java.awt.Button btn5= new Button(); // ��ư ��ü ����
		btn5.setLabel("�ټ�° ��ư");
		java.awt.Button btn6= new Button(); // ��ư ��ü ����
		btn6.setLabel("����° ��ư");
		
		this.add(btn); // ȭ�鿡 ��ư �߰�
		this.add(btn2); // ȭ�鿡 ��ư �߰�
		this.add(btn3); // ȭ�鿡 ��ư �߰�
		this.add(btn4); // ȭ�鿡 ��ư �߰�
		this.add(btn5); // ȭ�鿡 ��ư �߰�
//		this.add(btn6);
		this.setSize(500,400); // ȭ�� ũ�� ����
		this.setVisible(true); // ȭ�鿡 �����ִ� �� - true
	}

	public static void main(String[] args) {
		// GUI
		// awt    1.0~ os��û->java�� ���� �� ����->������ �ڿ��Ҹ�, �ü�� ����(java�� �ü���� ����)
		// swing  1.2~ java drow->java�� ���� drow->awt ���ϴ� �� ���� ����
		// awt�� swing�� ȥ���Ͽ� GUI�� ����
		
		Ex07 me = new Ex07();

	}

}
