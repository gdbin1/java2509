package ch06.sec07.exam5;

public class Car {

//		필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(String model) {
//		첫번째 생성자 - 20라인 생성자 호출
		this(model, "은색", 250);
	}
	Car(String model, String color) {
//		두번째 생성자 -20라인 생성자 호출
		this(model, color, 250);
	}
	
	Car(String model, String color, int maxSpeed){
//		세번째 생성자
//		공통 초기화 코드
		this.model = model;
		this.color = color;
		
//		추가적인 실행문
		this.maxSpeed = maxSpeed;
	}
	
//	생성자 오버로딩이 많아질 경우엔, 생성자 간의 중복된 코드가 발생함. 이러면 가독성도 좋지않고, 코드를 많이 작성해야되니, 이걸 간단하게 하려면
//	공통 코드를 한 생성자에만 집중적으로 작성하고, 나머지 생성자는 this()를 사용해서 공통 코드를 가지고 있는 생성자를 호출하는 방법으로 개선 가능.
//	this()는 생성자의 첫줄에 작성되며, 다른 생성자를 호출하는 역할을 함.
//	호출하고 싶은 생성자의 매개변수에 맞게 매개값 제공.
//	this() 다음에는 추가적인 실행문을 작성할 수 있으며, 호출되는 생성자의 실행이 끝나면 원래 생성자로 돌아와서 다음실행문을 실행함
}
