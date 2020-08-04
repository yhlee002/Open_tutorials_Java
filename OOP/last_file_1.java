package OOP;

class accounting{
	
	public static double valueOfSupply;
	public static double vatRate = 0.1;
	public static double getVAT() {
		return valueOfSupply*vatRate;
	}
	public static double getTotal() {
		return valueOfSupply + getVAT();
	}
	
}
public class last_file_1 {
	//활용 - 클래스화
	public static void main(String[] args) {
		accounting.valueOfSupply = 10000.0;
		System.out.println("Value of supply : " + accounting.valueOfSupply);
		System.out.println("VAT : " + accounting.getVAT());
		System.out.println("Total : " + accounting.getTotal());
		//회계와 관련된 class를 만들어 관련된 코드를 모두 넣고 메인 메소드의 관련 코드들에 클래스 명을 붙이면 회계에 관련된 코드라는 것을 알아보기 쉬움
		//코드가 단정해지는 것 또한 장점
	}

}
