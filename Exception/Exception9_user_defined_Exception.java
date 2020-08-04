package Exception;

//사용자 정의 예외 만들기
//--> 로직의 흐름 이해하기
class DivideException extends RuntimeException { //unchecked로 만들거면 RuntimeException 상속받기
	int left;
	int right;
	DivideException(){
		super(); //RuntimeException의 생성자 기능을 호출
	}
	DivideException(String a, int left, int right){
		super(a);
		this.left = left;
		this.right = right;
	}
}
class Calculator4{
	int left, right;
	public void setOprands(int left, int right) { 
		this.left = left;
		this.right = right;
	}
	public void divide() { 
		if(right == 0) {
			throw new DivideException("0으로 나눌 수 없습니다.", left, right);
		}	
	}
}
public class Exception9_user_defined_Exception {

	public static void main(String[] args) {
		Calculator4 c1 = new Calculator4();
		c1.setOprands(10, 0);
		try{
			c1.divide();
		}catch(DivideException e) {
			System.out.println("e.toString() : "+e.toString());
			System.out.println("\n첫번째 값 : "+e.left);
			System.out.println("\n두번째 값 : "+e.right);
		}
	}
}
