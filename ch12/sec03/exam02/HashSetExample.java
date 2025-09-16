package ch12.sec03.exam02;

//HashSet java.util 패키지에 있으므로 import 해야함.
import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		HashSet 컬렉션 생성
		HashSet  hashSet = new HashSet();
		
//		HashSet에 Student 객체 저장
		Student s1 = new Student(1, "홍길동");
		hashSet.add(s1);
		System.out.println("저장된 객채 수: " + hashSet.size());
		
//		HashSet에 Student 객체 저장
		Student s2 = new Student(1, "홍길동");
		hashSet.add(s2);
		System.out.println("저장된 객체 수: " + hashSet.size());
		
//		HashSet에 Student 객체 저장
		Student s3 = new Student(2, "홍길동");
		hashSet.add(s3);
		System.out.println("저장된 객체 수: " + hashSet.size());
	}
//	HashSet은 동등 객체를 중복 저장하지 않는 특징이 있음.
//	HashSet은 hashCode()와 equals() 메소드를 이용해서 동등 객체인진 판단함.
	
//	결과를 보면 동등한 객체는 저장하지 않은걸 확인할 수 있음. 그래서 저장된 객체 수가 1, 1, 2가 나옴

}
