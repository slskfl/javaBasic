package javaBasic;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		
		if ( strVar1==strVar2) {
			System.out.println("������ ����.");
		} else {
			System.out.println("������ �ٸ�.");
		}
		
		if ( strVar1.equals(strVar2)) {
			System.out.println("���ڿ��� ����.");
		} 
		
		String strVar3 = new String("�Ź�ö");
		String strVar4 = new String("�Ź�ö");
		
		if ( strVar3==strVar4) {
			System.out.println("������ ����.");
		} else {
			System.out.println("������ �ٸ�.");
		}
		
		if ( strVar3.equals(strVar4)) {
			System.out.println("���ڿ��� ����.");
		} 
	}

}
