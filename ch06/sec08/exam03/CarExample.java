package ch06.sec08.exam03;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Car 객체 생성
		Car myCar = new Car();
		
//		리턴값이 없는 setGas() 메소드 호출
		myCar.setGas(5);
		
//		isLeftGas() 메소드를 호출해서 받은 리턴값이 true일 경우 if 블록 실행
		if(myCar.isLeftGas()) {
			System.out.println("출발합니다.");
//			리턴값이 없는 run()메소드 호출
			myCar.run();
		}
		System.out.println("gas를 주입하세요.");
	}
//	gas에 5를 대입해서, Car class의 첫번째 if문에 두번째 실행문이 출력되는데, 이 이유는 일단 car의 값이 5와 같지 않기떄문에, 두번째 실행문이 출력되고,
//	원래는 if else문을 쓰지만, else가 없이 if문 안에서 두번째가 실행되는 이유는, if문 안에 있는 return문이 있기 때문임.
//	return문은 메소드의 실행을 강제 종료하기 때문임.if문의 첫번째 실행문이 거짓이고, 그 다음에 return문이 있기 때문에, return문이 이 첫번째 실행문을 강제종료하고, 그 다음에있는 "gas가 있습니다."가 출력됨.
//	두번째는 while if문이기때문에, 아는대로 출력. 가스에 5를 넣었기때문에, 달립니다와 잔량이 나오고, 이 잔량은 0보다 클때까지 돌리고, -1씩 누적해서 결과를 출력하게 -=를 함 
}
