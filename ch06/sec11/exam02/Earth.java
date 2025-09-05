package ch06.sec11.exam02;

public class Earth {
//	상수 선언 및 초기화
	static final double EARTH_RADIUS = 6400;
	
//	상수 선언
	static final double EARTH_SURFACE_AREA;
	
//  정적 블록에서 상수 초기화
	
//	Math.PI는 자바에서 제공하는 상수임
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
//	상수는 불변의 수기 때문에, 객체마다 저장할 필요가 없고, 여러 개의 값을 가져도 안되기 때문에 static이면서, final인 특성을 가져야함.
//	따라서 상수를 선언하는건 ex) --> static final 타입 상수 [= 초기값]   -----이렇게 해야함
	
//	초기값은 선언시에 주는게 일반적이지만, 복잡한 초기화가 필요할 땐, 정적 블록에서 초기화도 가능.
//	ex) --> static final 타입상수;   static{상수 = 초기값;} 이렇게 가능
	
//	상수 이름은 모두 대문자로 작성해야함. 만약 서로 다른 단어가 혼합된 이름일시엔 (_) 언더바로 연결.
//	상수는 정적 필드이므로 클래스로 접근해서 읽을 수 있음.
}
