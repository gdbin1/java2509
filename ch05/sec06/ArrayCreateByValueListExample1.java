package ch05.sec06;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		배열 변수 선언과 배열 생성
//		배열 변수 생성 방법: 타입[] 변수; , 타입 변수[]
		String[] season = { "Spring", "Summer", "Fall", "Winter" };
		
//		배열의 항목값 읽기
		System.out.println("seson[0] : " + season[0]);
		System.out.println("seson[1] : " + season[1]);
		System.out.println("seson[2] : " + season[2]);
		System.out.println("seson[3] : " + season[3]);
		
//		인덱스 1번 항목의 값 변경
//		배열 변수로 지정한 변수[] = "바꾸고싶은 배열"
		season[1] = "여름";
		System.out.println("season[1] : " + season[1]);
		System.out.println();
		
//		배열 변수 선언과 배열 생성
		int[] scores = { 83, 90, 27 };
		
//		scores변수의 총합과 평균 구하기
		int sum = 0;
//		scores변수 안에있는 배열인 83,90,27은 총3개 -> index값으로는 0,1,2기때문에 i < 3; i++을 실행
//		그럼 i는 0~2까지 1씩증가하면서 변함
//		그렇기 때문에 sum에는 83,90,27의 합이 += 모두 더해짐
		for(int i = 0; i < 3; i++) {
			sum += scores[i];
		}
//		여기서 scores 배열변수에 있는 값의 총합인 sum을 출력
		System.out.println("총합 :" + sum);
		
//		평균을 구하기 위해 모두 더한 sum을 3으로 나눠서 출력, 만약 소수점 제외하고 보고싶으면 double대신 int를 작성하면 됨.
		double avg = (double) sum / 3;
		System.out.println("평군 : " + avg);
		
	}

}
