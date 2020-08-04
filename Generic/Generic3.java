package Generic;
//Generic3

class EmployeeInfo1{
	public int rank;
	EmployeeInfo1(int rank){
		this.rank = rank;
	}
}

//generic에는 참조형 테이터형만 올 수 있음(기본 데이터형X)
class Person2<T, S>{ 
	public T info;
	public S id;
	Person2(T info, S id){
		this.info = info;
		this.id = id;
	}
}

public class Generic3 {
	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		Integer id = new Integer(1);
		//'1'은 객체가 아니기때문에 래퍼클래스로 객체화 해주는 것. new Integer는 기본 데이터 타입인 int를 참조 데이터 타입으로 변환해주는 역할을 한다.
		Person2<EmployeeInfo, Integer> p1 = new Person2<EmployeeInfo, Integer>(new EmployeeInfo(1), id);
		System.out.println(p1.id.intValue());
//wrapper class인 Integer클래스가 갖고 있는 메소드 중에 intValue()라는 메소드를 호출하면, 이 wrapper class가 담고있는 원래의 숫자
//(여기서는 1)을 원시 데이터 타입 (숫자 1)으로 돌려줌 -->이런 식으로 기본 데이터 타입도 래퍼 클래스를 통해 우회하여 사용할 수 있음
	}
}

/*
 * 기본 데이터형도 '래퍼 클래스'를 사용하면 제네릭 사용 가능
 * 래퍼(wrapper) 클래스 : 기본 데이터 타입을 참조 데이터 타입으로 변환시켜 주는 클래스
 * ex) Byte, Short, Integer, Long, Float, Double, Boolean, Char 등
*/