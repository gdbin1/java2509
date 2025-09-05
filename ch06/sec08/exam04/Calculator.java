package ch06.sec08.exam04;

public class Calculator {

//	정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
//	직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
	
//	메소드 오버로딩은 메소드 이름은 같되 매개변수의 타입,개수,순서가 다른 메소드를 여러개 선언하는것을 말함.
//	위 코딩처럼 리턴타입(double) = 무관 / 메소드이름(areaRectangle) = 동일 / *타입 변수,  double(width) ,  double(width, height)* = 타입,개수,순서가 달라야 함 
//	메소드 오버로딩의 목적은 다양한 매개값을 처리하기 위해서임.
	
}
