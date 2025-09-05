package ch05.sec05;

public class EqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		strVar1과 strVar2의 변수에 똑같이 "홍길동"을 대입해서, 동일한 String 객체의 번지가 저장됨
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
//		때문에 변수의 이름은 다르지만 동일한 String 객체의 번지가 저징돼서, 아래 if문은 참으로 나옴
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
//		strVar1과 strVar2가 문자열이 동일하기 때문에 이거도 출력
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
//		------------------------------------------------------------------------------------------------------------
//		strVar3과 strVar4를 new 연산자를 이용해서 생성, 이럴 경우엔 서로 다른 String 객체의 번지를 가지게 됨.
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
//		서로 다른 번지를 갖기때문에, if문을 부정하고 else 문을 실행해서 참조가 다르다고 출력
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
//		strVar3과 strVar4의 문자열이 동일하기 때문에 이거도 출력
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
	}
//	자바는 문자열 리터럴이 동일하다면 String 객체를 공유하도록 설계됨.
	
//	String 변수에 문자열 리터럴을 대입하는것이 일반적이지만, new 연산자로 직접 String 객체를 생성하고 대입이 가능함.
//	new 연산자는 새로운 객체를 만드는 연산자로 객체 생성 연산자라고 함, 이 경우 new 연산자로 만든 객체는 서로 다른 String 객체의 번지를 가지게 됨.
	
}
