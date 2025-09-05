package ch05.sec04;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		배열 변수 intArray에 null을 대입한 상태에서 배열 객체에 0에 10을 대입하는 코드는 오류를 발생시킴
//		이유는 intArray가 참조하는 배열 객체가 없으므로 10을 저장할 수 없기 떄문.
		int[] intArray = null;
//		intArray[0] = 10;
		
		
		
//		str변수에 null을 대입한 상태에서 문자열의 길이를 얻으려고 length()메소드를 호출하면 오류 발생.
//		이유는 얘또 str변수가 참조하는 String객체가 없어서 문자열의 길이를 구할 수 없기 때문임
		String str = null;
		System.out.println("총 문자 수: " + str.length());
	}
//	참조 타입 변수도 아직 번지를 저장하지 않고 있다는 뜻으로  null 값을 가질 수 있다.
//	null도 초기값으로 사용할 수 있기 때문에 null로 초기화된 참조 변수는 스택 영역에 생성된다.
//	null인 상태에서 객체의 데이터나 메소드를 사용할때, 오류가 발생한다. 자바에선 오류를 (예외)라고 부름

//	앞으로 결과에 오류 코드가 뜨는데, 그 중에 NullPointerException이 있으면,
//	오류가 발생한 곳에서 null인 상태의 참조 변수가 사용되고 있다고 알면 됨
//	해결하려면 참조 변수가 객체를 정확히 참조하도록 번지를 대입하면 됨

}
