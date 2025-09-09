package ch07.sec04.exam02;

public class SupersonicAirplane extends Airplane{
	
//	상수 선언
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
//	상태 필드 선언
	public int flyMode = NORMAL;
	
//	메소드 재정의
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}else {
//			Airplane객체의 fly()메소드 호출
			super.fly();
		}
	}
//	super.fly()로 fly()메소드를 오버라이딩 함.
	
//	그렇기때문에 SupersonicAirplaneExample 클래스에서 sa.fly()를 했을시엔, "일반 비행합니다."가 출력되고,
//	이 클래스에서 super.fly()로 오버라이딩해서, 초음속 비행 모드일때는 오버라이딩된 이 클래스의 fly()를 사용하면됨,
//	그에대한 결과로 sa.flyMode = SupersonicAirplane.SUPERSONIC;라고 했을땐 "초음속 비행합니다."가 출력됨.
//	
}
