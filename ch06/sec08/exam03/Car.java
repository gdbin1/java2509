package ch06.sec08.exam03;

public class Car {

//	필드 선언
	int gas;
	
//	리턴값이 없는 메소드로 매개값을 받아서 gas 필드값을 변경
	void setGas(int gas) {
		this.gas = gas;
	}

//	리턴값이 boolean인 메소드로 gas 필드값이 0이면 false를, 0이 아니면 true를 리턴
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
//			false를 리턴하고 메소드 종료
			return false; 
		}
		System.out.println("gas가 있습니다.");
//		true를 리턴하고 메소드 종료
		return true;
	}
	
//	리턴값이 없는 메소드로 gas 필드값이 0이면 return 문으로 메소드를 종료
	void run() {
		while (true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas 잔량:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량:" + gas + ")");
//				메소드 종료
				return;
			}
		}
//		return문은 메소드의 실행을 강제 종료하고 호출한 곳으로 돌아간다는 의미임.
//		메소드 선언에 리턴 타입이 있을 경우에는 return 문 뒤에 리턴값을 추가로 지정해야함.
//		return문 이후에 실행문을 작성하면 컴파일 에러 발생 -> 이유: return문 이후의 실행문은 결고 실행되지 않기 때문
//		ex) 잘못된 예시 : return문 뒤에 실행문이 있음. 이럴 경우에 에러 발생
//		int plus(int x, int y) {
//		int result = x + y;
//		return result;
//		System.out.println(result);
//	}
	}
}
