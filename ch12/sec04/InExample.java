package ch12.sec04;

public class InExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		int speed = 0;
		int keyCode = 0;
		
		while(true) {
//			Enter 키를 읽지 않았을 경우에만 실행
//			키코드 13과 10은 윈도우에서 엔터를 의미
//			고로 13과 10이 아닐때 즉, 엔터키를 입력하지 않았을 때, 아래 if문을 실행
			if(keyCode != 13 && keyCode != 10) {
//				키코드가 49면, 자바에서 키 코드 49는 1 즉 1일눌렀을떄 speed에 ++
				if(keyCode == 49) {
					speed ++;
//				만약 키코드 50이면, 자바에서 키코드 50은 2, 즉 2를 눌렀을때 speed에 --
				} else if (keyCode == 50) {
					speed --;
//				만약 키코드가 51이면, 자바에서 키코드 51은 3, 즉 3을 눌렀을때 중지.
				} else if (keyCode == 51) {
					break;
				}
				System.out.println("--------------------");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("--------------------");
				System.out.println("현재 속도 =" + speed);
				System.out.println("선택: ");
			}
//			키를 하나씩 읽음
			keyCode = System.in.read();
		}
		System.out.println("프로그램 종료");
	}
	
//	int keyCode = System.in.read();
//	자바는 키보드로부터 입력된 키를 읽기 위해 System 클래스에서 in 필드를 제공함. 위처럼 in 필드를 이용해서 read()메소드를 호출하면 입력된 키의 코드값을 얻을 수 있음.
//	read() 메소드는 호출과 동시에 키 코드를 읽는게 아니라, enter (엔터)키를 누르기 전까지는 대기 상태이다가, enter(엔터)키를 누르면 입력했던 키드를 하나씩 읽기 시작함.
//	단 read()메소드는 IO Exception을 발생할 수 있는 코드이므로 예외 처리가 필요함.
	

}
