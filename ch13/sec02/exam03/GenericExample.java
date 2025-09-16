package ch13.sec02.exam03;

public class GenericExample {

	public static void main(String[] args) {
		
		Box<String>box1 = new Box<>();
		box1.content = "100";
		
		Box<String> box2 = new Box<>();
		box2.content = "100";
		
//		Box의 내용물 비교 (String에서 재정의된 equals() 사용)
		boolean result1 = box1.compare(box2);
		System.out.println("result1: " + result1);
	}
//	타입 파라미터는 기본적으로 Object 타입으로 간주되어서, Object가 가지고 있는 메소드를 호출할 수 있음.
//	위 코드는 Box의 내용물을 비교하기 위해 타입파라미터로 Object의 equals()메소드를 호출함.
}
