package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
//		while 문의 조건식을 위한 변수 선언 
		boolean run = true;
		int speed = 0;
		
//		메뉴 생성
		while(run) {
			System.out.println("----------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("-----------------");
			System.out.println("선택: ");
			
//		얘가 키보드에서 입력한 내용을 읽음
			String strNum = scanner.nextLine();
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재 속도 = " + speed);
				
			} else if(strNum.equals("2")) {
				speed--;
				System.out.println("현재 속도 = " + speed);
				
			} else if(strNum.equals("3")) {
//		while문의 조건식을 false로 만듬
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
