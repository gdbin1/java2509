package ch06.sec13.exam01.package1;

import ch06.sec13.exam01.package1.*;
// 위처럼 임포트 했을시엔, 위 주소의 패키지에 있는 모든 클래스를 임포트옴.

public class C {
	
//	필드 선언
//	A클래스는 public을 지웠기 때문에 접근불가 (컴파일에러)
	A a;
	B b;
	
	
//	 클래스를 어디에서나 사용할 수 있는것은 아님, 클래스가 어떤 접근 제한을 갖느냐에 따라 사용 가능 여부가 결정됨. 아래 주석에 설명	
	
//	ch06.sec13.exam01.package1의 패키지 내부에 A클래스를 보면 얘만 모양이 다른 걸 확인할 수 있음. A클래스의 public를 지워서 그런듯.
	
	
//	자바의 접근 제한자의 강화 순서는 public -> protected -> default -> private 순서로 뒤로갈수록 더 강화되는 순서임.
	
//	접근제한자 			제한대상 					제한범위
//	public			클래스,필드,생성자,메소드			없음
//	protected			필드,생성자,메소드			같은 패키지이거나,자식 객체만 사용가능
//	(default)		클래스,필드,생성자,메소드			같은 패키지
//	private				필드,생성자,메소드			객체 내부
	
}
