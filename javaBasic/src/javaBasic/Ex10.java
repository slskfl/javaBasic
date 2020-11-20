package javaBasic;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*float 타입 카운터 변수
		for ( float x=0.1f ; x<=1.0f ; x+=0.1f ) {
			System.out.println(x);
		}*/
		
		//구구단
		
		for (int i=2; i<=9; i++) {
			System.out.println("*** " + i + "단 ***" );
			for ( int j=1; i<=9; i++) {
				System.out.println( i +" X " + j + " = "+ (i*j));
			}
		}
	}

}
