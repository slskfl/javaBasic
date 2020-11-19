package javaBasic;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int penclis = 534;
		int student = 30;
		
		int pencilPerStudent = penclis / student;
		System.out.println("한사람 당 " + pencilPerStudent + "을 갖는다.");
		
		int pencilsLeft = penclis % student;
		System.out.println("나머지 연필은 " + pencilsLeft + "이다.");
		
		
		//십의 자리 이하를 버리기
		int value = 356;
		System.out.println(value - 56);
		System.out.println(value -(value % 100));
		
		}

}
