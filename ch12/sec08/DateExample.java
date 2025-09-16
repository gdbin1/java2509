package ch12.sec08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
	}
//	날짜와 시간 클래스 - Date : 날짜 정보를 전달하기 위해 사용 / Calender : 다양한 시간대별로 날짜와 시간을 얻을 떄 사용 / LocalDateTime : 날짜와 시간을 조작할 때 사용
//	Date()생성자는 컴퓨터의 현재 날짜를 읽어 Date 객체로 만듬. 현재 날짜를 문자열로 얻고 싶다면 toString() 메소드를 사용하지만, 영문으로 출력되어서
//	우리가 원하는 형식이 아님. 원하는 문자열로 얻고 싶다면 위 코드처럼 SimpleDateFormat()클래스와 함께 사용. 위 코드는 '년.월.일 시:분:초'형식으로 문자열을 얻음
//	
}
