package javaBasic;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������? ");
		int score = scan.nextInt();
		
		if(score>=90) {
			System.out.println("������ " + score + "�Դϴ�.");
			System.out.println("����� A�Դϴ�.");
		} else if(score>=80) {
			System.out.println("������ " + score + "�Դϴ�.");
			System.out.println("����� B�Դϴ�.");
		} else if(score>=70) {
			System.out.println("������ " + score + "�Դϴ�.");
			System.out.println("����� C�Դϴ�.");
		}else {
			System.out.println("������ " + score + "�Դϴ�.");
			System.out.println("����� D�Դϴ�.");
		}
	}

}
