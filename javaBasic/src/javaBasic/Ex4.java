package javaBasic;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//�� ������
		int charCode = 'A';
		
		if ( (charCode>=65) & (charCode<=90)) {
			System.out.println("1. �빮���Դϴ�.");
		}
		if ( (charCode>=97) && (charCode<=122)) {
			System.out.println("2. �빮���Դϴ�.");
		};
		if ( !(charCode<48) && !(charCode>57)) {
			System.out.println("3. 0~9 �����Դϴ�.");
		}
		
		int value = 6;
		
		if ( (value%2==0) | (value%3==0)) {
			System.out.println("1. 2 �Ǵ� 3�� ����Դϴ�.");
		}
		if ( (value%2==0) || (value%3==0)) {
			System.out.println("2. 2 �Ǵ� 3�� ����Դϴ�.");
		}
			
		}

}
