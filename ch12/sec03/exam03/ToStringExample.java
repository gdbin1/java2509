package ch12.sec03.exam03;

public class ToStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone myPhone = new SmartPhone("삼성전자", "안드로이드");
		
//		toString() 메소드 호출
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
//		toString() 메소드 호출
		System.out.println(myPhone);
	}
//	객체 문자 정보- Object의 toString() 메소드는 객체의 문자 정보를 리턴함. 객체의 문자정보는 객체를 문자열로 표현한 값을 말함.
//	기본적으로 Object의 toString()메소드는 '클래스명@16진수해시코드'로 구성된 문자열을 리턴함.
	
//	객체의 문자 정보가 중요한 경우에는 Object의 toString() 메소드를 재정의해서 리턴하면 됨.
}
