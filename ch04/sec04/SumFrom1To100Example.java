package ch04.sec04;

public class SumFrom1To100Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i;
		
		for(i = 1; i <= 100; i++) {
			sum +=i;
		}
		System.out.println("1~" + (i - 1) + " 합 : " + sum);
	}
//	여기서 sum은 합계 변수기때문에 1~100까지 더한 값의 총합인 5050을 출력하고,
//	i가 100으로 출력되는 이유는 i가 100보다 작거나 같다 까지 돌리고, 값을 출력하라고 했기 때문에, i는 101까지 돌아가고, 101은 100보다 크기 때문에 출력은 안하고
//	i는 101에서 멈춤 그래서 i - 1을해서 100으로 출력됨 여기서 i - 1을 안하고 그냥 (i)라고 적으면 101이라고 나옴. 대충 내 예상임 아마 맞을듯?
}
