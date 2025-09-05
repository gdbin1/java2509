package ch06.sec08.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Calculator 객체 생성
		Calculator myCalc = new Calculator();
		
//		리턴값이 없는 powerOn() 메소드 호출
		myCalc.powerOn();
		
//		plus 메소드 호출 시 5와 6을 매개값으로 제공하고, 덧셈 결과를 리턴받아 result1 변수에 대입
		int result1 = myCalc.plus(5,6);
		System.out.println("result1: " + result1);
		
		int x = 10;
		int y = 4;
//		divide() 메소드 호출 시 변수 x와 y의 값을 매개값으로 제공하고,
//		나눗셈 결과를 리턴받아 result2 변수에 대입
		double result2 = myCalc.divide(x, y);
		System.out.println("result2: " + result2);
		
//		리턴값이 없는 powerOff() 메소드 호출
		myCalc.powerOff();
	}
//	class에서 메소드를 선언했다고해서, 바로 호출할 수 있는것은 아님. 메소드는 객체의 동작이라 객체가 존재하지 않으면 메소드를 호출할 수 없음.
//	객체에선 단순히 메소드명으로 호출하면 되지만, 외부 객체에서는 참조 변수와 (.) 연산자를 이용해서 호출.
//	또한 메소드가 매개변수를 가지고 있을 때는 호출할 때 매개변수의 타입과 수에 맞게 매개값을 제공해야함.
	
//	*메소드가 리턴값이 있을 경우엔 대입 연산자를 사용해서 리턴값을 변수에 저장할 수 있음.이떄 변수 타입은 메소드의 리턴 타입과 동일하거나 자동 타입 변환될 수 있어야 함.*
}
