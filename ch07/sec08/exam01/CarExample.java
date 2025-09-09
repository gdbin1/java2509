package ch07.sec08.exam01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Car 객체 생성
		Car myCar = new Car();
		
//		Tire 객체 장착
		myCar.tire = new Tire();
		myCar.run();
		
//		HankookTire 객체 장착
		myCar.tire = new HankookTire();
		myCar.run();
		
//		KumhoTire 객체 장착
		myCar.tire = new KumhoTire();
		myCar.run();
	}
//	HankookTire와 KumhoTire는 동일한 메소드를 갖고있음. 
//	두 클래스 모두 Tire 클래스를 오버라이딩 하고있어서, 타이어 메소드 호출 시 오버라이딩된 메소드가 호출됨.
//	때문에 위처럼 각각의 클래스를 호출할 떄 결과가 다름. 이게 다형성임.
//	다형성을 구현하려면 자동 타입 변환과 메소드 재정의가 필요함. 필드 다형성이란, 필드 타입은 동일하지만, 대입되는 객체가 달려젓 실행 결과가 다양하게 나올 수 있는것을 말함.
//	위처럼 HankookTire 클래스와 KumhoTire 클래스의 객체를 Tire 필드에 대입할 수 있는 이유는 자동 타입 변환이 되기 때문임.
}
