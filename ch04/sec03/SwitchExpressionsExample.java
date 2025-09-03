package ch04.sec03;

public class SwitchExpressionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'B';
		
		switch(grade) {
		case 'A', 'a' -> {
			System.out.println("우수 회원입니다.");
		}
		case 'B', 'b' -> {
			System.out.println("일반 회원입니다.");
		}
		default -> {
			System.out.println("손님입니다.");
		}
		}
		
		
//		중괄호 안에 실행문이 하나만 있을 경우에는 중괄호 생략 가능.
//		위 코딩을 생략해서 아래 코딩처럼 간단하게 적을 수 있음.
		switch(grade) {
		case 'A', 'a' -> System.out.println("우수 회원입니다.");
		case 'B', 'b' -> System.out.println("일반 회원입니다.");
		default -> System.out.println("손님입니다.");
		}
	}

}
