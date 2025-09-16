package ch12.sec12;

import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		for(Method method : declaredMethods) {
//			PrintAnnotation 얻기
			PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
			
//			설정 정보를 이용해서 선 출력
			printLine(printAnnotation);
			
//			메소드 호출
			method.invoke(new Service());
			
//			설정 정보를 이용해서 선 출력
			printLine(printAnnotation);
		}
	}
	
	public static void printLine(PrintAnnotation printAnnotation) {
		if(printAnnotation != null) {
//			number 속성값 얻기
			int number = printAnnotation.number();
			for(int i = 0; i < number; i++) {
//				value 속성값 얻기
				String value = printAnnotation.value();
				System.out.print(value);
			}
			System.out.println();
		}
	}
//	코드에서 @로 작성되는 요소를 어노테이션(Annotation)이라고 함. 어노테이션은 클래스 또는 인터페이스를 컴파일하거나 실행할때 어떻게 처리해야 할것인지 알려주는 설정 정보임.
//	어노테이션의 용도 3가지 - 1. 컴파일시 사용하는 정보 전달 2. 빌드 툴이 코드를 자동으로 생성할 때 사용하는 정보 전달 3. 실행시 특정 기능을 처리할때 사용하는 정보 전달.
//	대표적인 예로 여태 가장 많이 사용한 @Override가있음.
}
