package ch14.sec03.exam02;

import java.awt.Toolkit;

public class BeepPrintExample {

//	메인 스레드가 실행하는 코드
	public static void main(String[] args) {
//		작업 스레드 생성
		Thread thread = new Thread(new Runnable() {
			@Override
		


	public void run() {
//				작업 스레드가 실행하는 코드
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i = 0; i < 5; i ++) {
				toolkit.beep();
				try {Thread.sleep(500);} catch(Exception e) {}
			}
		}
	});
//		작업 스레드 실행
		thread.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}
//	원래 목적대로 0.5초 주기로 비프음을 발생시키면서 동시에 프린팅응ㄹ 하고 싶다면 두 작업 중 하나를 작업 스레드에서 처리하면 됨.
//	위처럼 코딩할시, 프린팅은 메인 스레드가 담당하고, 비프음을 들려주는것은 작업 스레드가 담당함.
}


