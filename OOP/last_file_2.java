package OOP;

class accounting2{
	
	public double valueOfSupply;
	public static double vatRate = 0.1;
	//부과가치세율은 나라내에서 어떤 상품이건 같기 때문에 클래스 소속으로 두는게 좋음
	//instance를 만들때 마다 컴퓨터의 저장공간(메모리)를 사용하지 않아도 됨
	//값을 바꿔야 하면 이 문장 하나만 수정할 경우 모든 곳에서 적용이 되기 때문
	public double getVAT() {
		return valueOfSupply*vatRate;
	}
	public double getTotal() {
		return valueOfSupply + getVAT();
	}
	public accounting2(double valueOfSupply) {
		this.valueOfSupply = valueOfSupply;
	}
	
}
public class last_file_2 {
	//활용 - 인스턴스화
	public static void main(String[] args) {
		//기존 코드 : accounting2.valueOfSupply = 10000.0;
		accounting2 f1 = new accounting2(10000.0);
		accounting2 f2 = new accounting2(20000.0);
		//인스턴스화 + 인스턴스를 만들때 바로 값을 넣을 수 있는 코드로 변화(생성자 사용)
		
		f1.valueOfSupply = 10000.0;
		f2.valueOfSupply = 20000.0;
		

		System.out.println("Value of supply : " + f1.valueOfSupply);
		System.out.println("Value of supply : " + f2.valueOfSupply);
		
		System.out.println("VAT : "+f1.getVAT());
		System.out.println("VAT : "+f2.getVAT());
		
		System.out.println("Total : " + f1.getTotal());
		System.out.println("Total : " + f2.getTotal());	

		
	}

}
