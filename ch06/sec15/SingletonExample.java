package ch06.sec15;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Singleton obj1 = new Singleton();  --- 컴파일 에러
//		Singleton obj2 = new Singleton();  --- 컴파일 에러
		
//		정적 메소드를 호출해서 싱글톤 객체를 얻음
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
//		동일한 객체를 참조하는지 확인
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}
//	애플리케이션 전체에서 단 한개의 객체만 생성해서 사용하고 싶을땐, 싱글톤 패턴을 적용할수있음.
//	싱글톤 패턴의 핵심은 생성자를 private 접근 제한해 외부에서 new 연산자로 생성자를 호출할 수 없도록 막음.
//	생성자를 호출 못하니, 외부에서 마음대로 객체 생성이 불가능해짐 . 대신 싱글톤 패턴이 제공하는 정적 메소드를 통해 간접적으로 객체를 얻을 수 있음.
}
