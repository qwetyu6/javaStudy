package org.java.condition;

import java.util.Scanner;

public class Switch6 {
	public static void main(String[] args) {

		System.out.println("switch�� 6");
		Scanner scn = new Scanner(System.in);
		// CRUD
		System.out.println("�������� �Է��ؼ�(insert,update,select,delete)");
		String input = scn.next();// ���ڿ�"" /char ''

		switch (input) {
		case "insert":
			System.out.println("ȸ�� ������������ �̵��մϴ�");
			break;
		case "update":
			System.out.println("ȸ�� ������������ �̵��մϴ�");
			break;
		case "select":
			System.out.println("ȸ�� ��ȸ�������� �̵��մϴ�");
			break;
		case "delete":
			System.out.println("ȸ�� Ż���������� �̵��մϴ�");
			break;

		}
		
		
		System.out.println("java2022".charAt(0));//���ڿ��� 0
		System.out.println("java2022".charAt(1));//���ڿ��� 1
		System.out.println("java2022".charAt(2));//���ڿ��� 2
		System.out.println("java2022".charAt(3));//���ڿ��� 3
		System.out.println("java2022".charAt(4));//���ڿ��� 4
		
		
		
		
		
		

		scn.close();
	}

}
