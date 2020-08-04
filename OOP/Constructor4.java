package OOP;

//상위 클래스의 생성자와 같은 기능을 하는 하위 클래스 생성시 super(상위 클래스를 의미) 사용
//cf. super에 ()를 붙이면 상위 클래스의 '생성자'를 의미하게 됨
class Calculator2 {
	int left, right;
	
	public Calculator2() {}
	
	public Calculator2(int left, int right) {
		this.left = left;
		this.right = right;
	}
	/* 컴파일시 Error 발생.
	 * Implicit super constructor Calculator() is undefined. Must explicitly invoke.
	 * --->암시적으로 상위 클래스에 calculator라는 생성자가 정의되어 있지 않다는 의미.따라서 명시적으로 정의해야 한다.
	 * 이는 메인 메소드의 new SubstractionableCalculator2 에서 SubstractionableCalculator2라는 생성자를 호출할때에는
	 * 그 전에 상위 클래스(상속관계에 있는)의 생성자를 호출하게끔 약속되어 있기 때문.
	 * calculator2(int ...)는 매개변수를 가진 생성자로서 명시되어 있기 때문에 자바는 기본 생성자를 만들어 주지 않았고 이 때문에 오류 발생.
	 * 즉, 하위 클래스가 상속을 받을때 상위 클래스의 기본 생성자를 호출해야 하는데 그 생성자가 존재하지 않기 때문에 오류가 발생하는 것.
	 * 기본 생성자를 정의해주면 됨 (기존의 생성자를 두고 매개변수 없는 생성자 생성) : Calculator2(){}
	 * cf. 기본 생성자를 만들어 주지 않고도 객체가 작동하도록 할 수 있는 방법 존재.
	 * 하위 생성자의 내용과 상위 생성자의 기능이 같다면 이는 중복의 문제. 따라서 이럴때는 super라는 키워드를 사용.
	 * 하위 클래스에서 super(left, right);를 사용함으로써 
	 * super는 상위 클래스를 의미(this가 자기 자신을 의미하는 것과 같은 원리).
	 * super() : 상위 클래스의 생성자라는 의미.(super class의 생성자를 호출하는 것)
	 */
	

	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
}


class SubstractionableCalculator2 extends Calculator2 {
	
	public SubstractionableCalculator2(int left, int right) {
//		this.left = left;
//		this.right = right;
		super(left, right);
		/*
		 * 하위 클래스가 상위 클래스를 참조할 수 있는 방법으로써 super사용.
		 * 하위 클래스가 상위 클래스의 초기화를 먼저 시키고 자기 자신을 초기화를 해야한다면
		 * super클래스를 호출한 뒤 자기 자신의 초기화를 위해 필요한 코드를 생성자에 위치시키면
		 * 상속받은 클래스만이 해야하는 초기화 작업들을 수행할 수 있다.
		 * 하위 클래스의 초기화 코드는 항상 super코드 아래에 위치해야 한다.
		 */
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
}


public class Constructor4{
	public static void main(String[] args) {
		SubstractionableCalculator2 c1 = new SubstractionableCalculator2(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();

	}

}
