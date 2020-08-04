package Polymorphism;

//클래스와 다형성 2
class A1{
	public String x() {return "A1.x";}
}
class B1 extends A1{
	public String x() {return "B1.x";} //Overriding
	public String y() {return "y";}
}
//A1.x()를 호출하면 "A1.x"가, B1.x()를 호출하면 "B1.x"가 출력 되야 함
public class Polymorphism_Class2 {
	public static void main(String[] args) {
		A1 obj = new B1(); //변수 obj은 B1를 인스턴스화 하고 있지만 결국 A1 행세를 하는 것
		System.out.println(obj.x()); //-->"B1.x" 출력
//A1의 행세를 하고 있지만 B1에 명시된 메소드를 사용
//하지만 A1의 행세를 하고 있기 때문에 A1에 없는 메소드(y)를 사용할 경우 오류 발생
//즉, A1를 상속한 B1의 인스턴스인 obj은 A1의 행세를 함으로써 A1에 없는 메소드는 읽지 못하나,
//어떤 메소드가 상위 클래스의 메소드를 오버라이딩했다면(B1.x) 실행되는 것은 인스턴스화된 클래스의 메소드를 실행됨

	}
}
