package Polymorphism;

/* 
 * 인터페이스와 다형성
 * 클래스가 인스턴스화될 때 인터페이스를 데이터 타입으로 삼는다는 것은
 * 그 인터페이스가 (바디는 없지만)정의하고 있는 멤버들만을 가지고 있는
 * 클래스인 것처럼 사용할 수 있게 된다는 것을 의미.
 * 
 * 클래스의 모든 멤버(기능)을 사용해야 한다면 클래스 그 자체를 데이터 타입으로 삼아 인스턴스화.
 * 만약, 특정 멤버(기능)만을 사용하는 거라면 마치 그 멤버들이 존재하지 않는 것처럼 할 수 있음.
 * 즉, 의도하는 기능만을 사용하게끔 인스턴스화할 수 있음.
 * 
 * 한 인터페이스를 구현하는 클래스가 여러개라면 인터페이스를 데이터 타입으로 삼아 같은 데이터 타입을
 * 갖고 있지만 실제 클래스가 무엇인지에 따라 다르게 동작할 수 있는 다형성 역시 구현할 수 있음.
 */

interface I2{
	public String A(); //A()의 정의를 강제하고 있음
}
interface I3{
	public String B(); //B()의 정의를 강제하고 있음
}
class E implements I2, I3{ //I2와 I3의 멤버인 A(), B() 모두를 정의하고 있음
	public String A() {
		return "A";
	}
	public String B() {
		return "B";
	}
}
public class Polymorphism_Interface2{
	public static void main(String[] args) {
		E obj = new E(); //클래스 자체의 데이터 타입을 그대로 가짐 --> 클래스 E가 정의하는 모든 멤버 사용 가능
		I2 obj2 = new E(); //클래스의 인터페이스 중 하나를 구현
		I3 obj3 = new E(); //클래스의 인터페이스 중 하나를 구현
		
		obj.A();
		obj.B();
		
		obj2.A();
//		obj2.B();
		
//		obj3.A();
		obj3.B();
	}
}