package Polymorphism;

/*
 * Polymorphism 실전예제
 * Abstract 강의 내용 활용
 * --> 여기서는 하나의 클래스(Calculator)가 다양한 동작 방법
 * 	  (PlusApp, MinusApp)을 가지는 것을 다형성이라고 할 수 있다.
 */
abstract class Calculator{
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	int _cal() {
		return this.left + this.right;
	}
	public abstract void sum();
	public abstract void avg();
	public void callM() {
		sum();
		avg();
	}
}
class PlusApp extends Calculator {
	public void sum() {
		System.out.println("+ sum : "+ _cal());
	}
	public void avg() {
		System.out.println("+ avg : "+ _cal()/2);
	}
}
class MinusApp extends Calculator {
	public void sum() {
		System.out.println("- sum : "+ _cal());
	}
	public void avg() {
		System.out.println("- avg : "+ _cal()/2);
	}
}
public class Polymorphism_Calculator {
	//매개변수(exe)로 받은 객체의 내부에 callM()메소드가 있기 때문에 사용 가능
	public static void execute(Calculator exe) { 
		System.out.println("실행 결과");
		exe.callM();
	}
	
	public static void main(String[] args) {
		Calculator c1 = new PlusApp();
		c1.setOprands(10, 20);
		c1.callM();
		
		Calculator c2 = new MinusApp();
		c2.setOprands(10,20);
		c2.callM();
		
		execute(c1);
		execute(c2);
/*		PlusApp과 MinusApp 모두 Calculator의 데이터 타입에 담음으로서,
 * 		하나의 메소드(execute)를 사용해 처리 가능(두 클래스가 공통된 부모를 가지고 있다는 점에서 착안)
 * 		public static void execute(PlusApp exe){
 * 			System.out.println("실행 결과");
 * 			exe.callM();
 * 		}
 * 		public static void execute(MinusApp exe){
 * 			System.out.println("실행 결과");
 * 			exe.callM();
 * 		}
 * 		====> Overloading을 사용해서 이렇게 처리하는 것도 가능하긴 함(좋은 코드는 아님)
 */
	}

}
