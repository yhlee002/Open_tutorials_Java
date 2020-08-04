package Enum;

//Enum : 열거형(enumerated type)으로, 서로 연관된 상수들의 집합
/*
  <특징>
	1. 연관된 상수들을 저장하며 그 값들이 변경되지 않도록 보장한다.(final 처럼)
	2. 열거형 자체가 클래스이기 때문에 내부에 생성자, 필드, 메소드를 가질 수 있다.(단순 상수가 아니라 더 많은 역할 수행)
	3. 열거형이 가지고 있는 상수들을 values()를 통해 하나씩 꺼내 처리할 수 있다.
  <enum을 사용하는 이유>
	1. 코드가 단순해진다.
	2. 인스턴스 생성과 상속을 방지한다.
	3. 키워드 enum을 사용하기 때문에 구현의 의도가 열거임을 분명하게 나타낼 수 있다.
*/
//여기서는 Fruit와 Company가 말하자면 열거라고 할 수 있다.

/*class Fruit{ -->이 방법은 세 상수를 배열처럼 '열거'할 수 없다는 단점 존재
	public static final Fruit APPLE = new Fruit();
	public static final Fruit PEACH = new Fruit();
	public static final Fruit BANANA = new Fruit();
}*/
enum Fruit2 { 
//enum도 클래스. 작은 코드만으로도 긴 코드의 효과를 낼 수 있도록 문법적인 지원을 하는 
//클래스므로 enum이라는 것을 명시하기 위해 enum이라는 키워드를 사용한다.
	APPLE, PEACH, BANANA
}
enum Company2{
	GOOGLE, APPLE, ORACLE
}

public class Enum2 {
	public static void main(String[] args) {
		Fruit2 type = Fruit2.APPLE;
		switch(type) {
		case APPLE : System.out.println(57+" kcal");
			break;
		case PEACH : System.out.println(34+" kcal");
			break;
		case BANANA : System.out.println(93+" kcal");
		}
//		각 case의 레이블이 switch문으로 전달한 type이라는 변수의 데이터 타입이 Fruit임을 이미 앎
	}

}
