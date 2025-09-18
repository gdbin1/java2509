package ch14.sec08;

public class DemonExample {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
//		AutoSaveThread를 데몬 스레드로 만듦
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		System.out.println("메인 스레드 종료");
	}
//	데몬 스레드는 주 스레드의 작업을 돕는 보조적인 역할을 수행하는 스레드임.
//	주 스레드가 종료되면 데몬 스레드도 자동으로 종료됨.
//	데몬 스레드를 적용한 예시로는 워드프로세서의 자동저장, 미디어플레이어의 동영상 및 음악재생, 가비지 컬렉터 등이 있다. 여기서 이 세가지가 종료되면 데몬 스레드도 같이 종료된다.
//	스레드를 데몬으로 만들기 위해선 setDaemon(true)를 호출하면 됨.
	
//	이 패키지의 두 클래스는 1초 주기로 save() 메소드를 호출하는 AutoSaveThread를 데몬 스레드로 실행시킴. 그리고 메인 스레드가 3초 후 종료되면 AutoSaveThread도 자동 종료됨.
}
