package javaBasic;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//do-while��
		
		System.out.println("�޼����� �Է��ϼ���.");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");
		
		Scanner scan = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scan.nextLine();
			System.out.println(inputString);
		} while( !inputString.equals("q"));
		
		System.out.println();
		System.out.println("���α׷� ����.");
		
	}
}
