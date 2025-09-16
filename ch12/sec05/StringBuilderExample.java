package ch12.sec05;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = new StringBuilder()
//				메소드 체이닝 패턴
//				"DEF를 문자열의 끝에 추가함
				.append("DEF")
//				문자열을 지정위치에 추가함. 0번째에 ABC추가
				.insert(0, "ABC")
//				시작위치:3  - 0123해서 D / 끝위치:4 
				.delete(3, 4)
				.toString();
		System.out.println(data);
	}
//	리턴타입				메소드(매개변수)								설명
//	StringBuilder		append(기본값 | 문자열)						문자열을 끝에 추가
//	StringBuilder		insert(위치, 기본값 | 문자열)				문자열을 지정 위치에 추가
//	StringBuilder		delete(시작 위치, 끝 위치)					문자열 일부를 삭제
//	StringBuilder		replace(시작위치, 끝위치, 문자열)				문자열 일부를 대체
//	String 				toString()								완성된 문자열을 리턴
	
//	String은 내부 문자열을 수정할 수 없음. 위 코드를보면 문자열을 변경한거처럼 보이지만, 'ABCDEF'라는 새로운 String 객체를 생성한거임.
//	문자열의 + 연산은 새로운 String 객체가 생성되고 이전 객체는 계속 버려지는것이라, 효율성이 좋진 못함. 잦은 문자열 변경 작업을 해야할땐 String보던 StringBuilder을 쓰는게 좋음.

	//	StringBuilder의 조작 메소드와 사용 코드는 위 주석과 코딩.
}
