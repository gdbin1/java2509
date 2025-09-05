package ch06.sec04;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
	}
//	클래스로부터 객체를 생성하려면 객체 생성 연산자인 new가 필요함.
//	new 연산자 뒤에는 생성자 호출 코드가 오는데, 클래스() 형태를 가짐. ex) 위 코드처럼, new Student();
	
//	클래스의 두가지 용도 1. 라이브러리(library)클래스: 실행 할 수 없으며, 다른 클래스에서 이용하는 클래스
//					2. 실행 클래스 main(): 메소드를 가지고 있는 실행 가능한 클래스
//	ch06.sec04에 있는 Student클래스는 실행이 불가능한 1.라이브러리 클래스이고, 지금 작성하는 이 클래스는 2. 실행 클래스임.
//	실행 클래스는 실행하면서 라이브러리 클래스를 내부에서 이용.
}
