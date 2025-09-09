package ch07.sec03.exam02;

public class SmartPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SmartPhone 객체 생성
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
		
//		Phone으로부터 상속받은 필드 읽기
		System.out.println("모델: " + myPhone.model);
		System.out.println("색상: " + myPhone.color);
	}
//	ch07.sec03.exam02의 예제는 부모 클랙스가 매개변수를 갖는 생성자가 있는 경우임.
//	모든 객체는 생성자를 호츌해야하는데(부모객체도 예외x) - 부모 객체의 생성자는 어디서 호출된 것일까?
//	-> 자식 생성자에 숨어있음. 부모 생성자는 자식 생성자의 맨 첫줄에 숨겨져있는 super()에서 호출됨.
	
//	만약 부모 클래스에 기본 생성자가 없다면 자식 생성자 선언에서 컴파일 에러발생.
//	부모클래스에 기본 생성자가 없고 매개변수를 갖는 생성자만 있으면, super(매개값, ...) 코드를 직접 넣어야함.
//	이 코드는 매개값의 타입과 개수가 일치하는 부모 생성자를 호출함
}

