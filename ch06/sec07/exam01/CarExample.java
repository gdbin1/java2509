package ch06.sec07.exam01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car("그랜저", "검정", 250);
//		Car myCar = newCar()기본 생성자 호출 못함
	}
	
//	기본생성자: 클래스에 생성자 선언이 없으면 컴파일러는 기본생성자를 바이트코드 파일에 자동으로 추가시킨다.
//	클래스가 pubic class로 선언되면 기본 생성자도 public이 붙지만, 클래스가 public없이 class로만 선언되면
//	기본 생성자에도 public이 붙지 않는다.
//	ex) (소스파일) public class Car {}  -->>(바이트코드파일) public class Car{ public Car() } 자동 추가
	
	
}
