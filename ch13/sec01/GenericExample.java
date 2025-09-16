package ch13.sec01;

public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Box<String> box1 = new Box<String>();
//		빈 <> 괄호를 적어도 되는 이유는 앞에 적은 <String>를보고 자바가 자동으로 String으로 인식해서 가능함. 이 기능은 자바7부터 도입됨.
		Box<String> box1 = new Box<>();
		box1.contetnt = "안녕하세요";
//		강제 타입 변환이 필요 없이 "안녕하세요"를 바로 얻을 수 있음
		String str = box1.contetnt;
		System.out.println(str);
		
//		Box<Integer> box2 = new Box<Integer>();
//		빈 <> 괄호를 적어도 되는 이유는 앞에 적은 <Integer>를보고 자바가 자동으로 Integer로 인식해서 가능함. 이 기능은 자바7부터 도입됨.
		Box<Integer> box2 = new Box<>();
		box2.contetnt = 100;
//		강제 타입 변환이 필요없이 100을 바로 얻을 수 있음.
		int value = box2.contetnt;
		System.out.println(value);
	}
//	제네릭은 주로 클래스 안에 다양한 내용물을 저장해야할 때 사용하는듯.
//	제네릭이란 결정되지 앟ㄴ은 타입을 파라미터로 처리하고 실제 사용할때 파라미터를 구체적은 타입으로 대체시키는 기능.
//	ch13.sec01 패키지의 Box 클래스에서는 public class Box<T> <-- <T>로 타입 파라미터를 정의함. 이 <T>의 자리에는 어떤걸 써도 상관이없음. EX) <Z> <X> <A> <ZZZ> <XXX> 모두 가능.
//	하지만 자바에서는 일반적으로 이와 같은 관례를 사용함. <E> : Element(컬렉션에서 많이 사용) / <K> : Key / <N> : Number / <T> : Type / <V> : Value
//	<S>, <U>, <V> ...~~ : 여러 타입 파라미터가 필요할 때 ex): Map<K, V>
	
//	* 제네릭 타입 파라미터를 사용할 때, 하나의 박스안에 여러가지의 타입을 넣을 수는 없음.
//	위처럼 String이나 Integer로 한가지의 타입을 대입했을때는, 원하는 결과값음 출력 가능하지만.
//	ex) Box<String, Integer, double>box1 = new Box<>("나비", 2, 3.5); 이런식으로 제네릭 파라미터에 복수의 타입을 대입 시킬수는 없음
}
