package javaBasic;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//논리 연산자
		int charCode = 'A';
		
		if ( (charCode>=65) & (charCode<=90)) {
			System.out.println("1. 대문자입니다.");
		}
		if ( (charCode>=97) && (charCode<=122)) {
			System.out.println("2. 대문자입니다.");
		};
		if ( !(charCode<48) && !(charCode>57)) {
			System.out.println("3. 0~9 숫자입니다.");
		}
		
		int value = 6;
		
		if ( (value%2==0) | (value%3==0)) {
			System.out.println("1. 2 또는 3의 배수입니다.");
		}
		if ( (value%2==0) || (value%3==0)) {
			System.out.println("2. 2 또는 3의 배수입니다.");
		}
			
		}

}
