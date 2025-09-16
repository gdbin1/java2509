package ch12.sec10;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치함");
		} else {
			System.out.println("정규식과 일치하지 않음.");
		}
		
		
		
		regExp = "\\W+@\\W+\\.\\W+(\\.\\W+)?";
		data = "angel@mycompany.com";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치함.");
		} else {
			System.out.println("정규식과 일치하지 않음.");
		}
	}
//	정규 표현식 클래스 - 문자열이 정해져 있는 형식으로 구성되어 있는지 검증할때 사용. EX)이메일이나 전화번호
//	자바의 정규 표현식 작성 방법은 이것이 자바다 3탄 2권 547pg 기재.
//	정규 표현식을 실무에서 사용하는 예시는 유효성 검사(비밀번호 형식 검사) / 데이터 추출 / 문자열 치환등이 잇음
	
//	Pattern 클래스는 정규 표현식으로 문자열을 검증하는 matches() 메소드를 제공함.
//	위 코드에서  첫번째 매개값은 정규 표현식이고, 두번째 매개값은 검증할 문자열임. 검증한 후의 결과는 boolean 타입으로 리턴됨.
} 
