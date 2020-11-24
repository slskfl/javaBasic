package javaBasic;

public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//πËø≠¿« ±Ê¿Ã
		int[] scores = { 83, 90, 87 };
		int sum = 0;
		
		for(int i=0; i<scores.length; i++) {
			sum+=scores[i];
		}
		System.out.println("√—«’ : " + sum);
		
		double avg = (double) sum/scores.length;
		System.out.println("∆Ú±’ : " + avg );
		
		
	}

}
