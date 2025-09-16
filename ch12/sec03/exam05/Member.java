package ch12.sec03.exam05;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {
	
	private String id;
	private String name;
	private int age;
	
//	롬복을 사용하고 @Data가 붙는데, @Data가 붙게 되면 컴파일 과정에서 기본 생성자와 함께 Getter,Setter,hashCode(),equals(),toString() 메소드가 자동으로 생성된다.
//	project Explorer 폴더에서 ch12.sec03.exam05의 Member클래스를 펼치면 위 메소드가 생성된걸 볼수있음.
//	@Data에 있는 @RequiredArgsConstructor은 기본적으로 매개변수가 없는 생성자를 포함시키지만, final 또는 @NonNull이 붕튼 필드가 있다면 이 필드만 초기화시키는 생성자를 포함시킴
//	final과 @NonNull의 차이점은 초기화된 final 필드는 변경할 수 없지만(Setter가 만들어지지않음), @NonNull은 null이 아닌 다른 값으로 Setter(세터)를 통해 변경할 수 있음.
//	사실 어떨떄쓰고 어떻게 이용하는지 잘 이해안감 설명 들어야될듯.
}