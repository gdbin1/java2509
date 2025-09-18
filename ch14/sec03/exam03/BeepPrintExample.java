package ch14.sec03.exam03;

import java.awt.Toolkit;

public class BeepPrintExample {
//	메인 스레드가 하는 코드
	public static void main(String[] args) {
//		작업 스레드 실행
		Thread thread = new Thread() {
			@Override
			public void run() {
//				작업 스레드가 하는 코드
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i < 5; i++) {
					toolkit.beep();
					try {Thread.sleep(500);} catch(Exception e) {}
				}
			}
		};
//		작업 스레드 실행 thread.start();
		thread.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500);} catch(Exception e) {}
		}
	}
//	작업 스레드 객체를 생성하는 또 다른 방법은 Thread의 자식 객체로 만드는 것임. Thread 클래스를 상속한 다음 run() 메소드를 재정의해서 스레드가 실행할 코드를 작성하고 객체를 생성하면 됨.
}
