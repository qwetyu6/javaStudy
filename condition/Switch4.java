package org.java.condition;

import java.util.Scanner;

public class Switch4 {
	public static void main(String[] args) {

		System.out.println("switch�� 4");

		Scanner scn = new Scanner(System.in);
		System.out.println("������ �Է�(0~100)");
		int num = scn.nextInt(); // �����Է�(����)
		char grade = ' ';

		switch (num / 10) { // �Է� ����/10 ���� 10�̳� 9��
		case 10:// 100
		case 9:// 90~99
			grade = 'A';
			break;
		case 8:// 80~89
			grade = 'B';
			break;
		case 7:// 70~79
			grade = 'C';
			break;
		case 6:// 60~69
			grade = 'D';
			break;
		case 5:// 50~59
			grade = 'F';
		default:// 0~49
			grade = 'F';

		}

		System.out.println("����: " + grade);
		scn.close();
	}

}
