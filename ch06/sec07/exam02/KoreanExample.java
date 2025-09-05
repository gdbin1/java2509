package ch06.sec07.exam02;

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Korean 객체 생성
		Korean k1 = new Korean("박자바", "011225-1234567");
		
//		Korean 객체 데이터 읽기
		System.out.println("k1.nation : " + k1.nation);
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		System.out.println();
		
//		또 다른 Korean 객체 생성
		Korean k2 = new Korean("김자바", "930525-0654321");
		
//		또 다른 Korean 객체 데이터 읽기
		System.out.println("k2.nation : " + k2.nation);
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
	}
//	생성자의 매개값은 new 연산자로 생성자를 호출할 때 주어짐. k1과 k2가 차모하는 객체는 주어진 매개값으로, name과 ssn필드가 각각 초기화됨.
//	초기화 시키는건 Korean class에 있음
}
