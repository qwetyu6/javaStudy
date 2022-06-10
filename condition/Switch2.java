package org.java.condition;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
		
		System.out.println("switch");
		
		Scanner scn = new Scanner(System.in);
	
		System.out.println("알파벳을 입력하세요"); //'a'
						//(char)m, (char)a, (char)n, (char)s, (char)o 
		char ch=scn.next().charAt(0);//문자열의 번지 charArt(0) "11"
				
		switch(ch) {
		case 'A': //A이냐 a
		case 'a':
			System.out.println("A입니다");
			break;
		case 'B':  //B이냐 b
		case 'b':
			System.out.println("B입니다");
			break;
		case 'C':  //C이냐 c
		case 'c':
			System.out.println("C입니다");
			break;
		default:
			System.out.println("A, B, C이외의 알파벳입니다");
				
		}
		scn.close();				
	}

}
