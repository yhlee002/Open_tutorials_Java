package Overriding;

/*overriding : '재정의(새롭게 정의한다.)'의 의미
* 상위 클래스가 가진 메소드를 상속받긴 했지만 그것을 그대로 쓰지 않고
* 하위 클래스의 필요에 따라 재정의를 통해 기능을 변경하는 것
*/
class Calculator3 {
	int left, right;
 
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	 
	public void sum() {
		System.out.println(this.left + this.right);
	}
	 
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}
	 
class SubstractionableCalculator3 extends Calculator3 {
	public void sum() {
		System.out.println("실행 결과는 "+(this.left + this.right)+"입니다.");
	}
	//sum()은 상위 클래스에도 있는 메소드지만 하위 클래스에서 재정의하여 기능을 바꿈으로써 하위 클래스의 내용이 우선순위에 오르게 됨.
	public void substract() {
		System.out.println(this.left - this.right);
	}
}
	 
public class Overriding {
	 public static void main(String[] args) {
	 
		 SubstractionableCalculator3 c1 = new SubstractionableCalculator3();
		 c1.setOprands(10, 20);
		 c1.sum();
		 c1.avg();
		 c1.substract();
	 }
	 
}


