package ch04.sec03;

public class SwitchValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String grade = "B";
		
//		자바 11 이전 문법
		int score1 = 0;
		switch(grade) {
		case "A":
			score1 = 100;
			break;
		case "B":
			int result = 100 - 20;
			score1 = result;
			break;
		default:
			score1 = 60;
		}
		System.out.println("score1: " + score1);
		
//		자바 13부터 문법
		int score2 = switch(grade) {
		case "A" -> 100;
		case "B" -> {
			int result = 100 - 20;
			yield result;
		}
		default -> 60;
		};
		System.out.println("score2: " + score2);
	}
//	grade에 따라 스위치된 점수를 score 변수에 대입하는 예제. 자바 13부터 더 간단해짐
//	근데 교재에 자바 21부터 switch문의 표현식을 작성하는 방법이 강화되었다하는데 21장에서 설명해준다함
//	20장까지 모두 학습한 후에 보길 권장한다함. 이유가 있겠지 뭐
}
