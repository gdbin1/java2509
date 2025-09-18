package ch14.sec06.exam01;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
//	동기화 메소드 -------------------
	public synchronized void setMemory1(int memory) {
//		메모리 값 저장
		this.memory = memory;
		try {
//			2초간 일시 정지
			Thread.sleep(2000);
		} catch(InterruptedException e) {}
//		메모리값 읽기
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
	
	
	public void setMemory2(int memory) {
//		동기화 블록 ------------------------------------
		synchronized(this) {
//			메모리값 저장
			this.memory = memory;
			try {
//				2초간 일시정지
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
//			메모리값 읽기
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		}
	}
//	스레드 동기화 - 멀티 스레드는 하나의 객체를 공유해서 작업 가능함. 이 경우, 다른 스레드에 의해 객체 내부 데이터가 쉽게 변경될 수 있기 때문에 의도완 다른 결과가 나올 수 있음.
//	동기화 메소드를 선언하는 방법은 synchronized 키워드를 붙이면 됨. synchronized 키워드는 인스턴스와 정적 메소드 어디든 붙일 수 있음.
//	스레드 동기화 메소드를 실행하는 즉시 객체는 잠금이 일어나고, 메소드 실행이 끝나면 잠금이 풀림.
	
//	위 코드는 setMemory1()을 동기화 메소드로, setMemory2()를 동기화 블록을 포함하는 메소드로 선언함. 고로 setMemory1과 setMemory2는 하나의 스레드만 실행 가능한 메소드가 됨.
}
