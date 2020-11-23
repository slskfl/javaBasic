package javaBasic;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//연습문제 6번
		
		for(int i=0; i<=6; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for ( int i=0; i<9; i++) {
			for(int j=9;j>i ;j-- ) {
				System.out.print(" ");
			}
			for(int l=0;l<2*i-1 ;l++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
