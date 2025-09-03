package ch04.sec02;

public class IfDiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()* 6) + 1;
		
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
			
		} else if(num==2) {
			System.out.println("2번이 나왔습니다.");
			
		} else if(num==3) {
			System.out.println("3번이 나왔습니다.");
			
		} else if(num==4) {
			System.out.println("4번이 나왔다");
			
		} else if(num==5) {
			System.out.println("5번요");
			
		} else {
			System.out.println("6나옴");
		}
	}
//	int num = (int)(Math.random()* 6) + 1   <---이 문장에 대한 해석
//	Math.random() 메소드는 0.0<= ~ <1.0 사이의 double 타입 난수를 리턴함. 즉 double 타입으로 0 ~ 0.9를 리턴함
//	여기서 각 변에 6을 곱하면 -> (Math.random()* 6) Math.random()에서 최대인 0.9를뽑아와도 * 6을해서 결과는 0.54
//	그리고 각 변을 int타입으로 강제 변환하면 즉 (Math.random()* 6)이 뽑아오는 숫자는 0,1,2,3,4,5
//	그렇기때문에 마지막으로 각 변에 1을 더하면 -> (int)(Math.random()* 6) + 1 = 뽑아오는 숫자는 1씩 더해서 1,2,3,4,5,6
//	이렇게 주사위 만들기 가능 이걸 응용하는 버전은 예를들어 로또 번호를 추첨한다면
//	ex) int num = (int)(Math.random()* 45) + 1
}
