package ch13.sec05;


public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		모든 사람이 신청 가능
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();
//		
////		학생만 신청 가능
////		얘넨 안됨.
////		Course.registerCourse2(new Applicant<Person>(new Person()));
////		Course.registerCourse2(new Applicant<Worker>(new Worker()));
		Course.registerCourse2(new Applicant<Student>(new Student()));
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();
//		
////		직장인 및 일반인만 신청가능 
////		얘넨 안됨.
////		Course.registerCourse3(new Applicant<Student>(new Student()));
////		Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
////		Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent));
		Course.registerCourse3(new Applicant<Person>(new Person()));
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
	}
//	제네릭 타입을 매개값이나 리턴 타입으로 사용할 때 타입 피라미드로 ?(와일드카드)를 사용할 수 있다. ?는 범위에 있는 모든 타입으로 대체 할 수 있다는 표시이다.
//	Student와 자식 클래스인 HighStudent, MiddleStudent만 가능하도록 매개변수를 선언가능함. ex) 리턴타입 메소드명(제네릭타입 <? extends Student>변수) {...}
//	Worker와 부모 클래스인 Person만 가능하도록 매개변수를 선언가능함. ex) 리턴타입 메소드명(제네릭타입 <? super Worker> 변수) {...}
//	어떤 타입이든 가능하도록 매개변수 선언 가능함. ex) 리턴타입메소드명 (제네릭타입 <?> 변수) {...}
}
