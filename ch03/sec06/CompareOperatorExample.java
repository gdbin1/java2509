package ch03.sec06;

public class CompareOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		
//		result4의 결과물이 true라고 출력되는 이유는 char1의 값은 'A'이고 char2의 값은 'B'인데
//		A는 컴퓨터에서 숫자로 65 B는 숫자로 66이기때문에 char < char2의 연산식이 참이기때문에 true로 출력
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);
		System.out.println("result4: " + result4);
		int num3 = 1;
		double num4 = 1.0;
		boolean result5 = (num3 == num4);
		System.out.println("result5 :" + result5);
		
//		result6의 결과값이 false라고 출력되는 이유는(0.1f == 0.1) -> 0.1f가 부동소수점 방식이기 때문에 0.1을 정확히 처리할 수가 없다
//		때문에 이에 대한 해결책은 0.1f == (float)0.1 -> 결과: true 이렇게 float 타입으로 강제변환 한 뒤에 계산하면 true라고 출력된다.
 		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result6 = (num5 == num6);
		boolean result7 = (num5 == (float)num6);
		System.out.println("result6: " + result6);
		System.out.println("result7: " + result7);
		
//		문자 열을 비교할 때는 동등(==,!=)연산자 대신 equals()와 !equals()를 사용한다.
		String str1 = "자바";
		String str2 = "Java";
//		str1이 str2랑 같니? (equals) = false
		boolean result8 = (str1.equals(str2));
//		str1이 str2와 같지 않니? (!equals) => true 
		boolean result9 = (! str1.equals(str2));
		System.out.println("result8: " + result8);
		System.out.println("result9: " + result9);
	}

}
