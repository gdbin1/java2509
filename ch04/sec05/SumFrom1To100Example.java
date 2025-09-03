package ch04.sec05;

public class SumFrom1To100Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		int i = 1;
		
		while(i <= 100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}
//	for문에서 생각한거랑 같음, sum이 5050이 나오는 이유는, 1~100까지의 수를 더한 값을 출력해서 5050이 나온거고,
//	i의 값이 (i-1)해서 100이 나온 이유는, 조건문에 i가 100보다 작거나 같을때까지 돌리라고 했으니, i는 101까지 돌아감
//	그래서 (i-1)을해서 100이나오고, for문이랑 똑같이 (i)를 적는다면 101이 나옴
}
