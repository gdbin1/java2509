package ch12.sec03.exam02;

public class HashCodeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		
		
//		해시코드가 동일한지 검사
		if(s1.hashCode() == s2.hashCode()) {
//			데이터가 동일한지 검사
			if(s1.equals(s2)) {
				System.out.println("동등 객체입니다.");
			} else {
				System.out.println("데이터가 다르므로 동등 객체가 아닙니다.");
			}
		} else {
			System.out.println("해시코드가 다르므로 동등 객체가 아닙니다.");
		}
	}
//	객체 해시코드 : 객체를 식별하는 정수.  / Object의 hashcode() 메소드는 객체의 메모리 번지를 이용해서, 해시코드를 생성하기 때문에
//	객체마다 다른 정수값을 리턴함. hashCode() 메소드의 용도는 equals() 메소드와 비슷한데, 두 객체가 동등한지를 비교할 때 주로 사용.
//	자바는 두 객체가 동등한지 비교할 때 hashCode()와 equals() 메소드를 같이 사용하는 경우가 많음.
//	일단 hashCode()가 리턴하는 정수값이 같은지 확인하고 , -> 그다음 equals() 메소드가 true를 리턴하는지를 확인해서 동등 객체임을 판단함.
}
