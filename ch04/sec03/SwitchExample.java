package ch04.sec03;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*6) + 1;
		
		switch(num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번나옴");
			break;
		case 5:
			System.out.println("5번나옴");
			break;
		case 6:
			System.out.println("6번나옴");
			break;
		}
	}
//	if 문은 조건식의 결과가 true,false밖에 없어서 경우의 수가 많아질수록 else if를 반복적으로 추가해야돼서
//	코드가 길어지고 복잡해짐, 하지만 switch문은 변수의 값에 따라 실행문이 결정되기 때문에
//	같은 기능의 if문보다 간단한 코드로 작성 가능

//	num에서 주사위숫자를 랜덤하게 뽑아와서, case로 가서 실행문을 실행시킴.
//	만약 변수와 동일한 값인 case가 없으면 default로 가서 실행문을 실행시킴
//	default가 필요 없다면 생략 가능
	
	
}
