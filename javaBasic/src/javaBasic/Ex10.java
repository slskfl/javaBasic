package javaBasic;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*float Ÿ�� ī���� ����
		for ( float x=0.1f ; x<=1.0f ; x+=0.1f ) {
			System.out.println(x);
		}*/
		
		//������
		
		for (int i=2; i<=9; i++) {
			System.out.println("*** " + i + "�� ***" );
			for ( int j=1; i<=9; i++) {
				System.out.println( i +" X " + j + " = "+ (i*j));
			}
		}
	}

}
