package ch05.sec04;

public class GarbageObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		hobby변수의 값을 여행이라고 정함
		String hobby = "여행";
//		hobby를 다시 null이라고 지정해림
		hobby = null;
		
		
//		king1의 변수 값을 자동차라고 정함
		String kind1 = "자동차";
		
//		kind2의 변수값을 kind1에서 가져와서 똑같이 "자동차"로 만듬
		String kind2 = kind1;
		
//		kind1의 변수를 null이라고 해버림
		kind1 = null;
		
		System.out.println("kind2: " + kind2);
		System.out.println("kind1: " + kind1);
		System.out.println("hobby: " + hobby);
		
//		위에 적은 설명 때문에 결과는 hobby와 kind1의 값은 null로 출력되고,
//		kind1에서 가져온 kind2의 결과는 "자동차"라고 출력
	}

}
