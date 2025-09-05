package ch06.sec13.exam02.package2;

// 아래 주소의 패키지에 있는 모든 클래스 import 해오기
import ch06.sec13.exam02.package1.*;

public class C {

//	필드 선언
	
//	가능
	A a1 = new A(true);
	
//	불가능 default 생성자 접근 불가 (컴파일 에러)
//	A a2 = new A(1);
	
//	불가능 private 생성자 접근 불가 (컴파일 에러)
//	A a3 = new A("문자열");
	
//	이거에 대한 설명도 ch06.sec13.exam01.package1 패키지 내부에 C클래스 주석에 있음.
}
