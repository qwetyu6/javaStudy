package org.java.condition;

import java.util.Scanner;

public class Switch5 {
	public static void main(String[] args) {

		System.out.println("switch�� 5");

		Scanner scn = new Scanner(System.in);

		System.out.println("ù��° ���� �Է�");
		int num1 = scn.nextInt(); // �����Է�

		System.out.println("�ι�° ���� �Է�");
		int num2 = scn.nextInt(); // �����Է�

		System.out.println("������ �Է�(+ - * / %)");
		char op = scn.next().charAt(0); /// char (�� ����)
		// String op2=scn.next(); //string

		int result = 0; // �ʱ�ȭ �ʿ�
		// ���� op�� (+-*/%) �ϳ���
		switch (op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		case '%':
			result = num1 % num2;
			break;
		}// break �� ��ġ

		System.out.println("������ ��� : " + num1 + " " + op + " " + num2 + " = " + result);

		scn.close();
	}

}
