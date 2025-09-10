package ch11.sec05;

public class ThrowsExample2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		findClass();
	}
		public static void findClass() throws ClassNotFoundException{
			Class.forName("java.lang.String2");
		}
		
//		나열해야 할 예외 클래스가 많을 경우엔 throws Exception 또는 throws Throwable 만으로 모든 예외를 간단히 떠넘길 수 있음.
		
//		main()메소드에서도 throws 키워드를 사용해서 예외 떠넘기기가 가능한데, 결국 JVM이 최종적으로 예외 처리를 하게 됨.
//		JVM은 예외의 내용을 콘솔에 출력하는 것으로 예외 처리를 함.
}
