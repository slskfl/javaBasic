package javaBasic;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//do-while문
		
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scan.nextLine();
			System.out.println(inputString);
		} while( !inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료.");
		
	}
}
