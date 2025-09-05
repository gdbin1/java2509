package ch05.sec08;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
//		숫자비교 strArray[0]이랑 strArray[1]이랑 같니? -> 같이때문에 true
		System.out.println( strArray[0] == strArray[1]);
//		strArray[0]이랑 strArray[2]랑 같니? -> strArray2는 new String으로 참조 배열을 만들어서 번지가 달라졌기 떄문에 false
		System.out.println( strArray[0] == strArray[2]);
//		.equals = 문자비교 , strArray[0]이랑 strArray[2]랑 같니? -> 문자가 "Java"로 동일하기때문에 true
		System.out.println( strArray[0].equals(strArray[2]));
	}

}
