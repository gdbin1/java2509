package ch09.sec06.exam03;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Ok버튼 객체 생성
		Button btnOk = new Button();
		
//		Ok버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스 (로컬 클래스)
		class OkListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("Ok 버튼을 클릭했슴다.");
			}
		}
		
//		Ok 버튼 객체에 ClickListener 구현 객체 주입
		btnOk.setClickListener(new OkListener());
		
//		Ok 버튼 클릭하기
		btnOk.click();
//		--------------------------------------------------------------------------------
		
//		Cancel 버튼 객체 생성
		Button btnCancel = new Button();
		
//		Cancel 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스 (로컬 클래스)
		class CancelListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다.");
			}
		}
//		Cancel 버튼 객체에 ClcikListener 구현 객체 주입
		btnCancel.setClickListener(new CancelListener());
//		Cancel 버튼 클릭하기
		btnCancel.click();
	}
//	9라인에서 Ok버튼 겍채 생성 -> 11~17라인에서 구현클래스로 onClick()에 대한 메소드 구현 / -> 16~17라인에서 Ok버튼 객체에 위에서 구현한 ClickListener 구현 객체 주입
	
//	26라인에서 Cancel 객체 생성 -> 30~35에서 구현 ->  37라인에서 구현객체 주입
}
