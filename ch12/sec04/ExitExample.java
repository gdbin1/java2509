package ch12.sec04;

public class ExitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
//			i값 출력
			System.out.println(i);
//			i가 5일때 System.out.println "프로세스 강제 종료" , 0을 결과에 출력하지만,
//			for문에서 i는 10보다 작을때까지 ++하라했기때문에 9까지 출력됨.
			if(i == 5) {
//				JVM 프로세스 종료
				System.out.println("프로세스 강제 종료");
				System.out.println(0);
			}
		}
	}
//	운영체제는 실행 중인 프로그램을 프로세스로 관리함. 자바 프로그램을 시작하면 JVM 프로세스가 생성되고, 이 프로세스가 main()메소드를 호출함.
//	프로세스를 강제 종료하고 싶다면 System.exid() 메소드를 사용함.
//	exit() 메소드는 int 매개값이 필요한데, 이 값을 종료 상태값이라고 함. 종료 상태값으로 어떤 값을 주더라도 프로세스는 종료되는데
//	정상 종료일 경우 0, 비정상 종료는 1 또는 -1로 주는것이 관례임.

}
