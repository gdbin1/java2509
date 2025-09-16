package ch12.sec06;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Boxing
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
		
//		UnBoxing
		int value = obj;
		System.out.println("value: " + value);
		
//		연산 시 UnBoxing
		int result = obj + 100;
		System.out.println("result: " + result);
	}
//	기본 타입의 값을 포장 객체로 만드는 과정을 박싱(Boxing)이라고하고, 반대로 포장 객체에서 기본 타입의 값을 얻어내는 과정을 언박싱(UnBoxing)이라고 함.
//	박싱은 포장 클래스 변수에 기본 타입 값이 대입될 때 발생하고, 언박싱은 기본타입 변수에 포장 객체가 대입될 때 발생함.
}
