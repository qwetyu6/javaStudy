package org.java.loop2;

public class For1 {
	
	public static void main(String[] args) {
		System.out.println("for 문");
		
		for(int i=0; i<10; i++) {
//			System.out.println(i);
//			System.out.print(i+ " ");
			//1~10까지 출력
			//마지막 , 를 제거해보셍, if문사용		
//			int i2=i+1;
//			System.out.println(i2);
//			if (i==9) {
//				System.out.println((i+1));
//			}else {
//				System.out.print((i+1)+",");
//			}							
			
			if (i==9) {
				System.out.print((i+1));
				break;//하위 명령문을 실행 안하고 반복문이 종료
			}

			System.out.print((i+1)+",");

		}//break 문
		
		System.out.println("==========================");
		
		
		for(int i=0;i<10;i++) {
			
//			String url="";
			
			System.out.println("url(img/bg"+i+".jpg) no-rpeat 50%/cover");
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
