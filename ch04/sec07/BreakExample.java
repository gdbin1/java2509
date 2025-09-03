package ch04.sec07;

public class BreakExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
//	주사위 번호 중 하나를 반복적으로 뽑는 대신, 숫자6이 나오면 종료됨
}
