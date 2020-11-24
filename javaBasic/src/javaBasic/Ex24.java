package javaBasic;

public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 속의 배열
		
		int[][] mathScores = new int[2][3];
		for(int i=0; i<mathScores.length; i++) {
			for(int k=0; k<mathScores[i].length; k++) {
				System.out.println("mathScores[" + i + "][" + k + "] = " + mathScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for(int i=0; i<englishScores.length; i++) {
			for(int k=0; k<englishScores[i].length; k++) {
				System.out.println("englishScores[" + i + "][" + k + "] = " + englishScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] javaScorse = {{ 95, 80 },{ 92, 96, 80}};
		for(int i=0; i<javaScorse.length; i++) {
			for(int k=0; k<javaScorse[i].length; k++) {
				System.out.println("javaScorse[" + i + "][" + k + "] = " + javaScorse[i][k]);
			}
		}
		System.out.println();
	}

}
