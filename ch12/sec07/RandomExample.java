package ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		선택번호
//		선택번호 6개가 저장될 배열 selectNumber 생성
		int[] selectNumber = new int[6];
//		선택번호를 얻기 위한 랜덤 객체 생성
		Random random = new Random(3);
		System.out.println("선택번호: ");
//		선택번호 6개를 얻어 배열에 저장
		for(int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.println(selectNumber[i] + " ");
		}
		System.out.println();
		
//		당첨번호
//		당첨번호 6개가 저장될 배열 winningNumber 생성
		int[] winningNumber = new int[6];
//		당첨번호를 얻기 위한 Random 객체 생성
		random = new Random(5);
		System.out.println("당첨번호: ");
//		당첨번호 6개를 얻어서 배열에 저장
		for(int i = 0; i < 6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.println(winningNumber[i] + " ");
		}
		System.out.println();
		
//		당첨번호
//		비교하기 전에 배열 항목을 정렬시킴 -- sort()
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
//		배열 항목 비교하기
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.println("당첨여부: ");
		if(result) {
			System.out.println("1등 당첨");
		} else {
			System.out.println("당첨되지 않았음");
		}
	}
//	random() 메소드는 0.0과 1.0사이의 double 타입 난수를 리턴함.
//	start부터 시작하는 n개의 정수 (start <= ~~ (start+n))중 하나의 정수를 얻기 위한 공식을 만드는 예시는 아래와 같음
//	ex) int num = (int)(Math.random() * n) + start;
}
