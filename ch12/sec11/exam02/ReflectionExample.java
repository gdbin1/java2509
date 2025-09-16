package ch12.sec11.exam02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.*;

public class ReflectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class clazz = Car.class;
		System.out.println("[생성자 정보]");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for(Constructor constructor : constructors) {
			System.out.println(constructor.getName() + "(");
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		System.out.println();
		
		System.out.println("[필드 정보]");
		Field[] fields = clazz.getDeclaredFields();	
		for(Field field : fields) {
			System.out.println(field.getType().getName() + " " + field.getName());
		}
		System.out.println();
		
		System.out.println("[메소드 정보]");
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println(method.getName() + "(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
	}
	private static void printParameters(Class[] parameters) {
		for (int i = 0; i < parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if( i < (parameters.length - 1)) {
				System.out.println(",");
			}
		}
	}
//	멤버 정보 얻기 - 타입 (클래스, 인터페이스)가 가지고 있는 멤버 정보는 다음 메소드를 통해 얻을 수 있음.
//	메소드											용도
//	Constructor[] getDeclaredConstructors()			생성자 정보 읽기
//	Field[] getDeclaredFields()						필드 정보 읽기
//	Method[] getDeclaredMethods()					메소드 정보 읽기
	
//	메소드 이름에서 알 수 있듯, 각각 Constructor 배열, Field 배열, Method 배열을 리턴함.
//	Constructor, Field, Method 클래스는 모두 java.lang.reflect 패키지에 있는데 각각 생성자, 필드, 메소드에 대한 선언부 정보를 제공함.
//	ch12.sec11.exam02의 클래스들은 Car 클래스에서 선언된 생성자, 필드, 메소드의 선언부 정보를 얻고 출력하는 예제임.
	
}
