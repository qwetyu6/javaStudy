package org.java.condition;

import java.util.Scanner;

public class Switch3 {
	public static void main(String[] args) {
		
		System.out.println("switch�� 3");
		
		Scanner scn = new Scanner(System.in);
	
		System.out.println("������ �Է�(0~100)");
		
		int num = scn.nextInt(); //�����Է�(����)
		char grade = ' ';
		switch(num)
		{
		case 100: case 99: case 98: case 97: case 96: case 95:
		case 94: case 93: case 92: case 91: case 90:
			grade='A';
			break;
		case 89: case 88: case 87: case 86: case 85:
		case 84: case 83: case 82: case 81: case 80:
			grade='B';
			break;
		case 79: case 78: case 77: case 76: case 75:
		case 74: case 73: case 72: case 71: case 70:
			grade='C';
			break;
		case 69: case 68: case 67: case 66: case 65:
		case 64: case 63: case 62: case 61: case 60:
			grade='D';
			break;
		case 59: case 58: case 57: case 56: case 55:
		case 54: case 53: case 52: case 51: case 50:
			grade='F';
		default:
			grade ='F';
			
		}
		
	System.out.println("����: "+grade);

		
		
		scn.close();				
	}

}
