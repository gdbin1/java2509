package ch04.sec07;

public class BreakOutterExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Outter: for(char upper= 'A'; upper <= 'Z'; upper++) {
			
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break Outter;
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}
//	반복문이 중첩되어 있을때 break문은 가장 가까운 반복문만 종료하고, 바깥쪽 반복문은 종료시키지 않음.
//	중첩된 반복문에서 바깥쪽 반복문까지 종료시키려면 바깥쪽 반복문에 이름(지정한 label)을 붙이고 break (이름)을 사용하면 됨.
//	바깥쪽 for문은 A~Z까지 반복하고, 중첩된 for문은 a~z까지 반복됨
//	중첩된 for문에서 g를 입력했을때에, 전체 for문을 중지시키기 위해 바깥쪽 for문에 break를 걸음 그렇기때문에 A-g에서 멈춤.
}
