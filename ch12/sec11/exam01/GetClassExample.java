package ch12.sec11.exam01;

public class GetClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		프로그램에서 Class 객체를 얻는 방법 3가지 예시.
//		how1
		Class clazz = Car.class;
		
//		how2
//		Class clazz = Class.forName("ch12.sec11.exam01.Car");
		
//		how3
//		Car car = new Car();
//		Class clazz = car.getClass();
		
		System.out.println("패키지: " + clazz.getPackage().getName());
		System.out.println("클래스 간단 이름: " + clazz.getSimpleName());
		System.out.println("클래스 전체 이름: " + clazz.getName());
	}
//	메타정보: 패키지정보, 타입정보, 멤버(생성자, 필드, 메소드)정보 등을 말함.
//	리플렉션: 이러한 메타 정보를 프로그램에서 읽고 수정하는 행위를 리플렉션 이라고 함.
//			-------------------
//	패키지와 타입 정보 얻기
//	메소드								용도
//	Package getPackage()			패키지 정보 읽기
//	String getSimpleName() 			패키지를 제외한 타입 이름
//	String getName() 				패키지를 포함한 전체 타입 이름
	
	
}
