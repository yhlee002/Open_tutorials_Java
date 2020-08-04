package Polymorphism;

//오버로딩은 가장 쉬운 다형성의 예(오버로딩이 다형성인지 아닌지에 대한 이견 존재 - 2014년 기준)
class O{
	public void a(int param) {
		System.out.println("숫자 출력");
		System.out.println(param);
	}
	public void a(String param) {
		System.out.println("문자 출력");
		System.out.println(param);
	}
}
public class PolymorphismOverloading {

	public static void main(String[] args) {
		O o = new O();
		o.a(1);
		o.a("one");

	}

}
