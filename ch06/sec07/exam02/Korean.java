package ch06.sec07.exam02;

public class Korean {
	
//	 필드 선언
	String nation = "대한민국";
	String name;
	String ssn;
	
//	생성자 선언
	public Korean(String n, String s) {
//		name과 ssn 초기화
		name = n;
		ssn = s;
	}
//	객체마다 동일한 값을 갖고있으면, 필드 선언시 초기값을 대입하는게 좋고, 객체마다 다른 값을 가져야하면, 생성자에서 필드를 초기화 하는 것이 좋다.
	
//	위 코드는 매개변수 이름으로 각각 n과 s를 사용했지만, 매개변수의 이름이 너무 짧으면 가독성이 좋지 않기 때문에 가능하면 초기화시킬 필드명과 동일한 이름을 사용하는게 좋음.
	
//	가독성이 좋게 초기화하는거에 대한 설명은 ch06.sec07.exam03 패키지의 Korean 클래스 참조
}
