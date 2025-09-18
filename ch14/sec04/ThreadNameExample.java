package ch14.sec04;

public class ThreadNameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		이 코드를 실행하는 스레드 객체 참조 얻기
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName() + " 실행");
		
		for (int i = 0; i < 3; i++) {
			Thread threadA = new Thread() {
				@Override
				public void run() {
//					getName() 메소드는 Thread의 인스턴스 메소드로 스레드의 이름을 리턴
					System.out.println(getName() + "실행");
				}
			};
			threadA.start();
		}
		Thread chatThread = new Thread() {
			@Override
			public void run() {
				System.out.println(getName() + " 실행");
			}
		};
		chatThread.setName("chat-thread");
		
//		작업 스레드 이름 변경
		chatThread.start();
	}
//	스레드는 자신의 이름을 갖고있음. 메인 스레드는 'main'이라는 이름을 갖고있고, 작업 스레드는 자동적으로 'Thread-n'이라는 이름을 가짐.
//	작업 스레드의 이름을 지정해서 설정하고 싶다면, Thread클래스의 setName() 메소드를 사용하면 됨. -> ex) thread.setName("스레드 이름");
//	스레드 이름은 디버깅할 때 어떤 스레드가 작업을 하는지 조사할 목적으로 주로 사용됨.
//	현재 코드를 어떤 스레드가 실행하는지 확인하려면 정적 메소드인 currentThread()로 스레드 객체의 참조를 얻은다음 getName() 메소드로 이름을 출력해보면 됨.
	
//	출력된 결과를 보면 Thread-0~2까지 순서대로 나오지않고, 0, 2, 1 순서로 나올때도 있는데 이건 프로그램의 오류가 아니라, Thread의 특징임.
}
