package ch05.sec06;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		배열 변수 선언과 배열 생성
//		int[]로 배열을 생성하면 항목은 모두 0으로 초기화됨
		int[] arr1 = new int[3];
//		배열 항목의 초기값 출력
		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i] + ", ");
		}
		System.out.println();
		
//		배열 항목의 값 변경
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
//		배열 항목의 변경 값 출력
		for(int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i] + ", ");
		}
		System.out.println("\n");
		
//		배열 변수 선언과 배열 생성
		double[] arr2 = new double[3];
//		배열 항목의 초기값 출력
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i] + ", ");
		}
		System.out.println();
//		배열 항목의 값 변경
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
//		배열 항목의 변경 값 출력
		for(int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i] + ", ");
		}
		System.out.println("\n");
		
//		배열 변수 선언과 배열 생성
//		String[]로 배열을 생성하면 항목은 모두 null로 초기화됨
		String[] arr3 = new String[3];
//		배열 항목의 초기값 출력
		for(int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i] + ", ");
		}
		System.out.println();
//		배열 항목의 값 변경
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
//		배열 항목의 변경값 출력
		for(int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i] + ", ");
		}
	}
	
//				데이터타입						초기값
//	기본 타입		byte[]						 0
//				char[]						'u\0000'
//			   short[]						 0
//				 int[]						 0
//				long[]						 0L
		
//			   float[]						0.0F
//			  double[]						0.0
//			 boolean[]						false
	
//	참조	타입	   클래스[]						null
//			 인터페이스[]						null
}
