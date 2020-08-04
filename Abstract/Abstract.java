package Abstract;

//abstract(추상)
//--> 추상 메소드를 갖는 클래스는 반드시 추상 클래스가 되며, 추상 클래스는 실제 값(로직)을 가지는 메소드를 포함할 수 있음
abstract class Abs{
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public int _cal() {
		return (this.left+this.right);
	}
	public abstract void sum(); //추상 메소드는 메소드 바디를 갖지 않음(cf.인스턴스화되지도 않음)
	public abstract void avg();
	public void callM() {
		sum();
		avg();
	}
}

class PlusApp extends Abs{
	public void sum() {
		System.out.println("+ sum : "+_cal());
	}
	public void avg() {
		System.out.println("+ avg : "+_cal()/2);
	}
}
class MinusApp extends Abs{
	public void sum() {
		System.out.println("- sum : "+_cal());
	}
	public void avg() {
		System.out.println("- avg : "+_cal()/2);
	}
}
public class Abstract {
	public static void main(String[] args) {
/*
 * Abs클래스를 상속한 PlusApp혹은 MinusApp의 setOprands로 값을 넣으면 
 * Abs의 setOprands에 값이 들어가 하단의 callM()을 호출할 경우 Abs의 callM()이
 * PlusApp과 MinusApp의 sum()과 avg()를 호출하게 되는 식.
 * 이때 PlusApp과 MinusApp의 sum(), avg()는 모두 Abs의 _cal()을 통해 중복을 제거할 수 있음
 */
		PlusApp plus = new PlusApp();
		plus.setOprands(10,20);
		plus.callM(); //callM은 단순히 sum과 avg메소드를 한 코드만으로 출력해내는 것 뿐 없어도 됨
//		plus.sum();
//		plus.avg();
		
		MinusApp minus = new MinusApp();
		minus.setOprands(30,40);
		minus.callM();
//		minus.sum();
//		minus.avg();
	}

}
