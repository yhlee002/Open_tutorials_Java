package Exception;

/*
 * 일반적이지 않은 상황에서 기획했던것과는 다르게 발생하는 문제들을
 * 자바에서는 포괄적으로 예외(Exception)이라고 부름
 */
class Calculator{
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void divide() { 
		try { 
		System.out.print("계산결과는 ");
		System.out.print(this.left/this.right); //-->ln21에 의해 오류 발생(Excetion)
		System.out.print(" 입니다.");
		}catch(Exception e) { //ln16에서 발생한 Exception을 e라는 매개변수로 받음
			System.out.println("오류가 발생하였습니다. "+e.getMessage()); 
		}
	}
}
public class Exception1 {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0); //--> 자바에서는 어떤 수를 0으로 나누면 오류가 발생
		c1.divide();

	}

}
/*
 * try ... catch()~
 * try{
 * 		예외의 발생이 예상되는 로직
 * }catch(예외클래스 인스턴스){
 * 예외가 발생했을 때 실행되는 로직
 * }
 * 
 * */