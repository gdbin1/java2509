package ch14.sec03.exam01;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
//		Toolkit 객체 얻기
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
//			비프음 발생
			toolkit.beep();
//			0.5초간 일시 정지
			try {Thread.sleep(500);} catch (Exception e) {}
		}
		
		for ( int i = 0; i < 5; i++) {
			System.out.println("띵");
//			0.5초간 일시정지
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}
//	하나의 프로세스가 두 가지 이상의 작업을 처리할 수 있는 이유는 멀티 프로세스가 있기 때문임. 스레드:코드의 실행 흐름. ex)프로세스 내에 스레드가 두개 :-> 두개의 코드 실행 흐름이 생김.
//	멀티 프로세스가 프로그램 단위의 멀티 태스킹이라면, 멀티 스레드는 프로그램 내부에서의 멀티 태스킹이라고 볼 수 있음.
//	멀티 스레드 용도: 데이터를 분할해서 병렬로 처리하는 곳에서 사용 / 안드로이드 앱에서 네트워크 통신을 하기 위해서 사용 / 다수의 클라이언트 요청을 처리하는 서버를 개발할 때 사용.
//		----------*프로그램 개발에 있어서 멀티 스레드는 꼭 필요한 기능이라 반드시 이해하고 활용할 줄 알아야됨.*------------
	
//	모든 자바 프로그램은 메인스레드가 main() 메소드를 실행하면서 시작됨. 메인 스레드는 main() 메소드의 첫 코드부터 순차적으로 진행하고, main()메소드의 마지막 코드를 실행하거나, return문을 만나면 종료함.
	
//	멀티 스레드로 실행하는 프로그램을 개발하려면, 먼저 몇 개의 작업을 병렬로 실행할지 결정하고 각 작업별로 스레드를 생성해야 함. (큰 틀을 잡고 분리하는듯?)
//	자바 프로그램은 메읹 스레드가 반드시 존재해서, 메인 작업 이외에 추가적인 작업 수만큼 스레드를 생성하면 됨. 자바는 작업 스레드도 객체로 관리하기에, 클래스가 필요함.
//	Thread 클래스로 직접 객체를 생성해도 되지만, 하위 클래스를 만들어서도 생성이 가능.
//	java.lang 패키지에 있는 Thread 클래스로부터 작업 스레드 객체를 직접 생성하려면 Runnable 구현 객체를 매개값으로 갖는 생성자를 호출하면 됨. ex) Thread thread = new THreadd(Runnable target);
//	Runnable는 스레드가 작업을 실행할 때 사용하는 인터페이스임. 이 안에는 run()메소드가 정의되어있음. 그래서 구현 클래스는 run()을 재정의해서 스레드가 실행할 코드를 가지고 있어야 함.
//	Runnable 구현 클래스는 작업 내용을 정의한것이라, 스레드에게 전달해야함. ex) -> Runnable task = new Task(); --- Thread thread = new Thread(task);
//	명시적인 Runnable 구현 클래스를 작성하지 않고 Thread 생성자를 호출할 때 Runnable 익명 구현 객체를 매개값으로 사용할 수 있고, 오히려 이 방법이 더 많이 사용됨. 아래 예시
//	ex) Thread thread = new Thread( new Runnable() {@Override public void run() 스레드가 실행할 코드 }});
	
//	작업 스레드 객체가 생성되었다고, 바로 작업 스레드가 실행되지는 않고, 실행하려면 start()메소드를 호출해야함. -> ex) thread.start();
	
//	이 클래스의 코드는 메인 스레드가 동시에 두 가지 작업을 처리할 수 없음을 보여주는 예제임. 원래 목적은 0.5초 주기로 (띵)을 발생시키면서 동시에 프린팅까지 하는 작업이었찌만,
//	메인 스레드는 (띵)을 모두 발생한 다음에야 프린팅을 시작함.
	
//	원래의 목적대로 0.5초주기로 비프음을 발생시키며 동시에 프린팅을 하는 코딩은 ch14.sec03.exam02의 BeepPrintExample에 있음.

}
