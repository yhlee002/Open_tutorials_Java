package Generic;
//Generic1
//Generic : 클래스 내부에서 사용될 데이터 타입을 외부에서 지정하는 기법.
//즉, 클래스가 내부적으로 미정해놓은 데이터타입을 인스턴스화할때 지정하는 것으로 <>의 형태로 표현
//cf.parameter(매개변수)가 '값'과 관련있다면 generic(제네릭)은 '데이터타입'과 관련
class Person<T>{
	public T info; //info의 데이터타입이 때에 따라 String, StringBuilder가 될 수 있음
}

public class Generic1 {
	public static void main(String[] args) {
	Person<String> p1 = new Person<String>();
	Person<StringBuilder> p2 = new Person<StringBuilder>();
	}
}
//제네릭이란 그 
//-->p1.info와 p2.info는 때에 따라 p1.String, p2.String이 되거나 p1.StringBuilder, p2.StringBuilder가 된다.