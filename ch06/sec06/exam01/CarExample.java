package ch06.sec06.exam01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Car 객체 생성
		Car myCar = new Car();
		
		
//		Car 객체의 필드값 읽기
		System.out.println("모델명: " + myCar.model);	
		System.out.println("시동여부: " + myCar.start);
		System.out.println("현재속도: " + myCar.speed);
	}
	
//	실행 클래스
//	결과는 null false 0이 출력, 필드를 사용하지만 필드는 객체의 데이터이므로, 객체가 존재하지 않으면 필드도 존재하지않음.
//	클래스로부터 객체가 생성된 후에 필드를 사용 가능하고, 필드는 객체 내부의 생성자와 메소드 내부에서 사용가능하며, 객체 외부에서도 접근해서 사용 가능.
//	객체 내부에서는 단순히 필드명으로 읽고, 변경 가능하지만, 외부 객체에서는 참조 변수와 도트(.)연산자를 이용해서 필드를 읽고 변경해야함.
//	도트(.)는 객체가 가지고있는 필드나 메소드에 접근하고자 할떄 참조 변수 뒤에 붙임. 위 코드처럼
}
