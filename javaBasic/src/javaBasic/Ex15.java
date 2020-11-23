package javaBasic;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//연습문제 3번
		
		int count=0;
		int sum=0;
		for ( int i=0; i<=100; i++) {
			if ( i%3==0 ) {
				count+=1;
				sum+=i;
			}
		}
		System.out.println("3의 배수의 개수 : " + count);
		System.out.println("3의 배수의 합 : " + sum);
	}

}
