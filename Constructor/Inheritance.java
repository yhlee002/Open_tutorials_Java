package Constructor;

//상속(class 하위클래스명 extends 슈퍼클래스명)
class Calculator {
	int left, right;
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
}


class SubstractionableCalculator extends Calculator {
	
	public SubstractionableCalculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
}


public class Inheritance{
	public static void main(String[] args) {
		SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();

	}

}
