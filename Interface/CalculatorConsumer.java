package Interface;

class CalculatorDummy implements Calculatable{ //계산기를 만들기 전 사용하는 가짜 로직
	public void setOprands(int left, int right, int third) {
		
	}
	public int sum() {
		return 60;
	}
	public int avg() {
		return 20;
	}	
}

public class CalculatorConsumer {
	public static void main(String[] args) {
		CalculatorDummy c = new CalculatorDummy();
		c.setOprands(10, 20, 30);
		System.out.println(c.sum()+c.avg());
	}
}