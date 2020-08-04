package Exception;

//예외 - 뒷수습
class Calculator2{
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void divide() { 
		try { 
		System.out.print("계산결과는 ");
		System.out.print(this.left/this.right); 
		System.out.print(" 입니다.");
		}catch(Exception e) { 
			System.out.println("\n\ne.getMessage()\n"+e.getMessage()); 
			System.out.println("\n\ne.toString()\n"+e.toString());
			System.out.println("\n\ne.printStackTrace()");
			e.printStackTrace();
			/* 1)getMessage() : 예외상황에 대한 기본적인 내용 출력
			 * 2)toString() : 예외상황에 대한 보다 자세한 정보
			 * 3)printStackTrace() : 화면에 예외상황에 대한 상세한 정보(메세지 전부)를 출력.
			 * 	getMessage()나 toString()과 달리 return값이 없다.
			 * 	따라서 이 메소드를 호출하면 메소드가 내부적으로 예외 결과를 화면에 출력(print 메소드 필요X)
			*/
		}
		System.out.println("Divide End");
	}
}
public class Exception2 {

	public static void main(String[] args) {
		Calculator2 c1 = new Calculator2();
		c1.setOprands(10, 0); 
		c1.divide();

	}

}
