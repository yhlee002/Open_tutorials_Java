package Polymorphism;

//클래스의 다형성1

/*
class A{}
class B extends A{}
public class Polymorphism2 {
	public static void main(String[] args) {
		A obj = new B();
	}
}
*/

class A{
	public String x() {return "x";}}
class B extends A{public String y() {return "y";}}
public class Polymorphism_Class1 {
	public static void main(String[] args) {
		A obj = new B(); //변수 obj은 B를 인스턴스화 하고 있지만 이를 클래스 A 타입에 담음. 결국 A 행세를 하는 것
		obj.x();
//		obj.y(); --> 상위 클래스인 A에는 y()가 없기 때문
	}
}

/*
인스턴스를 담는 변수의 데이터 타입은 그 클래스가 될 수도 있고, 그 클래스의 상위 클래스가 될 수도 있다.
여기서는 그 클래스의 상위 클래스가 데이터 타입으로 정의되고, 이 인스턴스가 상위 클래스인 듯 동작하게 할 수 있음
*/