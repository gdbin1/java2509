package ch07.sec04.exam01;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원 면적: " + calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원 면적: " + computer.areaCircle(r));
	}
//	부모 클래스의 메소드가 특정 자식 클래스에 사용하기 적합하지 않을땐, 이런 메소드는 자식 클래스에서 재정의해서 사용해야한다. 이걸 메소드 오버라이딩이라고 부름.
//	메소드 오버라이딩은 상속된 메소드를 자식 클래스에서 재정의하는것을 말하고,
//	메소드가 오버라이딩되면, 해당 부모 메소드는 숨겨지고, 자식 메소드가 우선적으로 사용된다.
	
//	Calculator 클래스에서 원의 넓이를 구하는 areaCircle() 메소드를 갖고있지만, 원주율 파이가 정확하지않다.
//	떄문에 자식클래스인 Computer 클래스에서 오버라이딩해서 (Math.PI) 함수로 정확한 원의 넓이를 구한것이다.
	
//	오버라이딩을 할때 주의해야할 규칙.
//	- 부모 메소드의 선언부 (리턴타입, 메소드이름, 매개변수)와 동일해야 함.
//	- 접근 제한을 더 강하게 오버라이딩할 수 없음. (public -> private으로 변경 불가)
//	- 새로운 예외를 throws 할 수 없음. (예외는 10장에서 학습)
}
