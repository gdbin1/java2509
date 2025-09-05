package ch05.sec10;

public class AdvancedForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		배열 변수 선언과 배열 생성
		int[] scores = {95, 71, 84, 93, 87};
//		배열 항목 전체 합 구하기
		int sum = 0;
//		여기서 2.  score는 타입변수  :  1. scores는 배열
		for (int score : scores) {
//		아래 코드가 3. 실행문
			sum = sum + score;
		}
//		맨 아래 적은 순서대로 for문을 실행, 즉 1. (배열) scores의 87까지 총 5번을 실행한 뒤, 다음 배열이 없어서 for문을 빠져나옴
		System.out.println("점수 총합 = " + sum);
		
//		배열 항목 전체 평균 구하기
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);
	}
//	배열에서 for문을 사용할 경우 for(2.타입변수 , 1.배열) { 3.실행문}
//	이렇게 되는데, 1.배열에서 가져올 항목이 존재할 경우에 ->  2.타입 변수로 이동 -> 3. 실행문으로 이동한다.
//	그리고 3. 실행문에서 가져올 항목이 있을 경우엔 다시 위 순서를 반복하고
//	3. 실행문에서 가져올 항목이 없을 경우에 즉, 1. 배열이 모두 끝났을때 for문을 빠져나간다.
													
}
