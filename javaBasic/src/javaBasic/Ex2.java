package javaBasic;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int penclis = 534;
		int student = 30;
		
		int pencilPerStudent = penclis / student;
		System.out.println("�ѻ�� �� " + pencilPerStudent + "�� ���´�.");
		
		int pencilsLeft = penclis % student;
		System.out.println("������ ������ " + pencilsLeft + "�̴�.");
		
		
		//���� �ڸ� ���ϸ� ������
		int value = 356;
		System.out.println(value - 56);
		System.out.println(value -(value % 100));
		
		}

}
