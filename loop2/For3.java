package org.java.loop2;

public class For3 {

	public static void main(String[] args) {
		System.out.println("for ��");

		System.out.println("1���� 100���� ¦���� ����غ�����(for)");

		for (int i = 2; i <= 100; i = i + 2) {
			System.out.print(i + " ");
			if (i % 10 == 0)
				System.out.println();
		}
		System.out.println("========");
		for (int i = 2; i <= 100; i += 2) {
			System.out.print(i + "");
			if (i % 10 == 0)
				System.out.println();
		}
		System.out.println("========");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				System.out.print(i + " ");
			if (i % 10 == 0)
				System.out.println();
		}
		System.out.println("1���� 100���� ¦�������� ���(for)");
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;//2+4+6+8+....
			}
		}

		System.out.println("¦���� ��(1~100): " + sum);

	}

}