package ch06.sec10.exam02;

public class Television {
	static String company = "My Company";
	static String model = "LCD";
	static String info;
	
	static {
		info = company + "-" + model;
	}
//	정적 블록 - 복잡한 초기화 작업이 필요하면, 정적 블록을 이용해야함.
//	정적 블록은 메모리로 로딩될 때 자동으로 실행됨. 정적 블록이 클래스 내부에 여러개가 선언되어 있을 경우엔, 선언된 순서대로 시행.
//	위 코드에서 company와 model엔 선언할때 초기값을 주었고, info는 정적 블록에서 company와 model을 서로 연결하여 초기값으로 줌.
}
