package ch07.sec04.exam01;

public class Computer extends Calculator {
	
//	메소드 오버라이딩
//	아래 @Override는 컴파일시 정확히 오버라이딩이 되었는지 체크해줌 (생략가능)
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
