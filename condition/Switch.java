package org.java.condition;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		
		System.out.println("switch");
		
		System.out.println("������ �Է��ϼ���");
		
		Scanner scn =new Scanner(System.in);
		
		int key = scn.nextInt();
		
		switch(key) {
		case 1:
			System.out.println("�ְ� �������Դϴ�");
			break;
		case 2:
			System.out.println("�߰� �������Դϴ�");
			break;
		case 3:
			System.out.println("�Ϲ� ��� �Դϴ�");
			break;
		default:
			System.out.println("������ �����ϴ�");
		}
		
		
		scn.close();
		
		
	}

}
