package ch12.sec04;

public class MeasureRunTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time1 = System.nanoTime();
		int sum = 0;
		for(int i = 1; i <= 1000000; i++) {
			sum += i;
		}
		long time2 = System.nanoTime();
		
		System.out.println("1~1000000까지의 합: " + sum);
		System.out.println("계산에 " + (time2-time1 + "나노초가 소요되었습니다."));
	}
//	System 클래스의 currentTimeMills()메소드와 nanoTime() 메소드는 1970년 1월 1일 0시부터 시작해서 현재까지 진행된 시간을 리턴함.
//	이 두 메소드는 프로그램 처리 시간을 측정하는데 주로 사용됨. 프로그램을 시작할떄 한번, 종료될때 한번 읽어서 그 차이를 구해서 프로그램 처리 시간을 알 수 있음.
//	위 코드는 for문을 이용해서 1~1000000까지의 합을 구하는데, 걸린 시간을 출력하는거임.
	
//	currentTimeMills() = 1/1000 초 단위로 진행된 시간을 리턴.
//	nanoTime() = 1/10의9제곱 초 단위로 진행된 시간을 리턴.
}
