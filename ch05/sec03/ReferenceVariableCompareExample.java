package ch05.sec03;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		배열 변수인 arr1 ~ arr3까지 생성
		int[] arr1;
		int[] arr2;
		int[] arr3;
		
//		arr1, arr2에 값을 저장해서 참조 변수로 만듬 
		arr1 = new int[] { 1, 2, 3 };
		arr2 = new int[] { 1, 2, 3 };
		arr3 = arr2;
		
		
//		두 배열 변수가 같은지, 같지 않은지 \\, != 연산으로 같은 배열을 참조하는지 결과를 보기위해 검사하는 코딩
		
//		값은 같지만, 서로 다른 배열을 참조하기 때문에 아래 결과는 false로 나옴
		System.out.println(arr1 == arr2);
		
//		arr2와 arr3은 같은 배열을 참조하기 떄문에 아래 결과는 true
		System.out.println(arr2 == arr3);
		
//		이렇게 출력하게되면 arr1에 있는 배열 자체의 값이 아니라, 메모리 주소가 출력되어서 [I@6e2c634b  이렇게 나옴
		System.out.println(arr1);
		
		
//		만약 arr1같은 배열 변수의 값을 보고싶다면 해당변수의 이름을 입력하고 []안에 몇번째 배열의 값을 보고싶은지 아래처럼 작성하면 됨
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr2[0]);
		
//		만약 배열 변수 내부의 숫자가 엄청 많은데, ex) 값이 1~100까지 있음 
//		그 내부의 값을 모두 확인하고싶을때, 하나하나 System.out.println(arr2[0]); 
//		이렇게 코드를 작성하면 무려 100개나 작성해야됨. 그렇기 때문에 한번에 확인하는 방법은
//		System.out.println(Arrays.toString(arr1)); 이렇게 작성하면 arr1 안에 있는 배열의 값을 모두 확인할 수 있음.
//		단, 	System.out.println(Arrays.toString(arr1));를 쓰려면 import java.util.Arrays; 이걸 임포트해야됨
	}

}
