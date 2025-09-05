package ch06.sec07.exam04;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		첫번째 생성자 호출
		Car car1 = new Car();
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
//		두번째 생성자 호출 (String)
		Car car2 = new Car("자가용");
		System.out.println("car.company : " + car2.company );
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
//		세번째 생성자 호출 (String, String)
		Car car3 = new Car("자가용", "빨강");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
//		네번째 생성자 호출 (String, String, int);
		Car car4 = new Car("택시","검정", 200 );
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
	}

}
