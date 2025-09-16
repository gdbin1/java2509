package ch13.sec02.exam02;

//	타입 파라미터 <P>를 <Home>으로 대체
public class HomeAgency	implements Rentable<Home> {
//	리턴 타입이 반드시 Home이어야 함
	public Home rent() {
		return new Home();
	}
}
