package ch12.sec05;

import java.util.Arrays;

public class BytesToStringExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String data = "자바";
		
//		String -> byte 배열( 기본: UTF-8 인코딩)
//		byte[] arr1 = data.getBytes("UTF-8");
		byte[] arr1 = data.getBytes();
		System.out.println("arr1" + Arrays.toString(arr1));
		
//		byte배열 -> String (기본: UTF-8 디코딩)
//		String str1 = new String(arr1, "UTF-8");
		String str1 = new String(arr1);
		System.out.println("str1: " + str1);
		
//		String -> byte  배열 (EUC-KR 인코딩)
		byte[] arr2 = data.getBytes("EUC-KR");
		System.out.println("arr2: " + Arrays.toString(arr2));
		
//		byte배열 -> String(EUC-KR 디코딩)
		String str2 = new String(arr2, "EUC-KR");
		System.out.println("str2: " + str2);
		
	}
//	String : 문자열을 저장하고 조작할 때 사용 / StringBuilder : 효율적인 문자열 조작 기능이 필요할 때 사용 / StringTokenizer : 구분자로 연결된 문자열을 분리할 때 사용.
//	String 클래스의 다양한 생성자를 이용해서 직접 객체 생성도 가능함.
//	ex) 네트워크 통신으로 얻은 byte 배열을 원래 문자열로 반환하는경우. 이땐 String 생성자 중 아래 두가지를 사용해 String 객체로 생성 가능.
//	String str = new String(byte[] bytes);
//	String str = new String(byte[] bytes, String charsetName);
	
}
