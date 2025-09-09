package ch07.sec10.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Phone phone = new Phone(); <-- x
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}

//	--*클래스 선언에 abstract키워드를 붙이면 추상 클래스 선언이 되고, 추상 클래스는 new 연산자를 이용해서 객체를 직접 만들지 못하고 상속을 통해 자식 클래스만 만들 수 있음.*--
	
//	객체를 생성할 수 있는 클래스를 실체 클래스라고 한다면, 이 캘르스들의 공통적인 필드나 메소드를 추출해서 선언한 클래스를 추상 클래스 라고 함.
//	추상 클래스는 실체 클래스의 부모 역할을 함. 그래서 실체 클래스는 추상 클래스를 상속해서 공통적인 필드나 메소드를 물려받을 수 잇음.
//	ex) Bird, Insect, Fish같은 실체 클래스에서 공통되는 필드와 메소드를 따로 선언한 Animal 클래스를 만들 수 있고, 이걸 상속해서 실체 클래스를 만들 수 잇음.
	
//	추상 클래스는 실체 클래스의 공통되는 필드와 메소드를 추출해서 만들기 때문에 new 연산자를 사용해서 객체를 직접 생성하지 못함.
//	추상 클래스는 새로운 실체 클래스를 만들기 위한 부모 클래스로만 사용되기 때문에, extends 뒤에만 올 수 있음.
//	클래스 앞에 abstract 키워드를 붙이면 추상 클래스가 됨. 이 패키지에선 Phone 클래스가 추상클래스임.
//	추상클래스도 필드, 메소드 선언가능. 또한, 자식 객체가 생성될 때 super()로 추상클래스의 생성자가 호출되기때문에 생성자도 반드시 있어야 함.
}
