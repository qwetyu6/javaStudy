package org.java.condition;

import java.util.Scanner;

public class GradeMain {
	public static void main(String[] args) {

		System.out.println("국어, 영어, 수학 점수를 입력, 총점, 평균, 학점(평균)");
		Scanner scn = new Scanner(System.in);

		System.out.println("국어 점수");
		int kor = scn.nextInt();

		System.out.println("영어 점수");
		int eng = scn.nextInt();

		System.out.println("수학 점수");
		int math = scn.nextInt();

//		int sum = kor + eng + math;
//		double avg = (double) sum / 3;
//		
//		System.out.println("총점 :" + sum + "점");
//		System.out.println("평균 :" + avg + "점");
		
		Grade grade=new Grade(kor, eng, math);
		
		
		grade.sumGrade();
		grade.avgGrade();
		double avg=grade.avgGet();//평균값 반환	
		
		//학점
		if (avg >= 90) {
			if (avg >= 95) {
				System.out.println("학점 : A+");
			} else {
				System.out.println("학점 : A");
			}
		} else if (avg >= 80) {
			if (avg >= 85) {
				System.out.println("학점 : B+");
			} else {
				System.out.println("학점 : B");
			}
		} else if (avg >= 70) {
			if (avg >= 75) {
				System.out.println("학점 : C+");
			} else {
				System.out.println("학점 : C");
			}

		} else if (avg >= 60) {
			if (avg >= 65) {
				System.out.println("학점 : D+");
			} else {
				System.out.println("학점 : D");
			}
		} else {
			System.out.println("학점 : F");
		}
	}

}
