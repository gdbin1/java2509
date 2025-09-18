package ch14.sec05.exam02;

public class JoinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
			sumThread.join();
		} catch (InterruptedException e) {}
		System.out.println("1~100 합: " + sumThread.getSum());
	} 
//	스레드는 다른 스레드와 독립적으로 실행되지만, 다른 스레드가 종료될 때까지 기다렸다가 실행을 해야할 떄도 있음.
//	ex)계산 스레드의 작업이 종료된 후 그 결과값을 받아 처리하는 경우. 이때 사용하는게 join()메소드임
	
//	위 코드는 SumThread가 계산 작업을 모두 마칠 때까지 메인 스레드가 일시 정지 상태에 있다가 SumThread가 최종 계산된 결과값을 산출하고
//	종료하면 메인 스레드가 결과값을 받아 출력하는 예제임.
}
