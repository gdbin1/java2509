package ch05.sec05;

public class SplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String board = "1, 자바 학습,참조 타입 String을 학습합니다.,홍길동";
				
		
//		문자열 분리
		String[] tokens = board.split(",");
		
//		인덱스별로 읽기
		System.out.println("번호: " + tokens[0]);
		System.out.println("번호: " + tokens[1]);
		System.out.println("번호: " + tokens[2]);
		System.out.println("번호: " + tokens[3]);
		System.out.println();
		
//		for 문을 이용한 읽기
		for(int i = 0; i <tokens.length; i++) {
			System.out.println(tokens[i]);
		}
	}
// 	문자열이 구분자를 사용해서, 여러 문자열로 구성되어 있을 때, 따로 분리해서 얻고 싶다면 split() 메소드를 사용
//	위 코드는 문자열의 구분자가 ,(콤마)로 구분되어 있어서 결과처럼 ,별로 출력됨
}
