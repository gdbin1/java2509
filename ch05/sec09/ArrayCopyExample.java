package ch05.sec09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		길이 3인 배열
		String[] oldStrArray = {"java", "array", "copy"};
		
//		길이 5인 배열을 새로 생성
		String[] newStrArray = new String[5];
		
//		배열 항목 복사
//		이 코드에대한 설명과 순서는 맨 아래 주석
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
//		배열 항목 출력
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.println(newStrArray[i] + ", ");
		}
	}
//	원본 배열이 arr1이고 새 배열이 arr2일 경우 arr1의 모든 항목을 arr2에 복사하려면 system.arraycopy()메소드를 사용하면 된다.
	
	
//	System.arraycopy(원본 배열, 원본배열 복사 시작 인덱스, 새배열, 새배열 붙여넣기 시작 인덱스, 복사 항목 수); 의 순서임
//	System.arraycopy(Object src, int srcPos, Object dest, 0, arr1.length);
}
