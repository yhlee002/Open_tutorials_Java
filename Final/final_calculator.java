package Final;

//field에서의 final : 값이 변하지 않게끔 해줌
class Calculator{
	static final double PI = 3.14; //모든 인스턴스에서 접근할 수 있는 공통적이고 변하지 않는 값
	//static : 공통적인, final : 바뀌지 않는(바꿀 수 없는)
	// --> final이 붙으면 한번 초기화된 값은 바꿀 수 없음
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void sum() {
		System.out.println(this.left + this.right);
	}
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
}
public class final_calculator {

	public static void main(String[] args) {
		System.out.println(Calculator.PI);

	}

}

class A{
	final void b() {}
}
class B extends A{
//	void b() {} --> final로 지정된 메소드는 상속해도 오버라이드 할 수 없음
}

final class C{
	final void b() {}
}
//class D extends C{} --> final로 지정된 클래스는 상속할 수 없음
