package org.java.condition;

import java.util.Scanner;

public class ScannerEx1 {		
	
	
	public static void main(String[] args) {
//		ScannerŬ���� �̿��ؼ� ���α׷��� �غ�����.
//		"�������� �Է��ؼ�(insert,update,select,delete)"; ----->CRUD
//		�Է� ���ڿ� "insert"�� "ȸ�� ������������ �̵��մϴ�"
//		�Է� ���ڿ� "update"�� "ȸ�� ������������ �̵��մϴ�"
//		�Է� ���ڿ� "select"�� "ȸ�� ��ȸ�������� �̵��մϴ�"
//		�Է� ���ڿ� "delete"�� "ȸ�� Ż���������� �̵��մϴ�"
	
		Scanner scn = new Scanner(System.in);
		System.out.println("�������� �Է��ؼ�(insert,update,select,delete)");
		String str=scn.nextLine();
		
		if(str.equals("insert")) {
			System.out.println("ȸ�� ������������ �̵��մϴ�");
		}else if (str.equals("update")) {
			System.out.println("ȸ�� ������������ �̵��մϴ�");
		}else if (str.equals("select")) {
			System.out.println("ȸ�� ��ȸ�������� �̵��մϴ�");
		}else if (str.equals("delete")) {
			System.out.println("ȸ�� Ż���������� �̵��մϴ�");
		}
				
		
		
		//scn.close();				
		
	}		
		

}
