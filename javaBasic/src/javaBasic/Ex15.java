package javaBasic;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������� 3��
		
		int count=0;
		int sum=0;
		for ( int i=0; i<=100; i++) {
			if ( i%3==0 ) {
				count+=1;
				sum+=i;
			}
		}
		System.out.println("3�� ����� ���� : " + count);
		System.out.println("3�� ����� �� : " + sum);
	}

}
