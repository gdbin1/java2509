package ch12.sec09;

import java.text.DecimalFormat;

public class DecimalFormatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num = 1234567.89;
		
		DecimalFormat df;
		
//		정수 자리까지 표기
		df = new DecimalFormat("#, ###");
		System.out.println( df.format(num));
		
//		무조건 소수 첫째 자리까지 표기
		df = new DecimalFormat("#, ###.0");
		System.out.println(df.format(num));
	}

//	DecimalFormat은 숫자를 형식화된 문자열로 변환하는 기능을 제공함. 원하는 형식으로 표현하기위해 사용하는 패턴은 이것이 자바다 3판 2권 544pg 기재.
//	패턴 정보화 함꼐 DecimalFormat 객체를 생성하고 format() 메소드로 숫자를 제공하면 패턴에 따른 형식화된 문자열을 얻을 수 있음.
//	위 코드에서 사용한 #,###는 통화기호 -> | 1,234,568
}
