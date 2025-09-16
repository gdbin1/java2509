package ch12.sec06;

public class ValueCompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		128~127 초과값일 경우
//		아래 주석 설명처럼 int의 범위값을 초과해서 false 
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==: " + (obj1 == obj2));
		System.out.println("equals(): " + obj1.equals(obj2));
		System.out.println();
		
//		128~127 범위값일 경우
//		int 범위 안이기 때문에 true
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==: " + (obj3 == obj4));
		System.out.println("equals: " + obj3.equals(obj4));
	}
	
//	포장 객체는 내부 값을 비교하기 위해 ==와 != 연산자를 사용할 수 없음. 이 연산은 내부의 값을 비교하는 것이 아니라 포장 객체의 번지를 비교하기 때문임.
//	위 코드에서 obj1과 obj2의 값은 같지만, 번지가 다르기 때문에 false가 나옴
//	하지만 예외도 있음. 포장 객체의 효율적 사용을 위해 다음 범위의 값을 갖는 포장 객체는 공유됨. 이 범위의 값은 ==와 != 연산자로 비교할 수 있지만, 내부 값이 아니라 번지를 비교한다는건 같음.
//	(boolean - 값의 범위:true, false) / (char - 값의 범위: \u0000 ~ \u007f) / (byte,short,int : -128~127)
//	내부 값이 같은지 궁금할땐, equals()메소드로 내부 값을 비교 가능함.
}
