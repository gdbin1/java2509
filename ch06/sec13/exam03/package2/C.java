// 	패키지가 다름
package ch06.sec13.exam03.package2;
// ch06.sec13.exam03.package1에 있는 모든 class 임포트
import ch06.sec13.exam03.package1.*;

public class C {
	public C() {
//	객체 생성
		A a = new A();
		
//		필드값 변경
		
//		가능
		a.field1 = 1;
		
//		default 필드 접근 불가 (컴파일 에러)
//		a.field2 = 1;
		
//		private 필드 접근 불가 (컴파일 에러)
//		a.field3 = 1;
		
//		메소드 호출
//		가능
		a.method1();
		
//		default 메소드 접근 불가 (컴파일에러)
//		a.method2();
		
//		private 메소드 접근 불가 (컴파일 에러)
//		a.method3();
		
//		접근 불가능한 이유는 ch06.sec13.exam03.package1에 있는 A클래스 아래 주석 확인.
	}
}
