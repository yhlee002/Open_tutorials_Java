package Exception;

//try...catch...finally문
/*
 * try{
 *   예외의 발생이 예상되는 로직
 * }catch(예외클래스 인스턴스){
 *   예외가 발생했을 때 실행되는 로직
 * }finally{
 *   예외여부와 관계없이 실행되는 로직
 * }
 */

/*
 * 예외와는 상관없이 반드시 끝내줘야 하는 작업이 있을 수 있다. 
 * 예를 들어 데이터베이스를 사용한다면 데이터베이스 서버에 접속해야 한다. 
 * 이때 데이터베이스 서버와 여러분이 작성한 에플리케이션은 서로 접속상태를
 * 유지하게 되는데 데이터베이스를 제어하는 과정에서 예외가 발생해서 더 이상
 * 후속 작업을 수행하는 것이 불가능한 경우가 있을 수 있다. 예외가 발생했다고
 * 데이터베이스 접속을 끊지 않으면 데이터베이스와 연결 상태를 유지하게 되고
 * 급기야 데이터베이스는 더 이상 접속을 수용할 수 없는 상태에 빠질 수 있다.
 * 접속을 끊는 작업은 예외 발생여부와 상관없기 때문에 finally에서 처리하기에 
 * 좋은 작업이라고 할 수 있다. 말하자면 finally는 작업의 뒷정리를 담당한다고 
 * 볼 수 있다.
 */
class B{
	private int[] arr = new int[3];
	B() { //constructor
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
	}
	public void z(int first, int second) {
		try{
			System.out.println(arr[first] / arr[second]); 
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException e");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException e");
		}catch(Exception e) {
			System.out.println("Exception");
		}finally {
			System.out.println("finally");
		}
	}
}
public class Exception4_try_catch_finally {

	public static void main(String[] args) {
		B b = new B();
		b.z(10, 0); //--> ArrayIndexOutOfBoundsException
		b.z(1, 0); //--> ArithmeticException
		b.z(2, 1); //--> 정상
	}
}
