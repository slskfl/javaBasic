package javaBasic;

import java.io.IOException;

public class Ex12 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//키보드로 while문 제어하기
		
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while ( run ) {
			if ( keyCode!=13 && keyCode!=10 ) {
				System.out.println("------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("------------------");
				System.out.println("선택 :");
			}
			
			keyCode = System.in.read();
			
			if ( keyCode==49 ) {
				speed++;
				System.out.println("현재 속도 = " + speed );
			} else if ( keyCode==50 ) {
				speed--;
				System.out.println("현재 속도 = " + speed );	
			} else if ( keyCode==51 ) {
				run = false;
			}
			
		}
		
		System.out.println("프로그램 종료.");
	}

}
