package org.java.condition;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
		
		System.out.println("switch");
		
		Scanner scn = new Scanner(System.in);
	
		System.out.println("���ĺ��� �Է��ϼ���"); //'a'
						//(char)m, (char)a, (char)n, (char)s, (char)o 
		char ch=scn.next().charAt(0);//���ڿ��� ���� charArt(0) "11"
				
		switch(ch) {
		case 'A': //A�̳� a
		case 'a':
			System.out.println("A�Դϴ�");
			break;
		case 'B':  //B�̳� b
		case 'b':
			System.out.println("B�Դϴ�");
			break;
		case 'C':  //C�̳� c
		case 'c':
			System.out.println("C�Դϴ�");
			break;
		default:
			System.out.println("A, B, C�̿��� ���ĺ��Դϴ�");
				
		}
		scn.close();				
	}

}
