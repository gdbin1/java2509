package ch08.sec12;

public class InstanceofExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		구현 객체 생성
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
//		ride()메소드 호출 시 구현 객체를 매개값으로 전달
		ride(taxi);
		System.out.println();
		ride(bus);
	}
//	인터페이스 매개변수를 갖는 메소드
	public static void ride(Vehicle vehicle) {
////		방법1
//		매개값이 Bus인 경우에만 강제 타입 변환해서 checkFare() 메소드를 호출
//		if(vehicle instanceof Bus) {
//			Bus bus = (Bus) vehicle;
//			bus.checkFare();
//		}
	
//	방법2  - 자바 12부터 사용 가능.-이때부턴 instanceof 연산의 결과가 true일 경우, 우측 타입 변수를 사용할 수 있기 때문에, 강제 타입 변환이 필요 없음.
//		bus 변수 사용
	if(vehicle instanceof Bus bus ) {
		bus.checkFare();
	}
	vehicle.run();
	}
//	객체 타입 확인 - instanceof 연산자는 인터페이스에서도 사용가능하다. 
//	메소드의 매개변수가 인터페이스 타입일 경우, 메소드 호출 시 매개값은 해당 인터페이스를 구현하는 모든 객체가 될 수 있음.
//	만약 매개값이 특정 구현 객체일 경우에만 강제 타입 변환을 하고 싶을때, instanceof 연산자를 사용해서 매개값의 타입을 검사해야 함.
}
