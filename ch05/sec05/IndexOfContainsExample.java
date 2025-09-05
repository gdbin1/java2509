package ch05.sec05;

public class IndexOfContainsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String subject = "자바 프로그래밍";
		
//		indexOf("프로그래밍")을 적었기 떄문에, subject에 있는 "프로그래밍"을 찾아옴, 여기서 "프"는 0 1 2 3 순서니까 숫자 3임 그래서 location은 3이 출력됨
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
//		substring(location)으로 location에 있는 값을 가져와서 출력함 location이 3이기 때문에 substring(3)을 적더라도 결과는 같게 출력되고,
//		substring(2)를 적을시엔,공백 프로그래밍 -> substring(1)을 입력할 시엔, 바 프로그래밍 이런식으로 출력됨.
		String substring = subject.substring(location);
		System.out.println(substring);
		
//		location에서 "자바" 글자를 찾는데, 1과 같지 않으면 if문을 실행시키라함 값은0이기 때문에 if문이 참이라 실행돼서 "자바와 관련된 책이군요." 출력
		location = subject.indexOf("자바");
		if(location != 1) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
		
//		subject에 "자바"라는 값이 포함되어 있어서 true로 출력되기 때문에, if문이 실행돼서 "자바와 관련된 책이군요."가 출력됨
		boolean result = subject.contains("자바");
		if(result) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
	}
//	문자열 찾기 문자열에서 특정 문자열의 위치를 찾고자 할 때에는 indexOf()메소드를 사용함.

//	주어진 문자열이 단순히 포함되어 있는지만 조사하고 싶다면 contains() 메소드를 사용함. 
//	원하는 문자열이 포함되어 있으면, contains() 메소드는 true를 리턴하고, 아니면 false를 리턴함.
	
//	String subject = "자바 프로그래밍" 이라고 subject에 값을 넣음
	
//	int location = subject.indexOf("프로그래밍") location변수를 subject변수의 참조변수로 만듬
//
	
}
