package ch14.sec07.exam01;

public class SafeStopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintThread printThread = new PrintThread();
		printThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
//		PrintThread를 종료하기 위해 stop 필드값 변경
		printThread.setStop(true);
	}
//	스레드를 안전하게 조욜하는 방법은 사용하던 리소스들을 정리하고 run()메소드를 빨리 종료하는 것임.
//	주로 조건 이용 방법과 interrupt() 메소드 이용 방법을 사용함.
	
//	이 패키지의 PrintThread클래스는 while문으로 반복 실행할 경우, 조건을 이용해서 run()메소드의 종료를 유도함. stop 필드 조건에 따라서 run() 메소드의 종료를 유도함.
	
//	위 코드의 try구문에서 3초동안 실행하고, 그 밑에 printThread.setStop에서 true로 변경함으로써 메소드 종료.
}
