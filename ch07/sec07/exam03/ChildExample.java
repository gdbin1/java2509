package ch07.sec07.exam03;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		객체 생성 및 자동 타입 변환
		Parent parent = new Child();
		
//		Parent 타입으로 필드와 메소드 사용
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
//		불가능---------------
//		parent.field2 = "data2";
//		parent.method3();
		
//		강제 타입 변환
		Child child = (Child)parent;
		
//		Child 타입으로 필드와 메소드 사용
		child.field2 = "data2";
		child.method3();
	}
//	자식 타입은 부모 타입으로 자동 변환되지만, 반대로 부모 타입은 자식 타입으로 자동 변환되지 않음.
//	대신 위처럼 강제 타입변환을 할수있음. Child child = (Child)parent;
//	단, 자식 객체가 부모 타입으로 자동 변환된 후 다시 자식타입으로 변환할 때 강제 타입 변환을 사용할수있음.-> 1. Parent parent = new Child(); --> 2.  Child child = (Child)parent;
//	자식 객체가 부모 타입으로 자동 변환하면 부모 타입에 선언된 필드와 메소드만 사용 가능하다는 제약 사항이 따름.
//	이때, 자식 타입에 선언된 필드와 메소드를 꼭 사용해야 될 때 강제 타입 변환을 해서 다시 자식 타입으로 변환 해야 하는거임.
}
