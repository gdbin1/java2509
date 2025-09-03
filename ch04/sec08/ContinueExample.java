package ch04.sec08;

public class ContinueExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		i가 10보다 작거나 같을때까지 1씩 증가시킬거야
		for(int i = 1; i <= 10; i++) {
//			만약 i를 2로 나눴을때 0이 아니라면,
			if(i % 2 != 0) {
//			즉 - 홀수일 경우에 다시 위쪽 for문으로 올라가서 실행해를 조건에 달성할때까지 반복
				continue;
			}
			System.out.print(i + " ");
		}
	}

}
