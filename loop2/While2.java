package org.java.loop2;

import java.util.Scanner;

public class While2 {
	public static void main(String[] args) {

		System.out.println("While");

		//������
		int i=2;
		while(i<10) {
			
			System.out.println(i+"���Դϴ�");
			
			int j=1;
			while (j<10) {
				System.out.println(i+"*"+j+"="+(i*j));				
				j++;
			}		
			i++;
					
		}
		
		System.out.println("======================");
		
		//Scanner ���� �Է´�(����)�� �̿��ؼ� �������� ����غ�����.
		//��) 4�Է��ϸ� 4�ܺ��� 9�ܱ���
		
		System.out.println("������ �Է�");
		Scanner scn= new Scanner(System.in);
		
		System.out.println("�� �Է�");
		int startNUM=scn.nextInt();
		
		int i2=2;
		while(i2<10) {
			
			System.out.println(i2+"���Դϴ�");
			
			int j=1;
			while (j<10) {
				System.out.println(i2+"*"+j+"="+(i2*j));				
				j++;
			}		
			i2++;
					
		}
		
	}

}
