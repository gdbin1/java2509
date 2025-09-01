package ch02.sec05;

public class BooleanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean stop = true;
//		case1
		if(stop) {
			System.out.println("중지합니다");
		}else {
			System.out.println("시작합니다");
		}
		
//	case2: 자바 삼합연산자
		String result = stop ? "중지합니다." : "시작합니다";
		System.out.println("---- 결과는 " + result);
		
		int x = 10;
		boolean result1 = (x== 20);
		boolean result2 = (x != 20);
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
	}

}
