package ch06.sec08.exam04;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		객체 생성
		Calculator myCalcu = new Calculator();
		
//		정사각형의 넓이 구하기
//		areaRectangle (double width) 실행
		double result1 = myCalcu.areaRectangle(10);
		
//		직사각형의 넓이 구하기
		double result2 = myCalcu.areaRectangle(10, 20);
		
		System.out.println("정사각형의 넓이=" + result1);
		System.out.println("직사각형 넓이=" + result2);
	}
//	메소드 오버로딩을 통해 메소드 이름은 같지만, 다른 매개값을 처리함
//	사용 방법 예시 :ex) 1.-  int calcu(int x , int y) { int result = x + y; return result};
//	위 1번 예시처럼 쓸시엔 메소드는 두개의 int 타입 매개값만 처리하고 double 타입 매개값은 처리 불가
	
//  만약 double 타입 값도 처리하고 싶다면 아래의 코드처럼 오버로딩 하면됨.
//	사용 방법 예시 :ex) 2.- double plus(double x, double y) {double result = x + y; return result;}
//	
}
