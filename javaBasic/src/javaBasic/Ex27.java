package javaBasic;

import java.util.Calendar;

public class Ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WENDESDAY;
			break;
		case 5:
			today = Week.THURSEDAY;
			break;
		case 6:
			today = Week.FIRDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;		
		}
		System.out.println("���� ����: " + today);
		
		if ( today == Week.SUNDAY) {
			System.out.println("�Ͽ��Ͽ��� �౸�� �մϴ�.");
		} else {
			System.out.println("������ ���θ� �մϴ�.");
		}
	}

}
