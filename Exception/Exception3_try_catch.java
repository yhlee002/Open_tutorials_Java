package Exception;

//try...catch문
class A{
	private int[] arr = new int[3];
	A() { //constructor
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
	}
	public void z(int first, int second) {
		try{
			System.out.println(arr[first] / arr[second]); // 존재하지 않는 인덱스값을 넣은 것
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException e");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException e");
		}catch(Exception e) {
			//ArithmeticException과 ArrayIndexOutOfBoundsException 둘 다 아닌 다른 예외일때 실행될 로직 위치
			//이는 if...else statements의 else 역할과 유사
			//(Exception)은 모든 예외를 포함하는 구문이기 때문에 다른 특정 예외의 경우를 정의내리는 구문들 이후에 나와야함(순서 중요)
			//--> Exception이 가장 포괄적인 이유는 ArithmeticException, ArrayIndexOutOfBoundsException 등의 예외클래스의
			//   상위 클래스이기 때문
		}
	}
}
public class Exception3_try_catch {

	public static void main(String[] args) {
		A a = new A();
		a.z(10, 1);
	}
}
/*
 * --> Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException 발생(배열의 범위 밖에 있는 값을 사용하려 할때 발생하는 예외)
 *		at A.z(Exception3.java:9) --> 실제 근본적인 문제 발생 지점
 *		at Exception3.main(Exception3.java:16) --> 사용자와 가장 가까운 지점
 */
