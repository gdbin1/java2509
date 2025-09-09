package ch08.sec11.exam01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		자동차 객체 생성
		Car myCar = new Car();
		
//		run()메소드 실행
		myCar.run();
		
//		타이어 객체 교체
		myCar.tire1 = new KumhoTire();
		myCar.tire2 = new HankookTire();
		
//		run() 메소드 실행(다형성: 실행 결과가 다름)
		myCar.run();
	}
//	현업에서는 상속보다는 인터페이스를 통해서 다형성을 구현하는 경우가 더 많음.
//	다형성 : 사용 방법은 동일하지만, 다양한 결과가 나오는 성질을 말함. 상속의 다형성과 마찬가지로 인터페이스도, 당형성을 구현하기위해 재정의와 자동 타입 변환 기능을 씀.
	
//	이 클래스에서 타이어 객체를 교체했기 때문에 tire1, tire2 필드에 어떠한 타이어 구현 객체가 대입되어도 Car 객체는 타이어 인터페이스에 선언된 메소드만 사용한다.
//	그렇기 때문에 서로 다른 결과가 나온다
}
