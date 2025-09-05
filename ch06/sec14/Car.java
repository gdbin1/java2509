package ch06.sec14;

public class Car {

//	필드 선언
	private int speed;
	private boolean stop;
	
//	speed 필드의 Getter/Setter 선언
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
		} else {
			this.speed = speed;
		}
	}
//	stop 필드의 Getter/Setter 선언
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) this.speed = 0;
	}
//	객채의 필드(데이터)를 외부에서 마음대로 읽고 변경할 경우, 객체의 무결성이 깨질 수 있다. ex) 자동차의 속력은 음수가 될 수 없는데, 외부에서 음수로 변경하면 객체의 무결성이 깨진다.
//	ex) Car myCar = new Car(); myCar.speed = -100; <-- 이렇게 되면 객체의 무결성(결점이 없는 성질)이 깨지게 된다.
//	이런 문제점 때문에 객체지향 프로그래밍에선 직접적인 외부에서의 필드 접근을 막고, 메소드를 통해 필드 접근 하는것을 선호함.
//	이유는 메소드가 데이터를 검증하고, 유효한 값만 필드에 저장할 수 있기 때문. 이런 역할을 하는 메소드가 Setter임.
	
//	위 코드에서 speed가 private 접근 제한을 가져서 외부에서 접근하지 못하는데, speed 필드를 변경하기 위해선 위처럼 Setter인 setSpeed() 메소드를 사용.
//	setSpeed() 메소드는 외부에서 제공된 변경값(매개값)을 if문으로 검증하는데, 이때 음수일 경웅엔 0을 필드값으로 저장함.
	
//	외부에서 객체의 필드를 읽을때도 메소드가 필요할 때가 있다. 외부에서 객체의 필드를읽을때, 필드값이 객체 외부에서 사용하기에 부적적할때는, 메소드로 적절한 값으로 변환해서 리턴이 가능하기 때문.
//	이때 이런 역할을 하는 메소드가 Getter임.
	
}
