package javaBasic;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//연습문제 7번
		
		boolean run = true;
		int balance=0;
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.println("-----------------------------");
			System.out.print("선택하시오>>");
			
			int choosen = scan.nextInt();
			
			if (choosen==1) {
				System.out.print("예금액>>");
				int push = scan.nextInt();
				balance+=push;
			} else if (choosen==2) {
				System.out.print("출금액>>");
				int pull = scan.nextInt();
				if(balance < pull) {
					break;
				}
				balance-=pull;
				
			} else if (choosen==3) {
				System.out.println("잔고>>" + balance);
			} else if (choosen==4) {
				System.out.println("종료");
			}
			
			
		}
	}

}
