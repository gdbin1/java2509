// 패키지가 동일
package ch06.sec13.exam02.package1;

public class B {

//	필드 선언

//	가능
	A a1 = new A(true);
	
//	가능
	A a2 = new A(1);
	
//	불가능 - private 생성자 접근 불가 (컴파일 에러)
//	A a3 = new A("문자열");
	
//	a1 - public과, a2 - default 는 가능하고, a3 private이 불가능한 이유는 ch06.sec13.exam01.package1 패키지 내부에 C클래스 주석에 있음.
}
