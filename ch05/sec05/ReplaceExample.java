package ch05.sec05;

public class ReplaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}
//	문자열에서 특정 문자열을 다른 문자열로 대체하고 싶을땐, replace() 메소드를 사용하면 된다.
//	replace()메소드는 기존 문자열은 그대로 두고, 대체한 새로운 문자열을 리턴함.
//	String newStr = oldStr   <-- newStr을 oldStr의 참조 변수로 만듬
//	String newStr = oldStr.replace("자바", "JAVA")  <-- oldStr.replace에 있는 "자바"라는 문자열을 "JAVA"로 변경
	
	
//	(바꾸고싶은 문자열에 해당하는 변수명).replace("변경하고싶은 문자열","변경할 문자열")
}
