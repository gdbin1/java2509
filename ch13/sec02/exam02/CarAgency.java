package ch13.sec02.exam02;

//	타입 파라미터 <P> 를 <Car>로 대체
public class CarAgency implements Rentable<Car>{
	@Override
//	리턴 타입이 반드시 Car여야함
	public Car rent() {
		return new Car();
	}
}
