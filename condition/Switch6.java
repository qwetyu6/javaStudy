package org.java.condition;

import java.util.Scanner;

public class Switch6 {
	public static void main(String[] args) {

		System.out.println("switch문 6");
		Scanner scn = new Scanner(System.in);
		// CRUD
		System.out.println("쿼리문을 입력해서(insert,update,select,delete)");
		String input = scn.next();// 문자열"" /char ''

		switch (input) {
		case "insert":
			System.out.println("회원 가입페이지로 이동합니다");
			break;
		case "update":
			System.out.println("회원 수정페이지로 이동합니다");
			break;
		case "select":
			System.out.println("회원 조회페이지로 이동합니다");
			break;
		case "delete":
			System.out.println("회원 탈퇴페이지로 이동합니다");
			break;

		}
		
		
		System.out.println("java2022".charAt(0));//문자열의 0
		System.out.println("java2022".charAt(1));//문자열의 1
		System.out.println("java2022".charAt(2));//문자열의 2
		System.out.println("java2022".charAt(3));//문자열의 3
		System.out.println("java2022".charAt(4));//문자열의 4
		
		
		
		
		
		

		scn.close();
	}

}
