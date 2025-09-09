package ch07.sec02;

public class SmartPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SmartPhone 객체 생성
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
		
//		Phone으로부터 상속받은 필드 읽기
		System.out.println("모델: " + myPhone.model);
		System.out.println("색상: " + myPhone.color);
		
//		SmartPhone의 필드 읽기
		System.out.println("와이파이 상태: " + myPhone.wifi);
		
//		Phone으로부터 상속받은 메소드 호출
		myPhone.bell();
		myPhone.sendVoice("여보세여");
		myPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		myPhone.sendVoice("아~네, 반갑슴다.");
		myPhone.hangUp();
		
//		SmartPhone의 메소드 호출
		myPhone.setWifi(true);
		myPhone.internet();
	}
//	부모 클래스를 수정하면 모든 자식 클래스에 수정 효과를 가져옴. EX) A필드와 메소드를 수정하면 b,c를 수정하지 않아도 수정된 A의 필드와 메소드 사용 가능.
//	프로그램에선 자식이 부모를 선택해서 상속받음. 자식 클래스를 선언할 때 어떤 부모한테 상속받을지 결정하고, entends를 뒤에 붙임.
//	ex) public class 자식클래스 extends 부모클래스 {}
//	하지만 여러개의 부모 클래스를 상속할 수는 없어서, extends 뒤에는 단 하나의 부모 클래스만이 와야 함.
//	ex) 잘못된 예: public class 자식 클래스 extends 부모클래스1 부모클래스2{} <--- 안됨. extends뒤에 부모클래스 2개를 붙임
}
