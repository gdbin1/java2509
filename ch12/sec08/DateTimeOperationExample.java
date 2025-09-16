package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		System.out.println("현재 시간: " + now.format(dtf));
		
		LocalDateTime result1 = now.plusYears(1);
		System.out.println("1년 덧셈: " + result1.format(dtf));
		
		LocalDateTime result2 = now.minusMonths(2);
		System.out.println("2월 뺼셈: " + result2.format(dtf));
		
		LocalDateTime result3 = now.plusDays(7);
		System.out.println("7일 덧셈: " + result3.format(dtf));
		
		
	}
//	Date와 Calendar는 날짜와 시간 정보를 얻기엔 충분하지만, 날짜와 시간을 조작할 수는 없음.
//	이땐 java.time 패키지의 LocalDateTime 클래스가 제공하는 메소드를 이용하면 매우 쉽게 날짜와 시간 조작 가능. 메소드는 이것이 자바다 3판2권 540pg.
//	위 코드는 현재 시간에서 년, 월, 일을 연산하는 방법임
}
