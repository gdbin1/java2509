package ch12.sec04;

public class ErrExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int value = Integer.parseInt("1oo");
		}catch(NumberFormatException e) {
			System.err.println("[에러내용]");
			System.err.println(e.getMessage());
		}
	}
//	System 클래스
//		정적멤버									용도
//	필드	out								콘솔(모니터)에 출력
//		err								콘솔(모니터)에 출력
//		in									키보드 입력
//			---------------------------
//	메소드 exit(int status)					프로세스 종료
//	currentTimeMills()				현대 시간을 밀리초 단위의 long 값으로 리턴
//	nanoTime()						현재 시간을 나노초 단위의 long 값으로 리턴
//	getProperty()						운영체제와 사용자 정보 제공
//	getenv()							운영체제의 환경 변수 정보 제공
//	-----------------------------------------------------------
//	out필드를 이용하면 콘솔에 원하는 문자열을 출력 가능함.
//	err필드도 out필드와 동일한데, 차이점은 콘솔 종류에 따라 에러 내용이 빨간색으로 출력된다는 것임.
	
//	위 코드에서 System.err.println에 적은 내용을 System.out.println으로 바꾸면 콘솔에 검정색으로 출력/ 현재는 System.err.println으로 적어서 빨간색으로 출력됨.
}
