package javaBasic;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int sum = 0;
		int i = 1;
		
		/*while ( i<=10 ) {
			System.out.println(i);
			i++;
		} */
		while ( i<=100 ) {
			sum+=i;
			i++;
		}
		
		System.out.println("1~" + (i+1) + "�� :" + sum );
	}

}