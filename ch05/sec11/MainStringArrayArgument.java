package ch05.sec11;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 2) {
			System.out.println("프로그램 입력값이 부족");
			System.exit(0);;
		}
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
//	main() 메소드의 String() 매개변수 용도 
//	sum을 실행할 때 몇개의 값이 입력되었는지 확인하려면 main()메소드에서 배열의 length 필드를 읽으면 됨. --> if(args.length != 2) {System.out.println("실행 시 두 개의 값이 필요합니다.")

//	이클립스에서 위 코드를 바로 실행할 시엔 "프로그램 입력값이 부족" 이라고 출력됨. 왜냐면 실행 시 입력값을 주지 않았기 떄문에 args는 길이 0인 String배열을 참조함
//	이클립스에서 입력값을 주고 실행하려면 아래 순서대로 진행
//	이클립스 상단 메뉴에서 [Run] - [Run Configurations]을 클릭하면 나오는 대화상자에서 1. Project입력칸에 본인이 정한 프로젝트 이름 입력
//	2. Main class 입력란에 본인이 정한 class , class가 패키지에 속해있다면 패키지.class 입력 -> ex) ch05.sec11.MainStringArrayArugument
//	3. [Arguments] 탭을 클릭하고 Program arguments 입력란에 10과 20을 입력하고 run버튼 클릭.
//	4. 결과를 확인하면 10 + 20 = 30이 나와있음.
}
