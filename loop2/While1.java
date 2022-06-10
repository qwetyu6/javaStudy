package org.java.loop2;

public class While1 {
	public static void main(String[] args) {

		System.out.println("While");

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("================");

		int i = 0;
		while (i < 10) {			
			System.out.println(i);				
			i++;
			
		}
		
		System.out.println("================");
		
		int i2=0;
		
		while(true) {
			
			System.out.print(i2);
			
			//if 문을 이용해서 0~9까지만 출력되게 해보세요
			if(i2>=9) break;
			
			i2++;
			
		}
		
		
		
		
		
		
		
		
		
	}

}
