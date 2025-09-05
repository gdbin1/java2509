package ch05.sec12;

import java.util.Calendar;

public class WeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Week 열거타입 변수 선언
		Week today = null;
		
//		Calendar 열기 / 아래 코드 Calendar.getInstance();를 치면 자동 임포트 들어옴
		Calendar cal = Calendar.getInstance();

//		오늘의 요일 얻기 (1~7)
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
//		숫자를 열거 상수로 변환해서 변수에 대입
		switch(week) {
		case 1: today = Week.SUNDAY;	break;		
		case 2: today = Week.MONDAY; 	break;
		case 3: today = Week.TUESDAY; 	break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY;  break;
		case 6: today = Week.FRIDAY; 	break;
		case 7: today = Week.SATURDAY; 	break;
		}
		
//		열거 타입 변수를 사용
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바를 공부합니다.");
		}
//	열거타입을 사용하기 위해서는 먼저 열거타입 이름으로 소스파일을 생성하고 한정된 값을 코드로 정의해야함.
//	이 class파일은 ch05.sec12에 있는 Week.java 파일명인 열거타입 파일을 씀
//	열거 타입은 참조 타입이므로 Week 변수에 null도 대입이 가능하다
//	열거 변수의 값이 특정 열거 상수인지 비교할 때는 ==와 != 연산자를 사용함 ex)Week 변수값이 SUNDAY인지 비교하는 코드 --> Week today = Week.SUNDAY; today == Week.SUNDAY;
	}
}
