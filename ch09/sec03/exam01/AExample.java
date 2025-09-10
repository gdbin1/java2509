package ch09.sec03.exam01;

public class AExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		B객체 생성
		A.B b = new A.B();
	}
//	A클래스 외부에서 B객체를 생성하려면 A객체 생성없이 A클래스로 접근해서 B객체를 생성 가능함.
//	위처럼 A. <-- 까지 쳐도 B가 자동완성으로 B가 활성화됨 
//	A객체 생성없이 A.B b = new A.B();  로 하면 됨
}
