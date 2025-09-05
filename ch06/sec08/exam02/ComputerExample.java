package ch06.sec08.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Computer 객체 생성
		Computer myCom = new Computer();
		
//		sum() 메소드 호출 시 매개값 1, 2, 3을 제공하고 합산 결과를 return받아 result1 변수에 대입
		int result1 = myCom.sum(1, 2, 3);
		System.out.println("result1 : " + result1);
		
//		sum() 메소드 호출 시 매개값 1, 2, 3, 4, 5를 제공하고 합산 결과를 리턴받아 result2에 대입
		int result2 = myCom.sum(1, 2, 3, 4, 5);
		System.out.println("result2 : " + result2);
		
//		sum() 메소드 호출 시 [배열]을 제공하고 합산 결과를 return받아 result3 변수에 대입
		int[] values = {1, 2, 3, 4, 5};
		int result3 = myCom.sum(values);
		System.out.println("result3 : " + result3);
		
//		sum()메소드 호출 시 [배열]을 제공하고, 합산 결과를 리턴받아 result4 변수에 대입
		int result4 = myCom.sum(new int[] { 1, 2, 3, 4, 5});
		System.out.println("result4 : " + result4);
	}
//	이렇게 매개값을 마음대로 줄 수 있는 이유는 Computer 클래스에 적은 메소드가 가변길이 매개변수를 갖고있기 떄문.
//	가변길이 매개변수는 메소드 호출 시 매개값을 쉼표로 구분하고, 개수와 상관없이 제공이 가능함.
//	매개값들은 자동으로 배열 항목으로 변환되어 메소드에서 사용됨. 그래서 메소드 호출 시 직접 배열을 매개값으로 제공해도 됨.
}
