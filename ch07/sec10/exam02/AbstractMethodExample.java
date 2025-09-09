package ch07.sec10.exam02;

public class AbstractMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.sound();

		Cat cat = new Cat();
		cat.sound();

//		매개변수의 다형성
		animalSound(new Dog());
		animalSound(new Cat());

	}

	public static void animalSound(Animal animal) {
		animal.sound();
	}
//	Animal 추상클래스에서 sound()메소드를 선언했고,
//	Dog 클래스, Cat 클래스 (자식클래스)에서 오버라이딩하여 sound()메소드를 재정의했다.
	
//	위 코드에서 	animalSound(new Dog()); 이 두 코드의 Dog와 Cat은 Animal animal로 자동 타입변환된거고, 
//				animalSound(new Cat()); 그 아래 animal.sount()에서 재정의된 메소드를 호출한거다.
}
