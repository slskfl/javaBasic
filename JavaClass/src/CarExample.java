
public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색상 : " + myCar.color);
		System.out.println("최고 속도 : " + myCar.maxSpeed);
		System.out.println("현재 속도 : " + myCar.speed);
		
	
		myCar.speed = 60;
		System.out.println("제작회사 : " + myCar.speed);	
		
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
