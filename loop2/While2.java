package org.java.loop2;

import java.util.Scanner;

public class While2 {
	public static void main(String[] args) {

		System.out.println("While");

		//구구단
		int i=2;
		while(i<10) {
			
			System.out.println(i+"단입니다");
			
			int j=1;
			while (j<10) {
				System.out.println(i+"*"+j+"="+(i*j));				
				j++;
			}		
			i++;
					
		}
		
		System.out.println("======================");
		
		//Scanner 에서 입력단(정수)를 이용해서 구구단을 출력해보세요.
		//예) 4입력하면 4단부터 9단까지
		
		System.out.println("구구단 입력");
		Scanner scn= new Scanner(System.in);
		
		System.out.println("단 입력");
		int startNUM=scn.nextInt();
		
		int i2=2;
		while(i2<10) {
			
			System.out.println(i2+"단입니다");
			
			int j=1;
			while (j<10) {
				System.out.println(i2+"*"+j+"="+(i2*j));				
				j++;
			}		
			i2++;
					
		}
		
	}

}
