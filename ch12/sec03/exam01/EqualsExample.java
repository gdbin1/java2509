package ch12.sec03.exam01;

public class EqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
//		매개값이 Member타입 동일하고, id도 동일하기떄문에 true
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj는 동등하지 않습니다.");
		}
		
//		매개값이 Member 타입으로 동일하지만, id가 다르기 때문에 false
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3은 동등합니다.");
		} else {
			System.out.println("obj1과 obj3은 동등하지 않습니다.");
		}
	}
}
