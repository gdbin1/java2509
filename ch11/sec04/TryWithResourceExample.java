package ch11.sec04;

public class TryWithResourceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(MyResource res = new MyResource("A")){
			String data = res.read1();
			int value = Integer.parseInt(data);
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}
		System.out.println();
		
		try(MyResource res = new MyResource("A")){
			String data = res.read2();
//			NumberFormatException 발생
			int value = Integer.parseInt(data);
		} catch (Exception e) {
			System.out.println("예외처리: " + e.getMessage());
		}
		System.out.println();
		
		MyResource res1 = new MyResource("A");
		MyResource res2 = new MyResource("B");
//		복수개의ㅏ 리소스를 사용해야 하면 아래처럼 try() 괄호 안에 세미콜론(;)으로 구분하면 됨.
		try (res1; res2) {
			String data1 = res1.read1();
			String data2 = res2.read1();
		} catch (Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}
	}
	
}
