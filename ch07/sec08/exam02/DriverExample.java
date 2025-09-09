package ch07.sec08.exam02;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Driver 객체 생성
		Driver driver = new Driver();
		
//		매개값으로 Bus 객체를 제공하고 driver() 메소드 호출
		Bus bus = new Bus();
		
//		driver.drive(new Bus())와 동일
		driver.drive(bus);
		
//		매개값으로 Taxi 객체를 제공하고 driver() 메소드 호출
		Taxi taxi = new Taxi();
		
//		driver.drive(new Taxi())와 동일
		driver.drive(taxi);
	}
//	다형성은 필드보단, 메소드를 호출할 때 많이 발생함.
//	메소드가 클래스 타입의 매개변수를 가지고 있을 경우, 호출할 때 동일한 타입의 객체를 제공하는게 정석이지만, 자식 객체를 제공할 수도 있음. 여기서 다형성이 발생함
	
//	drive()메소드는 매개변수 cehicle이 참조하는 객체의 run() 메소드를 호출하지만, 자식 객체가 run()메소드를 재정의하고 있다면, 재정의된 run() 메소드가 호출됨.
//	그래서 어떤 자식 객체가 제공되느냐에 따라 drive()의 실행 결과가 달라짐. 이게바로 매개변수의 다형성
}
