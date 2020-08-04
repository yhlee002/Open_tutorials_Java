package Reference;

//Reference & Parameter ; 메소드의 매개변수와 참조의 관계
class A2{
	public int id;
	A2(int id){
		this.id = id;
	}
//runValue()=================================================================================	
	static void _value(int b) {
		b = 2;
	}
	static void runValue() {
		int a = 1;
		_value(a);
		System.out.println("runValue(), b : 2, a : "+a);
		//_value(a)로 인해 int b = a가 되나, 기본 데이터형 변수이므로 b는 복제된 실제값 1을 가짐(값 변경시 영향X)
	}
//runReference1()============================================================================
	static void _reference1(A2 b) {
		b = new A2(2);
	}
	static void runReference1() {
		A2 a = new A2(1);
		_reference1(a);
		System.out.println("runReference1(), b.id : 2, a.id : "+a.id);
		//_reference1(a)로 인해 A2 b = a가 되나, b가 다시 new A(2)를 통해 2를 id값으로 받는 새로운 A2인스턴스를 
		//생성 및 참조함으로써 a가 참조하는 A2인스턴스와는 서로 영향을 주고 받지 않게 된다.(둘은 별개의 인스턴스를 참조)
	}
//runReference2()============================================================================
	static void _reference2(A2 b) {
		b.id = 2;
	}
	static void runReference2() {
		A2 a = new A2(1);
		_reference2(a);
		System.out.println("runReference2(), b.id : 2, a.id : "+a.id);
		//_reference2(a)로 인해 A b = a가 되어 b와 a가 같은 인스턴스를 참조하게 되고 둘은 서로 영향을 주고 받음
	}
}
public class Reference2_parameter {
	public static void main(String[] args) {
		A2.runValue();
		A2.runReference1();
		A2.runReference2();
	}
	
	
}
