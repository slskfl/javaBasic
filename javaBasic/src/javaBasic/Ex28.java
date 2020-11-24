package javaBasic;

public class Ex28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5장 연습문제 7번 문제
		int max = 0;
		
		int[] array1 = {1, 5, 3, 8, 2 };
		
		for(int i=0; i<array1.length; i++) {
			if ( array1[i] > max ) {
				max = array1[i];
			}
		}
		
		System.out.println("max : " + max);
		
		//5장 연습문제 8번 문제
		
		int[][] array2 = {{95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}};
		int sum = 0;
		double avg = 0;
		
		int cnt=0;
		
		for (int i=0; i<array2.length; i++) {
			for (int j=0; j<array2[i].length; j++) {
				sum += array2[i][j];
				cnt++;
			}
		}
		
		avg = sum/cnt;
	
		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);
		
	}

}
