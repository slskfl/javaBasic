package javaBasic;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������� 7��
		
		boolean run = true;
		int balance=0;
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-----------------------------");
			System.out.println("-----------------------------");
			System.out.print("�����Ͻÿ�>>");
			
			int choosen = scan.nextInt();
			
			if (choosen==1) {
				System.out.print("���ݾ�>>");
				int push = scan.nextInt();
				balance+=push;
			} else if (choosen==2) {
				System.out.print("��ݾ�>>");
				int pull = scan.nextInt();
				if(balance < pull) {
					break;
				}
				balance-=pull;
				
			} else if (choosen==3) {
				System.out.println("�ܰ�>>" + balance);
			} else if (choosen==4) {
				System.out.println("����");
			}
			
			
		}
	}

}
