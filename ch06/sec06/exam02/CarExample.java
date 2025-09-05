package ch06.sec06.exam02;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Car객체 생성
		Car myCar = new Car();
		
//		Car 객체의 필드값 읽기
//		이렇게해서 결과를 봤을때엔 , Car에 있는 필드값이 출력됨
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		
//		Car객체의 필드값 변경
//		아래처럼 필드값을 변경 가능
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);
	}
	
//	필드를 사용한다는건, 필드값을 읽고, 변경도 가능하다는 것임.
//	필드 변수를 가져오기때문에, 참조 변수와 도트(.) -- > myCar.메소드 위 코드처럼 접근, 및 변경 가능
}
