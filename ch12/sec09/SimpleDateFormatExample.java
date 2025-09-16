package ch12.sec09;

import java.util.Date;
import java.text.SimpleDateFormat;

public class SimpleDateFormatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println( sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("오늘은 E요일");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("오늘은 D번째 날");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("이달의 d번째 날");
		System.out.println(sdf.format(now));
	}
//	SimpleDateFormat은 날짜를 형식화된 문자열로 변환하는 기능을 제공함. 원하는 형식으로 표현하기 위해 아래와 같은 패턴을 사용함.
//	y : 년 | M : 월 | d : 일 | D : 월 구분이 없는 일(1~365) | E : 요일 | a : 오전/오후 | w : 년의 몇번쨰 주 | W : 월의 몇 번째 주|
//	H : 시(0~23) | h : 시 (1~12) | K : 시(0~11) | k : 시(1~24) | m : 분 | s : 초 | S : 밀리세컨드(1/1000초)
	
}
