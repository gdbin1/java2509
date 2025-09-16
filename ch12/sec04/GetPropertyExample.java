package ch12.sec04;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		운영체제와 사용자 정보 출력
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.name");
		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userHome);
		
//		전체 키와 값을 출력
		System.out.println("--------------------");
		System.out.println("key: value");
		System.out.println("--------------------");
		Properties props = System.getProperties();
		Set keys = props.keySet();
		
		for(Object objkey : keys) {
			String key = (String) objkey;
			String value = System.getProperty(key);
			System.out.printf("%-40s: %s\n", key , value);
		}
	}
//	운영체제 이름, 사용자 이름, <사용자 홈> 디렉토리를 따로 출력하고, 모든 시스템 프로퍼티의 속성 이름과 값을 출력하는 코드임.
}
