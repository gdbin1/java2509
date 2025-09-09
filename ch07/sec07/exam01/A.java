//package ch07.sec07.exam01;
//
//public class A {
//	
//}
//
//class B extends A {}
//
//class C extends A {}
//
//class D extends B {}
//
//class E extends C {}
//
//public class PromotionExample{
//	public static void main(String[] args) {
//		B b = new B();
//		C c = new C();
//		D d = new D();
//		E e = new E();
//		
////		자동타입변환 (상속 관계에 있음)
//		A a1 = b;
//		A a2 = c;
//		A a3 = d;
//		A a4 = e;
//		
//		B b1 = d;
//		C c1 = e;
//		
////		컴파일에러(상속 관계에 있지 않음)
////		B b3 = e;
////		C c2 = d;
//	}
//	//	자동 타입 변환은 이 조건에서 일어남. --> 부모타입 변수 = 자식타입 객체; <-- 자동 타입변환
//	//	자식은 부모의 특징과 기능을 상속받기에, 부모와 동일하게 취급됨.
////	ex) Animal클래스 (부모) Cat클래스(자식)
////	Cat cat = new Cat(); Animal animal = cat; / Animal animal = new Cat(); <-- 두가지 다 가능, 자동타입변환
////	그렇기 때문에 두 참조변수의 == 연산결과는 true가 나옴. cat == animal -- true 
//
//}
