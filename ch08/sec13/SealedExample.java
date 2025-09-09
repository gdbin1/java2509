package ch08.sec13;

public class SealedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplClass impl = new ImplClass();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodA();
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}
//	봉인된 클래스랑 사용이 비슷함. sealed 키워드를 쓰면 permits 키워드를 쓰고 그 뒤에 상속 가능한 자식 인터페이스를 지정해야 함.
//	*봉인된 InterfaceA를 상속하는 InterfaceB는 non-sealed (봉인해제)를 사용하거나 sealed (봉인)키워드를 사용해서 또 다른 봉인 인터페이스로 선언해야 함.*
	
//	이 패키지의 InterfaceB는 non-sealed (봉인해제)를 사용했음. 그렇기때문에 자식 인터페이스인 InterfaceC를 만들 수 있었음.
	
//	연결고리 설명-> InterfaceA라는 인터페이스클래스 생성-> sealed permits으로 InterfaceB만 자식으로 생성가능하게 지정.
//	->InterfaceB 인터페이스 클래스를 생성해서 no-selead(봉인해제)를 사용. 봉인을 해제해서 자식 인터페이스를 만들 수 있음.
//	->InterfaceC 인터페이스를 InterfaceB 인터페이스한테 상속받음. (봉인해제해서 가능)
//	->ImpClass라는 구현클래스를 만들고 앞 3개의 인터페이스 메소드를 구현함.

	//	봉인된 인터페이스. - 자바15부터 무분별한 자식 인터페이스 생성을 방지하려고 봉인된(sealed)인터페이스를 사용할 수 있음.
//	InterfaceA의 자식 인터페이스는 InterfaceB만 가능하고, 그 이외는 자식 인터페이스가 될수 없음.
	
	
}
