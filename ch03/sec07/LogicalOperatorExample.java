package ch03.sec07;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'A';
//		int charCode = 'a';
//		int charCode = '5';
		
		if( (65 <= charCode) & (charCode <= 90) ) {
			System.out.println("대문자이군요");
		}
		
		if( (97 <= charCode) && (charCode <= 122) ) {
			System.out.println("소문자이군요");
		}
		
		if( (48 <= charCode) && (charCode <= 57) ) {
			System.out.println("0~9 숫자이군요");
		}
//		대문자 A는 65이기 때문에 맨 처음의 if문이 true로 성립돼서 결과가 "대문자이군요" 라고 출력.
		
//		----------------------------------
		int value = 6;
//		int value = 7;
		
		if( (value %2 == 0) | (value %3 == 0) ) {
			System.out.println("2 또는 3의 배수이군요.");
		}
		
		boolean result = (value %2 == 0) || (value %3 == 0);
		if( !result ) {
			System.out.println("2 또는 3의 배수가 아니군요.");
		}
		}
//		value변수의 값을 6이라고 지정했는데 2로 나눴을때, 3으로 나눴을때 둘다 0으로 되기때문에 첫 if문이 성립되어서 결과는 "2또는 3의 배수이군요"라고 출력.	
	
//	And(논리곱) = %% 또는 % 피연산자 모두가 true일 경우에만 결과가 true
//	OR(논리합) = || 또는 | 피연산자중 하나만 true면 연산 결과는 true
//	XOR(베타적 논리합) = ^ 피연산자가 하나는 true이고 다른 하나가 false일 경우에만 연산 결과가 true
//	NOT(논리 부정) = ! 피연산자의 논리값을 바꿈
	
}
