package ch06.sec14;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		객체 생성
		Car myCar = new Car();
		
//		잘못된 속도 변경
//		ch06.sec14패키지 내부에 Car클래스의 주석으로 설명한거처럼. 음수로 값을 넣었기때문에, 0으로 출력됨.
		myCar.setSpeed(-50);
		System.out.println("현재 속도: " + myCar.getSpeed());
		
//		올바른 속도 변경
		myCar.setSpeed(60);
		System.out.println("현재 속도: " + myCar.getSpeed());
		
//		멈춤
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 속도: " + myCar.getSpeed());
	}

}
