package Polymorphism;

//인터페이스와 다형성
interface I{}
class D implements I{}
public class Polymorphism_Interface1 {
	public static void main(String[] args) {
		I obj = new D();
	}
}
//어떠한 클래스가 어떠한 인터페이스를 구현하고 있다면 그 클래스의 인스턴스는 그 인터페이스일 수 있다.
//--> 특정한 인터페이스를 구현하고 있는 클래스가 있을때 이 클래스의 데이터 타입으로 인터페이스를 지정할 수 있다.