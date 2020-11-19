package javaBasic;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 중첩 if문
		
		int score = (int)Math.random() * 20 +71;
		System.out.println("점수 : " + score);
		
		String grade = "F";
		
		if ( score>=90 ) {
			if ( score>=95 ) {
				grade = "A+";
			} else {
				grade = "A";
			}
		}
		
		if ( score>=80 ) {
			if ( score>=85 ) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		
		if ( score>=70 ) {
			if ( score>=75 ) { 
				grade = "C+";
			} else {
				grade = "C";
			}
		}
		
		System.out.println("학점 : " + grade);
		
	}

}
