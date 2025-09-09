package ch07.sec04.exam02;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}

//	메소드를 재정의하면, 부모 메소드는 숨겨지고 자식메소드만 사용되어서, 부모 메소드의 일부만 변경된다 하더라도 중복된 내용을 자식 메소드도 갖고 있어야 됨.
// 	ex)부모 메소드에서 100줄코드를 갖고있을경우, 자식메소드에서 1줄만 수정하더라도, 100줄의 코드를 자식메소드에서 다시 작성해야함.
//	이걸 간단하게 해결하는게 super 키워드와 dot(.) 키워드임.
//	super. 를 사용한 에제는 SupersonicAirplane 클래스에 있음.
//	sa.flyMode = SupersonicAirplane.SUPERSONIC;과 sa.flyMode = SupersonicAirplane.NORMAL;는 출력문이 아니라 모드를 바꾸는거임,
//	그래서 각각 그 아래에잇는 sa.fly()에서 초음속 비행합니다. / 일반 비행합니다. 를 출력하게 되는것이고,
//	첫 sa.fly()의 결과가 일반 비행합니다.로 출력 되는 이유는 SupersonicAirplane 클래스에서 sa.fly()의 기본값을 normal로,
//	public int flyMode = NORMAL;로 지정했기 때문임.
}
