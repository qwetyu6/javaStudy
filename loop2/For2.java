package org.java.loop2;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		System.out.println("for ��");
		// ������

		// 2��~9��
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "���Դϴ�");

			// 1~9
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}

		}
		System.out.println("====================");

		// 9�ܺ��� 2�ܱ��� �������� ���, for
		// 9*9 ~ 2*1, ���� i--

		for (int i = 9; i > 1; i--) {
			System.out.println(i + "���Դϴ�");

			// 1~9
			for (int j = 9; j > 0; j--) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}

		}

		System.out.println("====================");

		// Scanner Ŭ���� �̿��ؼ� ���۴��� �Է¹޾Ƽ� ������ �Է´� ���

		System.out.println("������ �Է�");
		Scanner scn = new Scanner(System.in);

		System.out.println("���۴� �Է�");
		int startNUM = scn.nextInt();

		System.out.println("���� �Է�");
		int endNUM = scn.nextInt();
		
		System.out.println(startNUM+" "+endNUM);

		if (startNUM > endNUM) {
			System.out.println("���۴��� ���ܺ��� ũ�ų� ���ƾߵ˴ϴ�");
		} else {
			for (int i = startNUM; i < endNUM + 1; i++) {
				System.out.println(i + "��");
				// 1~9
				for (int j = 1; j < 10; j++) {
					System.out.println(i + " * " + j + " = " + (i * j));
				}

			}

		}

		
		scn.close();
	}

}
