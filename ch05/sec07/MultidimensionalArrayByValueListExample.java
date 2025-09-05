package ch05.sec07;

public class MultidimensionalArrayByValueListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] scores = {
				{80, 90, 96},
				{76, 88 }
		};
//		반의 수: 1차원 배열의 길이와 동일, 2개 출력
		System.out.println("1차원 배열 길이(반의 수): " + scores.length);
//		첫번 째 반의 학생 수: scores[0].length로 했기 때문에, 첫번째 배열에 있는 수를 출력. = 총 3개
		System.out.println("2차원 배열 길이 (첫 번째 반의 학생 수): " + scores[0].length);
//		위와 같은 뜻으로 총2개
		System.out.println("2차원 배열 길이 (두 번째 반의 학생 수): " + scores[1].length);
		
//		scores배열안에 있는 index숫자 0 안에있는 index숫자2 = 96 출력
		System.out.println("scores[0][2]: " + scores[0][2]);
//		같은 의미로 scores안에 index 1번째 , 그 안에 있는 index 1번째 = 88출력
		System.out.println("scores[1][1]: " + scores[1][1]);
		
//		scores변수의 첫번째 배열의 평균 구하는 코드
		int class1Sum = 0;
		for(int i = 0; i < scores[0].length; i++) {
			class1Sum += scores[0][i];
		}
		double class1Avg = (double) class1Sum / scores[0].length;
		System.out.println("첫 번째 반의 평균 점수: " + class1Avg);
		
		
//		위와 같은 코드, 2번째 반의 합과, 평균 구하기
		int class2Sum = 0;
		for(int i = 0; i < scores[1].length; i++) {
			class2Sum += scores[1][i];
		}
		double class2Avg = (double) class2Sum / scores[1].length;
		System.out.println("두 번째 반의 평균 점수: " + class2Avg);
		
		int totalStudent = 0;
		int totalSum = 0;
		for(int i = 0; i < scores.length; i++) {
			totalStudent += scores[i].length;
			for(int k = 0; k <scores[i].length; k++) {
				totalSum += scores[i][k];
			}
		}
		
//		같은논리로 전체 학생의 평균 구하기
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println("전체 학생의 평균 점수: " + totalAvg);
	}
//	배열 항목에 또다른 배열이 대입되는, 다차원 배열
	
}
