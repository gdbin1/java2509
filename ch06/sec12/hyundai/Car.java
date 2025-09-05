package ch06.sec12.hyundai;

//	import 문으로 다른 패키지 클래스 사용을 명시
import ch06.sec12.hankook.SnowTire;
import ch06.sec12.kumho.AllSeasonTire;

public class Car {

//		부품 필드 선언
//	아래 두 줄에 대한 설명은 맨밑에 주석.
	ch06.sec12.hankook.Tire tire1 = new ch06.sec12.hankook.Tire();
	ch06.sec12.kumho.Tire tire2 = new ch06.sec12.kumho.Tire();
	
	SnowTire tire3 = new SnowTire();
	AllSeasonTire  tire4 = new AllSeasonTire();
	
	
//	패키지는 상위 패키지와 하위 패키지를 도트(.)로 구분 / dot는 무리적으로 하위 디렉토리임을 뜻함. ex) com.mycompany에서 com은 상위 디렉토리, mycompany는 하위 디렉토리
//	패키지는 클래스를 식별하는 용도로 사용되어서 클래스의 전체 이름에 포함됨.
//	ex) 위 코드에서 SnowTire 클래스를 가져오기 위해 전체 위치를 작성한 것.
	
//	같은 패키지에 있는 클래스는 아무 조건없이 사용 가능하지만, 다른 패키지에 있는 클래스를 사용하려면 import문을 사용하면 된다. <-- 이 점은 익숙한듯?
//	import할때 import 하려는 클래스가 어디 패키지에 속해있는지도 주소를 적어줘야 된다. <-- 이거도 익숙함

//	만약 서로 패키지에 동일한 클래스 이름이 존재할떈, 그냥 클래스 이름을 적었을시엔, 컴파일러는 어떤 패키지의 클래스를 사용할 지 결정할 수 없기에 에러를 발생시킴.
//	그렇기 때문에 위에처럼 클래스의 전체 이름을 사용해서 정확히 어떤 패키지의 클래스를 사용할지 알려야함.

//	잘못된 예시: ex) 위처럼 import하고 / public class Car { Tire tire = new Tire() } <-- 라고 적을시에, Tire 클래스가 서로 다른 패키지에 같은 이름의 클래스로
//	저장되어있기 때문에 오류 발생.
}
