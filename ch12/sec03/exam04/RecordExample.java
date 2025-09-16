package ch12.sec03.exam04;

public class RecordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m = new Member("winter" , "눈송이", 25);
		
//		Getter 메소드 호출
		System.out.println(m.id());
		System.out.println(m.name());
		System.out.println(m.age());
		
		
		System.out.println(m.toString());
		System.out.println();
		
		Member m1 = new Member("winter", "눈송이", 25);
		Member m2 = new Member("winter", "눈송이", 25);
		System.out.println("m1.hashCode(): " + m1.hashCode());
		System.out.println("m2.hashCode(): " + m2.hashCode());
		
//		동등 비교
//		m1과 m2의 해시코드가 매개값이 Member타입으로 동일하고, id, name, age가 모두 같기때문에 즉 - 다 똑같아서 true로 출력됨.
		System.out.println("m1.equals(m2): " + m1.equals(m2));
	}
	
//	데이터 전달을 위한 DTO(Date Transfer Object)를 작성할 때 반복적으로 사용되는 코드를 줄이기 위해 자바14부터 레코드가 도입됨.
//	Member 클래스에서 record 클래스로 만들었기 때문에, 레코드 소스를 컴파일하면 변수의 타입과 이름을 이용해서, private final 필드가 자동 생성되고, 생성자 및 Getter 메소드가 자동으로 추가됨.
//	그리고 hashCode(), equals(), toString() 메소드를 재정의한 코드도 자동으로 추가됨. 위 코드가 레코드로 선언된 Member를 이용하는 방법임.
}
