package ch12.sec08;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY: strWeek = "월"; break;
		case Calendar.TUESDAY: strWeek = "화"; break;
		case Calendar.WEDNESDAY: strWeek = "수"; break;
		case Calendar.THURSDAY: strWeek = "목"; break;
		case Calendar.FRIDAY: strWeek = "금"; break;
		case Calendar.SATURDAY: strWeek = "토"; break;
		default: strWeek = "일"; break;
		}
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(year + "년 ");
		System.out.println(month + "월 ");
		System.out.println(day + "일 ");
		System.out.print(strWeek + "요일 ");
		System.out.println(strAmPm + " ");
		System.out.print(hour + "시");
		System.out.print(minute + "분");
		System.out.println(second + "초");
	}
//	Calendar 클래스는 달력을 표현하는 추상 클래스임. 날짜와 시간을 계산하는 방법이 나라마다 달라서, 달력은 자식 클래스에서 구현하도록 되어 있음.
//	특별한 경우가 아니면, 직접 하위 클래스를 만들 필요는 없고 Calendar 클래스의 정적 메소드인 getInstance()메소드를 이용하면 컴퓨터에 설정되어있는 시간대를
//	기준으로 Calendar 하위 객체를 얻을 수 있음. Calendar가 제공하는 날짜와 시간에 대한 정보를 얻으려면 get()메소드를 이용.
//	get() 메소드의 매개값으로 Calendar에 정의된 상수를 주면 상수가 의미하는 값을 리턴함.
}
