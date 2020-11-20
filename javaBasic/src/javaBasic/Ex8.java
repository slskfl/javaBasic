package javaBasic;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* char타입 switch문
	
		char grade = 'B';
		
		switch(grade){
			case 'A':
			case 'a':
				System.out.println("우수 회원입니다.");
				break;
			case 'B':
			case 'b':
				System.out.println("일반 회원입니다.");
				break;
			default:
				System.out.println("손님입니다.");
		}*/
		
		// string타입 switch문
		
		 String position = "과장";
		 
		 switch(position){
			case "부장":
				System.out.println("700만원.");
				break;
			case "과장":
				System.out.println("500만원.");
				break;
			default:
				System.out.println("300만원.");
		}
	}

}
