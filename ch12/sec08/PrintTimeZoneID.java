package ch12.sec08;

import java.util.TimeZone;

public class PrintTimeZoneID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String id : availableIDs) {
			System.out.println(id);
		}
	}
//	아메리카/로스엔젤레스와 같은 시간대 ID는 TimeZone.getAvailableIDs() 메소드가 리턴하느 ㄴ값 중 하나를 쓰면 됨.
//	위 코드는 TimeZone.getAvailableIDs() 메소드가 리턴하는 시간대 ID를 모두 출력함.
}
