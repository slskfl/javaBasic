package javaBasic;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("점수는? ");
		int score = scan.nextInt();
		
		if(score>=90) {
			System.out.println("점수가 " + score + "입니다.");
			System.out.println("등급은 A입니다.");
		} else if(score>=80) {
			System.out.println("점수가 " + score + "입니다.");
			System.out.println("등급은 B입니다.");
		} else if(score>=70) {
			System.out.println("점수가 " + score + "입니다.");
			System.out.println("등급은 C입니다.");
		}else {
			System.out.println("점수가 " + score + "입니다.");
			System.out.println("등급은 D입니다.");
		}
	}

}
