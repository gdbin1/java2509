package ch05.sec09;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		길이가 3인 배열을 만듬
		int[] oldIntArray = { 1, 2, 3 };
		
//		길이가 5인 배열을 새로 생성함
		int[] newIntArray = new int[5];

//		배열 항목을 복사함
		for(int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
//		배열 항목을 출력함
		for(int i = 0; i < newIntArray.length; i++) {
			System.out.println(newIntArray[i] + ", ");
		}
	}
//	1,2,3,0,0 이 결과로 나오는 이유는 길이가 5인 배열을 새로 만들었고, 여기다가 길이가3인 배열인 oldIntArray의 1,2,3값을 넣었는데
//	뒤에 2자리가 비기 때문에 0,0 즉 int의 초기값인 0이 출력되는듯?
}
