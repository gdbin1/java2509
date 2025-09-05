package ch06.sec07.exam04;

public class Car {

//		필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
//	생성자 선언
//	첫번째 생성자
	Car(){}
//		두번째 생성자
		Car(String model){
			this.model = model;
		}
		
//		세번째 생성자
		Car(String model, String color){
			this.model = model;
			this.color = color;
		}
		
//		네번째 생성자
		Car(String model, String color, int maxSpeed){
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;
		}
//	매개값으로 객체의 필드를 다양하게 초기화하려면 생성자 오버로딩이 필요, 생성자 오버로딩이란 매개변수를 달리하는 생성자를 여러 개 선언하는것을 말함.
}
