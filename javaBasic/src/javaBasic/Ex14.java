package javaBasic;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*while( true ) {
			int num = (int)(Math.random()*6) + 1;
			System.out.println(num);
			if( num==6 ) {
				break;
			}
		}
		
		System.out.println("프로그램 종료");*/
		
		for ( int i=1; i<=10; i++) {
			if ( i%2!=0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
