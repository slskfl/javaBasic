
public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		System.out.println("����ȸ�� : " + myCar.company);
		System.out.println("�𵨸� : " + myCar.model);
		System.out.println("���� : " + myCar.color);
		System.out.println("�ְ� �ӵ� : " + myCar.maxSpeed);
		System.out.println("���� �ӵ� : " + myCar.speed);
		
	
		myCar.speed = 60;
		System.out.println("����ȸ�� : " + myCar.speed);	
		
		System.out.println();	
		
		System.out.println("ifield : " + myCar.ifield);	
		System.out.println("dfield : " + myCar.dfield);	
		System.out.println("ffield : " + myCar.ffield);	
		System.out.println("cfield : " + myCar.cfield);	
		System.out.println("sfield : " + myCar.sfield);	
		System.out.println("bfield : " + myCar.bfield);	
		System.out.println("arrfield : " + myCar.arrfield);	
	
	}
	

}
