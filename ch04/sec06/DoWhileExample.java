package ch04.sec06;

// Scanner 쓰려면 얘 임포트 해야됨
import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
//		Scanner 생성
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
//		키보드로부터 읽기
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
//		입력된 내용이  q가 아니라면 계속 반복
		} while ( ! inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
	}

}
