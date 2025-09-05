package ch05.sec05;

public class SubStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}
//	문자열에서 특정 위치의 문자열을 잘라내어 가져오고 싶다면 substring() 메소드를 사용하면 된다.
//	위 코드에서 firstNum = ssn.substring(0,6)의 의미는 firstNum이라는 변수를 ssn의 변수에서 참조변수로 가져오는데,
//	substring(0,6)을 적었으므로, ssn 변수 값의 0번째에서부터 6번째까지 가져오는거다 (가져오고싶은 시작, 여기까지 가져올게) 라는 의미
//	ssn,substring(7)의 의미는 ssn변수의 값 7번째에서부터 끝까지 가져오겠다는거다
}
