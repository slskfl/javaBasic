package javaBasic;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5�� �������� 9��
		boolean run = true;
		int studentNum = 0;
		int[] scores = null ;
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.�л��� | 2. ���� �Է� | 3.���� ����Ʈ | 4.�м� | 5.����.");
			System.out.println("--------------------------------------------------");
			System.out.print("����>>");
			
			int selectNum = scan.nextInt();
			
			if (selectNum==1) {
				System.out.print("�л� �� >>");
				studentNum = scan.nextInt();
				scores = new int[studentNum];
			} else if (selectNum==2) {
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores[" + i + "] >>" );
					scores[i]= scan.nextInt();
				}
			} else if (selectNum==3) {
				for( int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "] = " + scores[i]);
				}
			} else if (selectNum==4) {
				int max = 0;
				int cnt = 0;
				int sum = 0;
				int avg = 0;
				for( int i=0; i<studentNum; i++) {
					if (max < scores[i]) {
						max = scores[i];
					}
					sum+=scores[i];
					cnt++;
				}
				avg = sum/cnt;
				System.out.println("�ְ� ���� = " + max);
				System.out.println("��� ���� = " + avg);
				
			} else if (selectNum==5) {
				run = false;
			}
		}
		
		System.out.println("���α׷� ����.");
	}

}
