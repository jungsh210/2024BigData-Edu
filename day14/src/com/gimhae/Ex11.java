package com.gimhae;

/*
 * ���� § �ڵ�
 */

import java.io.File;
import java.util.Scanner;
import java.util.Date;

/* ����ڿ��� �ּҸ� �Է¹����� �ش� ���丮 �� ���ϵ� Ȯ�� ���
 * > C:\workspace\day14
 * rwx ���� 11:40   <DIR>
 * rwx ���� 09:03   <DIR>
 * rwx ���� 09:03   <DIR>
 * rwx ���� 09:03   <DIR>
 * r-x ���� 09:03   <DIR>
 * rwx ���� 09:03   <DIR>
 * rwx ���� 09:03   <DIR>
 * rwx ���� 09:03   <DIR>
 * 
 */
public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">");
		
		String input = sc.next();
		
		File f = new File(input); // C:\workspace\day14\src\com\gimhae�� �������, gimhae ������ ����
		
		if(f.isDirectory()) {
			String[] fn = f.list();
			
//			System.out.println(f); // C:\workspace\day14\src\com\gimhae ��� 
			
			for(int i=0; i<fn.length; i++) {
				
//				System.out.println(fn[i]); // ���� �̸��� ����� ����
				
				// �̷��� �ؾ� C:\workspace\day14\src\com\gimhae\���� �̸����� ������
				
				File dir = new File(f, fn[i]); // gimhae ���� �� ���Ͽ� ���� ����
				
//				System.out.println(dir);
				
				String r;
                String w;
                String x;
                long len = 0;
                String dirn = null;
                
                if (dir.canRead()) {
                    r = "r";
                } else {
                    r = "-";
                }
                
                if (dir.canWrite()) {
                    w = "w";
                } else {
                    w = "-";
                }
                
                if (dir.canExecute()) {
                    x = "x";
                } else {
                    x = "-";
                }
                if(dir.isFile()) {
                	len = dir.length();
                	dirn = "FILE";
                }
                if(dir.isDirectory()){
                	dirn = "DIR";
                }
                System.out.println(r + w + x + " " +new Date(dir.lastModified())+ " " +"["+len+"]"+" "+"["+dirn+"]"+" "+fn[i]);
				
			}
		}
		
	}
}