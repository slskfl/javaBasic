package javaBasic;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~100������ �� ���
		
		int sum = 0;
		
		/*for ( int i=0; i<=100; i++ ) {
			sum+=i;
		}
		
		System.out.println("1~100������ �� : " + sum);*/
		
		int i = 0;
		
		for ( i=1; i<=100; i++) {
			sum+=i;
		}
		
		System.out.println("1~" + (i-1) +"������ �� : " + sum)	;	
		
	}

}
