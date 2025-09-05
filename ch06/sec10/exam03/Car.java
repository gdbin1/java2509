package ch06.sec10.exam03;

public class Car {
//	인스턴스 필드 선언
	int speed;
	
//	인스턴스 메소드 선언
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	static void simulate() {
//		객체 생성
		Car myCar = new Car();
//		인스턴스 멤버 사용
		myCar.speed = 200;
		myCar.run();
	}
	public static void main(String[]args) {
//		정적 메소드 호출
		simulate();
		
//		객체 생성
		Car myCar = new Car();
//		인스턴스 멤버 사용
		myCar.speed = 60;
		myCar.run();
	}
//	정적 메소드와 정적 블록은 객체가 없어도 실해오딘다는 특징 때문에 인스턴스 필드나 인스턴스 메소드 사용불가. 또한 객체 자신의 참조인 this도 사용불가.
	
//	정적 메소드와 정적 블록에서 인스턴스 멤버를 사용하고 싶다면 위처럼 객체를 먼저 생성하고, 참조 변수로 접근해야함
//  main()메소드도 동일한 규칙이 적용됨. main()메소드도 정적 메소드기 떄문에, 객체생성없이 인스턴스 필드와 인스턴스 메소드를 바로 사용하지 못함.
//	ex) 잘못된 코드 예시:
//	public class Car{
//		int speed;
//		void run() {}
//		public static void main(String[]args) {
//			speed = 60;
//			run();
//		}
//	} 이렇게 작성하게 될시에 컴파일에러 오류 발생 - 알맞은 예시는 위 코드.
	
}
