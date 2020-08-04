package Generic;

abstract class Info{ //꼭 abstract class가 아니어도 상관 없음
	public abstract int getLevel();
}
class EmployeeInfo3 extends Info{
	public int rank;
	EmployeeInfo3(int rank){this.rank = rank;}
	public int getLevel() {
		return this.rank;
	}
}
class Person4<T extends Info>{ 
	//<T extends Info> : 들어올 수 있는 데이터 타입 제한(Info와 Info의 하위 클래스들) cf.super : Info와 Info의 상위 클래스들
	public T info;
	Person4(T info){this.info = info;}
}
public class Generic5 {
	public static void main(String[] args) {
		Person4 p1 = new Person4(new EmployeeInfo3(1));
//		Person4<String> p2 = new Person4<String>("부장"); <String>은 Info와 무관한 class이므로 java는 이를 거부
	}
}

/*
 * <T extends Info> : Info라는 클래스 혹은 Info를 상속받는 클래스들만 데이터 타입(T)이 될 수 있게 제한하는 코드
 * extends Class만 사용해야하는 것은 아님(extends Interface도 가능 - implements는 들어와서는 안됨)
 * Interface가 generic 맥락 안에서 사용될 떄는 상속하는 의미가 아니라 부모(상위 클래스)를 알려주는 의미로 사용되기 때문
 * 
 * Interface와 Class 둘 다로 제한을 해야할때 : extends Class명 & Interface {}
 */