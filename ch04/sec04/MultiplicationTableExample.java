package ch04.sec04;

public class MultiplicationTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int m = 2; m <= 9; m++) {
			System.out.println("*** " + m + "단 ***");
//			중첩된 for문
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + " X " + n + " = " + (m*n));
			}
		}
	}
//	for문은 또 다른 for 문을 내포할 수 있음. 이걸 중첩된 for문이라고 함
//	바깥 for문이 한번 실행될때, 중첩된 for문은 지정 횟수만큼 반복하고, 다시 바깥 for문으로 돌아감

//	위 코딩 설명 -> 바깥쪽 for문에서 2가 9보다 작거나 같을때까지 1씩 더해서 출력할거임
//	안쪽 for문에선 1이 9보다 작거나 같을때까지 1씩 더해서 출력할거임.
//	-> 고로 바깥쪽 for문의 m이 2일때, 중첩된 for문이 지정 횟수만큼 반복해서, 2 x 1 = 2 / 2 x 2 = 4 이런식으로 2 x (중첩 for문의 지정 횟수9) = 18까지 출력한다음
//	다시 바깥쪽 for문으로 넘어가서 바깥쪽 for문이 1증가해서 3이됨 또다시 3 X 1 = 3 / 3 X 2 = 6  --- -> 3 X (중첩 for문의 지정횟수9) = 27까지 한 뒤, 다시 밖으로 나가서
//	바깥쪽 for문의 1증가, 4 x 1 ------ 이렇게 반복해서, 바깥쪽 for문의 지정횟수인 9까지 도달하고, 중첩 for문의 9까지 도달했을때, 9 x 9 = 81까지 출력하게됨
}
