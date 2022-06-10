package org.java.loop2;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		System.out.println("for 문");
		// 구구단

		// 2단~9단
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단입니다");

			// 1~9
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}

		}
		System.out.println("====================");

		// 9단부터 2단까지 구구단을 출력, for
		// 9*9 ~ 2*1, 증감 i--

		for (int i = 9; i > 1; i--) {
			System.out.println(i + "단입니다");

			// 1~9
			for (int j = 9; j > 0; j--) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}

		}

		System.out.println("====================");

		// Scanner 클래스 이용해서 시작단을 입력받아서 구구단 입력단 출력

		System.out.println("구구단 입력");
		Scanner scn = new Scanner(System.in);

		System.out.println("시작단 입력");
		int startNUM = scn.nextInt();

		System.out.println("끝단 입력");
		int endNUM = scn.nextInt();
		
		System.out.println(startNUM+" "+endNUM);

		if (startNUM > endNUM) {
			System.out.println("시작단이 끝단보다 크거나 같아야됩니다");
		} else {
			for (int i = startNUM; i < endNUM + 1; i++) {
				System.out.println(i + "단");
				// 1~9
				for (int j = 1; j < 10; j++) {
					System.out.println(i + " * " + j + " = " + (i * j));
				}

			}

		}

		
		scn.close();
	}

}
