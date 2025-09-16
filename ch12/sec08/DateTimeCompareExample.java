package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		
		LocalDateTime startDateTime = LocalDateTime.of(2021, 1,1,0,0,0);
		System.out.println("시작일: " + startDateTime.format(dtf));
		
		LocalDateTime endDateTime = LocalDateTime.of(2021, 12, 31,0,0,0);
		System.out.println("종료일: " + endDateTime.format(dtf));
		
		if(startDateTime.isBefore(endDateTime)) {
			System.out.println("진행 중입니다.");
		} else if (startDateTime.isEqual(endDateTime)) {
			System.out.println("종료합니다.");
		} else if (startDateTime.isAfter(endDateTime)) {
			System.out.println("종료했습니다.");
		}
		long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
		long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
		long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
		System.out.println("남은 햬: " + remainYear);
		System.out.println("남은 월: " + remainMonth);
		System.out.println("남은 일: " + remainDay);
		System.out.println("남은 시간: " + remainHour);
		System.out.println("남은 분: " + remainMinute);
		System.out.println("남은 초: " + remainSecond);
	}
//	LocalDateTime 클래스는 날짜와 시간을 비교할 수 있는 메소드도 제공함.
//	boolean - ifAfter(other) -  이후 날짜인지?
//			- ifBefore(other) - 이전 날짜인지?
//	 		- ifEqual(other) - 동일 날짜인지?
//	long	- until (other,unit) - 주어진 단위 (unit) 차이를 리턴
	
//	비교를 위해 특정 날짜와 시간으로 LocalDateTime 객체를 얻는 방법은 아래 예시와 같음. year부터 second까지 매개값을 모두 int 타입 값으로 제공하면 됨.
//	ex) LocalDateTime target = LocalDateTime.of(year, month, dayOfMonth, hour, minute, second); 
}
