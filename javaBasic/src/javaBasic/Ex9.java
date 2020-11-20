package javaBasic;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~100까지의 합 출력
		
		int sum = 0;
		
		/*for ( int i=0; i<=100; i++ ) {
			sum+=i;
		}
		
		System.out.println("1~100까지의 합 : " + sum);*/
		
		int i = 0;
		
		for ( i=1; i<=100; i++) {
			sum+=i;
		}
		
		System.out.println("1~" + (i-1) +"까지의 합 : " + sum)	;	
		
	}

}
