package ch06.sec11.exam01;

public class Korean {
//	인스턴스 final 필드 선언
	final String nation = "대한민국";
	final String ssn;
	
//	인스턴스 필드 선언
	String name;
	
//	생성자 선언
	public Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
//	인스턴스 필드와 정적 필드는 언제든 값을 변경할 수 있음.
//	하지만 경우에 따라선, 값을 변경하는걸 막고, 읽기맘ㄴ 허용해야 할때가 있는데, 이때 final 필드와 상수를 선언해서 사용함.
//	final은 '최종적'이란 뜻이기 때문에 final 필드는 초기값이 저장되면 이게 최종적인 값이되어서, 프로그램 실행 도중에 수정이 불가능함.
//	final 필드에 초기값을 줄 수 있는 방법은 1. 필드 선언 시에 초기값 대입 2. 생성자에서 초기값 대입
}
