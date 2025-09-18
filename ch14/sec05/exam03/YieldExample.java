package ch14.sec05.exam03;

public class YieldExample {

	public static void main(String[] args) {
		WorkThread workThreadA = new WorkThread("workThreadA");
		WorkThread workThreadB = new WorkThread("workThreadB");
		workThreadA.start();
		workThreadB.start();
		
		try {Thread.sleep(5000);} catch (InterruptedException e) {}
		workThreadA.work = false;

		try {Thread.sleep(10000);} catch (InterruptedException e) {}
		workThreadA.work = true;
	}
//	스레드가 처리하는 작업은 반복적인 실행을 위해 for문이나 while문을 포함하는 경우가 많은데, 가끔 무의미한 반복을 하는 경우가 있을때는 다른 스레드에게 실행을 양보하고, 자신은 실행 대기 상태로
//	가는것이 프로그램 성능에 도움이 됨. 이런 기능을 위해 Thread는 yield() 메소드를 제공함. yield()를 호출한 스레드는 실행 대기 상태로 돌아가고, 다른 스레드가 실행 상태가 됨.
	
//	위 코드는 처음5초 동안은 ThreadA와 ThreadB가 번갈아가며 실행하다가 5초 뒤에 메인 스레드가 ThreadA의 work필드를 false로 변경함으로써 ThreadA가 yield()메소드를 호출함.
//	따라서 ThreadB가 더 많은 실행 기회를 얻게됨, 그리고 10초 뒤에 ThreadA의 work필드를 true로 변경해 다시 A와 B가 번갈아가며 실행되는데
//	한번 결과보고 실행 안시키는걸 추천. 저자가 멈추는방법을 안알려줘서 실행 결과가 안멈춤 짜증남 껏다켜야됨
}
