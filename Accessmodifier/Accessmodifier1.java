package Accessmodifier;

//접근 제어자를 통해 사용자가 접근할 수 있는 범위 지정 가능
//더 적은 메뉴얼로 사용할 수 있게 의도할 수 있음(개발자의 의도대로 사용할 수 있도록 함)
class Calculator{
	private int left, right; //private field이므로 다른 클래스의 메소드에서 직접적인 값 변경 불가능
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	private int sum() { //sum()은 private method로 직접적인 접근 불가능
		
		return this.left+this.right;
	}
	
	public void sumDecoPlus() {
		System.out.println("++++"+sum()+"++++");
	}
	
	public void sumDecoMinus() {
		System.out.println("----"+sum()+"----");
	}
}

public class Accessmodifier1 {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setOprands(10, 20);
		c.sumDecoPlus();
		c.sumDecoMinus();
//		c.left = 100; -->이런 식으로 값을 변경하려하면 오류가 발생(private field)
	}

}
