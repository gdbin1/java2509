package ch08.sec10.exam02;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		인터페이스 변수 선언과 구현 객체 대입
		Vehicle vehicle = new Bus();
		
//		인터페이스를 통해서 호출
		vehicle.run();
//		vehicle.checkFare(); <-- 아님
		
//		강제 타입 변환 후 호출
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
	}
//	위 코드가 강제 타입 변환의 예시. Bus클래스에서 Vehicle 인터페이스 클래스의 run 메소드를 구현하고, checkFare() 메소드를 추가했다.
//	구현 객체가 인터페이스 타입으로 자동 변환되면, 인터페이스에 선언된 메소드만 사용 가능하다. Bus 클래스에서 구현을 했지만, Bus는 Vehicle의 구현클래스이므로
//	자동으로 인터페이스 타입으로 변환되었다. 하지만, 여기서 Bus 클래스에 추가한 메소드를 실행하려면, 위처럼 강제타입 변환 후 호출을 해야한다.
}
