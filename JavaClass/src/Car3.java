
public class Car3 {

		// TODO Auto-generated method stub
		// �ʵ尪 ����
		String company = "�����ڵ���";
		String model;
		String color;
		int maxSpeed;
		
		Car3(){
		}
		
		Car3(String model){
			this(model, "����", 250);
		}
		
		Car3(String model, String color){
			this(model, color, 250);
		}
		
		Car3(String model, String color, int maxSpeed){
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;
		}
}
