package ch08.sec11.exam02;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Driver 객체 생성
		Driver driver = new Driver();
		
//		Vehicle 구현 객체 생성
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
//		매개값으로 구현 객체 대입(다형성: 실행 결과가 다름)
//		자동 타입 변환 -> 오버라이딩 메소드 호출 = 다형성
		driver.drive(bus);
//		자동 타입 변환 -> 오버라이딩 메소드 호출 = 다형성
		driver.drive(taxi);
	}

//	Bus가 Vehicle의 구현 클래스면, 위처럼 메소드를 호출할 때 Bus 객체를 생성해서 매개값으로 줄 수 있음.
//	그렇기때문에 drive()메소드를 호출할 때 인터페이스 Vehicle을 구현하는 어떤 객체라도 매개값으로 줄 수 있는데,
//	어떤 객체를 주느냐에 따라 run()메소드의 실행 결과가 다르게 나옴.
//	이유는 구현객체 (Bus클래스, Taxi클래스)에서 재정의된 run() 메소드의 실행 내용이 다르기 때문임. 이게바로 매개변수의 다형성.
}
