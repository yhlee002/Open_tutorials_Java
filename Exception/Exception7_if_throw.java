package Exception;

//예외 발생시키기(만들기) ; if...throw cf.throws와 헷갈리지 말기
//지금까지 API의 소비자로서 API가 던지는 예외를 처리해왔다면, 이 로직은 생산자의 입장에서 예외를 발생시키는 법을 담고 있음
//ln37에서 0의 값을 넣음으로써 예외 발생. 이것을 어디에서 발생시키느냐의 문제(1, 2번 둘 중 하나를 선택하면 됨)
class Calculator3{
	int left, right;
	public void setOprands(int left, int right) { 
//1)	illegalArgumentException(적합하지 않은 인자가 들어왔을때) 발생 가능
		if(right == 0) {
			throw new IllegalArgumentException("두번째 인자는 0을 허용하지 않습니다.");
		}
		this.left = left;
		this.right = right;
	}
	
	public void divide() { 
//2)	ArithmeticException(계산 과정에서의 예외) 발생 가능
		if(right == 0) {
			throw new ArithmeticException("0으로 나눌 수 없습니다.");
		}//if(조건문){throw ...}에서 해당 클래스의 작동이 멈추고 이 클래스를 호출한 main메소드로 이동하여, try...catch문 실행됨
		//이때 ArithmeticException의 인스턴스는 "0으로 나눌 수 없습니다."라는 값을 가지고 있는 상태
		try{
			System.out.println("계산 결과는 ");
			System.out.println(this.left / this.right);
			System.out.println(" 입니다.");
		}catch(Exception e){
		//ArithmeticException : "0으로 나눌 수 없습니다."라는 값을 가짐(in18-20참고)
		System.out.println("\n\n e.getMessage()\n"+e.getMessage()); 
		System.out.println("\n\n e.toString()\n"+e.toString());
		System.out.println("\n\n e.printStackTrace()\n");
		e.printStackTrace();
		}
	}
}
public class Exception7_if_throw {

	public static void main(String[] args) {
		Calculator3 c1 = new Calculator3();
		c1.setOprands(10, 0);
		try{
			c1.divide();
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage()); //위에서 초기화된 예외 메세지로 바뀌어 나오게 됨("0으로 나눌 수 없습니다.)
		}
	}
}
