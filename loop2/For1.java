package org.java.loop2;

public class For1 {
	
	public static void main(String[] args) {
		System.out.println("for ��");
		
		for(int i=0; i<10; i++) {
//			System.out.println(i);
//			System.out.print(i+ " ");
			//1~10���� ���
			//������ , �� �����غ���, if�����		
//			int i2=i+1;
//			System.out.println(i2);
//			if (i==9) {
//				System.out.println((i+1));
//			}else {
//				System.out.print((i+1)+",");
//			}							
			
			if (i==9) {
				System.out.print((i+1));
				break;//���� ��ɹ��� ���� ���ϰ� �ݺ����� ����
			}

			System.out.print((i+1)+",");

		}//break ��
		
		System.out.println("==========================");
		
		
		for(int i=0;i<10;i++) {
			
//			String url="";
			
			System.out.println("url(img/bg"+i+".jpg) no-rpeat 50%/cover");
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
