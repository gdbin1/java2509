package ch04.sec04;

public class FloatCounterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(float x = 0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println(x);
		}
	}
//	for문을 작성할떄 주의점은, 부동 소수점을 쓰는 float타입을 쓰면 불편하다 / double도 마찬가지일듯?
}
