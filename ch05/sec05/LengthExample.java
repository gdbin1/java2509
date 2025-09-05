package ch05.sec05;

public class LengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "9506241230123";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주믄등록번호 자릿수가 맞습니다.");
		} else {
			System.out.println("주민등록번호 자릿수가 틀립니다.");
		}
	}
//	문자열에서 문자의 갯수 즉, 길이를 알고싶다면. length()메소드를 사용함.
//	문자열 길이는 공백을 포함해서 센다.
//	즉 위 코드에서 ssn.length() ssn의 길이를 알려달라고 코딩을하고,if (length == 13) 길이가 13이니?의 if문이 참이기 때문에 자릿수가 맞다고 출력.
}
