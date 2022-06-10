package org.java.condition;

import java.util.Scanner;

public class ScannerEx1 {		
	
	
	public static void main(String[] args) {
//		Scanner클래스 이용해서 프로그래밍 해보세요.
//		"쿼리문을 입력해서(insert,update,select,delete)"; ----->CRUD
//		입력 문자열 "insert"면 "회원 가입페이지로 이동합니다"
//		입력 문자열 "update"면 "회원 수정페이지로 이동합니다"
//		입력 문자열 "select"면 "회원 조회페이지로 이동합니다"
//		입력 문자열 "delete"면 "회원 탈퇴페이지로 이동합니다"
	
		Scanner scn = new Scanner(System.in);
		System.out.println("쿼리문을 입력해서(insert,update,select,delete)");
		String str=scn.nextLine();
		
		if(str.equals("insert")) {
			System.out.println("회원 가입페이지로 이동합니다");
		}else if (str.equals("update")) {
			System.out.println("회원 수정페이지로 이동합니다");
		}else if (str.equals("select")) {
			System.out.println("회원 조회페이지로 이동합니다");
		}else if (str.equals("delete")) {
			System.out.println("회원 탈퇴페이지로 이동합니다");
		}
				
		
		
		//scn.close();				
		
	}		
		

}
