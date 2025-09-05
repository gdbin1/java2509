package ch05.sec06;

public class ArrayLengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		배열 변수 선언과 배열 대입
		int[] scores = {84, 90, 96};
		
//		배열 항목의 총합 구하기
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		
//		배열 항목의 평균 구하기
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
	}
//		배열 길이 = 배열변수.length; <--이렇게 작성
//		intArray.length = 10; <-- 이렇게 작성하면 컴파일 에러 발생
}
