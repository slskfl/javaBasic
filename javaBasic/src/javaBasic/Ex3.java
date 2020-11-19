package javaBasic;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사다리꼴 넒이 구하기
		/*int lenghtTop = 5;
		int lengthBottom = 10;
		int height = 7;
		
		double area = ((lenghtTop + lengthBottom) * height) /2 ;
		System.out.println(area);*/
		
		Scanner scan = new Scanner(System.in);
		System.out.print("윗면의 길이는? ");
		int lenghtTop = scan.nextInt();
		System.out.print("아랫면의 길이는? ");
		int lengthBottom = scan.nextInt();
		System.out.print("높이의 길이는? ");
		int height	= scan.nextInt();	
		
		double area = ((lenghtTop + lengthBottom) * height) /2 ;
		System.out.println("사다리꼴의 넓이는 = " + area);
		
		
		}

}
