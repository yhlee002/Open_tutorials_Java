package Polymorphism;

//클래스와 다형성 3
class A2{
	public String x() {return "A2.x";}
}
class B2 extends A2{
	public String x() {return "B2.x";} 
	public String y() {return "y";}
}
class C extends A2{
	public String x() {return "C.x";}
}
public class Polymorphism_Class3 {
	public static void main(String[] args) {
		A2 obj = new B2();
		A2 obj2 = new C();
		System.out.println(obj.x()); //-->"B.x" 출력
		System.out.println(obj2.x()); //-->"C.x" 출력
	}
}
/*
 * 두 개의 객체가 동일한 데이터 타입으로 존재하면서 각각의 클래스에 정의되어 있는
 * 메소드를 호출할때는 각 클래스의 메소드에 정의되어 있는대로 동작하는 것이 다형성
 */
