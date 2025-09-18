package ch14.sec05.exam01;

import java.awt.Toolkit;

public class SleepExample {

	public static void main(String[] args) {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 10; i++) {
			toolkit.beep();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {}
		}
	}
//	스레드 객체를 생성 (New)하고, start() 메소드를 호출하면 곧바로 스레드가 실행되는것이 아니라, 실행대기상태 (Runnable)가 됨.
//	실행 스레드는 run() 메소드를 모두 실행하기 전에 스케줄링에 의해 다시 실행 대기 상태로 돌아갈 수 있음. 그리고 다른 스레드가 실행 상태가 됨.
//	이렇게 스레드는 실행 대기 상태와 실행 상태를 번갈아 가면서 자신의 run() 메소드를 조금씩 실행하고, 시랳ㅇ 상태에서 run()메소드가 종료되면 더 이상 실행할 코드가 없기 때문에 스레드의 실행이 멈춤.
//	스레드의 상태, 메솓, 설명은 이것이 자바다3탄 2권 605pg 기재.
	
//	실행중인 스레드를 일정시간 멈추게 하고싶을땐 sleep() 사용 <-- 이 메소드의 단위는 1/1000 밀리세컨드 단위로 시간을 주면 됨. ex) sleep(1000) = 1초
}
