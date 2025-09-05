package ch05.sec05;

public class CharAtExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "9506241230123";
		char sex = ssn.charAt(6);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
			
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}
	}
//	원하는 문자 추출하기 문자열에서 특정 위치의 문자를 얻고 싶을 땐 charAt() 메소드를 사용.
//	charAt() 메소드는 매개값으로 주어진 인덱스의 문자를 리턴함. 여기서 인덱스란 0에서부터 문자열의 길이 -1까지임.
//	위 코드에서 chartAt(6)을 입력했기 때문에, 해당하는 숫자는 '1'이고, 때문에 "남자입니다."가 출력
//	단, 문자열의 길이를 셀 떄는 공백(띄어쓰기)도 포함이다
}
