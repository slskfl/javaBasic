package javaBasic;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//연습문제 4번
		
		while (true) {
			int num1 = (int)(Math.random()*6) + 1;
			int num2 = (int)(Math.random()*6) + 1;
			int sum = num1 + num2;
			
			System.out.println("(" + num1 + "," + num2 + ")");
			
			if ( sum == 6) {
				break;
				
			}
		}
		
	}

}
