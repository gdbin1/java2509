package ch04.sec05;

public class PrintFrom1To10Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while ( i <= 10) {
			System.out.println(i + " ");
			i++;
		}
	}
//	while(1.조건식)   {			  
//	2. 실행문
//	}
	
//	while은 1. 조건식을 평가함, 평과 결과가 참이면, 2. 실행문을 실행함.
//	2. 실행문이 모두 실행되면 조건식으로 되돌아가서 1. 조건식을 다시 평가함.
//	다시 조건식이 참이면, 2 -> 1순서로 진행하고, 거짓이면 while문을 종료.
}
