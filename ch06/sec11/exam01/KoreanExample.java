package ch06.sec11.exam01;

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		객체 생성 시 주민등록번ㅂ호와 이름 전달
		Korean k1 = new Korean("123456-1234567", "김자바");
		
//		필드값 읽기
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
//		Final 필드는 값을 변경할 수 없음
//		k1.nation = "USA";
//		k1.ssn = "123-12-1234";
		
//		비 final 필드는 값 변경 가능
		k1.name = "김자바";
	}
//	이 코드의 결과에 대한 해석은, ch06.sec11.exam01에 있는 Korean클래스에서 nation의 초기값을 final로 "대한민국"이라고 지정했기 때문에, 값의 변경이 불가능하고
//	나머지 ssn과 name은 초기값을 지정하지 않았기에, 이 class에서 적은대로 출력이 가능하다.
}
