package ch07.sec11;

public class SealedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person();
		Employee e = new Employee();
		Manager m = new Manager();
		Director d = new Director();
		
		p.work();
		e.work();
		m.work();
		d.work();
}
//	final 클래스를 제외한 모든 클래스는 부모 클래스가 될 수 있지만, 자바15부턴 무분별한 자식 클래스 생성을 방지하기위해 봉인된 sealed 클래스가 도입됨.

//	Person의 자식 클래스는 Employee와 Manager만 가능하고, 그 외에는 자식 클래스가 될 수 없도록 Person을 봉인된 클래스로 선언함.
//	sealed 키워드를 쓰면, permits 키워드 뒤에 상속 가능한 자식 클래스를 지정해야함.
//	또한, permits로 자식 클래스를 지정한 Employee와 Manager은 final 또는 non-sealed 키워드로 선언하거나, sealed 키워드를 사용해서 또 다른 봉인 클래스로 선언해야 함.
//	final - 앞에서 배운거처럼 더이상 상속할 수 없다.  non-sealed - 봉인을 해제한다.
//	Employee 클래스는 final 키워드를 써서, 더이상 상속할 수 없고, Manager클래스는 non-sealed를 써서 자식 클래스를 만들 수 있다.->Director클래스가 자식클래스
}
