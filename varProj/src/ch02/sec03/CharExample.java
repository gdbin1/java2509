package ch02.sec03;

public class CharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char = 한글자
		
		char c1 = 'A';
//		숫자 65라고 적었지만, 65라는 코드값인 A를 출력
		char c2 = 65;
		
//		44032라고 숫자를 적었지만, 44032는 컴퓨터에서 '가'라는 값이라 '가'라고 출력
		char c3 = '가';
		char c4 = 44032;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}

}
