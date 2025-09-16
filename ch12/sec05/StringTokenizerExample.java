package ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = "홍길동&이수홍,박연수";
		String[] arr = data1.split("&|,");
		for(String token : arr) {
			System.out.println(token);
		}
		System.out.println();
		
		
		
		String data2 = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(data2, "/");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
//	StringTokenizer 클래스 - 문자열이 구분자(delimeter)로 연결되어 있을 경우, 구분자를 기준으로 문자열을 분리하려면 String의 split()메소드를 이용하거나,
//	java.util 패키지의 StringTokenizer 클래스를 이용할 수 있음. split은 정규 표현식으로 구분하고, StringTokenizer은 문자로 구분한다는 차이점이 있음.
//	위 코딩의 첫번째 문단처럼 &, ,(쉼표) , -(하이픈) 으로 구분된 (여러 종류의 구분자가 있음) 사람 이름을 뽑아낼 때는 정규 표현식으로 분리하는 split() 메소드를 사용하고
// 	두번째 문단처럼 여러 종류가 아닌 한 종류의 구분자만 있으면, StringTokenizer를 사용할 수 있음.
//	StringTokenizer()은 객체를 생성할 때 첫번째 매개값으로 전체 문자열을 주고, 두번째 매개값으로 구분자를 주면 됨. 예시는 위 코드임
//	StringTokenizer 객체가 생성되면 다음 메소드들을 이용해서 분리된 문자열을 얻을 수 있음.
//	리턴타입			메소드(매개변수)					설명
//	int				countTokens()				분리할 수 있는 문자열의 총 수
//	boolean 		hasMoreTokens()				남아 있는 문자열이 있는지 여부
//	String			nextToken()					문자열을 하나씩 가져옴
//	---------------------------------
//	nextToken()메소드는 분리된 문자열을 하나씩 가져오고, 더 이상 가져올 문자열이 없다면 예외처리를 발생시키기 때문에
//	nextToken()을 사용하기전에, hasMoreTokens()메소드로 가져올 문자열이 있는지 먼저 조사하는게 효율적임.
}
