package javaBasic;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ٸ��� ���� ���ϱ�
		/*int lenghtTop = 5;
		int lengthBottom = 10;
		int height = 7;
		
		double area = ((lenghtTop + lengthBottom) * height) /2 ;
		System.out.println(area);*/
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������ ���̴�? ");
		int lenghtTop = scan.nextInt();
		System.out.print("�Ʒ����� ���̴�? ");
		int lengthBottom = scan.nextInt();
		System.out.print("������ ���̴�? ");
		int height	= scan.nextInt();	
		
		double area = ((lenghtTop + lengthBottom) * height) /2 ;
		System.out.println("��ٸ����� ���̴� = " + area);
		
		
		}

}
