package Exception;

//checked와 unchecked
//cf.main메소드 무시
import java.io.IOException;

class U {
	public static void main(String[] args) {}
	
	
	void throwArithmeticException() { //unchecked Exception으로 예외 처리 필요 X
		throw new ArithmeticException();
	}
	void throwIOException() { //checked Exception으로 예외 처리 필요 --> 1.try...catch문
		try{
			throw new IOException();
		}catch(IOException e) {
			e.getMessage();
		}
	}
	void throwIOException2() throws IOException { //2.throws 사용
		throw new IOException();
		//예외가 발생했는데 이에 대해 특별한 조치를 취하고 있지 않았기 때문에 error발생 --> throws IOException
	}
}

/*
 * throwArithmeticException()과 throwIOException() 둘은 같은 구조이나 throwIOException()에만 오류 발생
 * 이는 checked와 unchecked의 차이.
 * 
 * 			throwable
 *       ↗			     ↖
 * 	error			 Exception
 * 					  ↑     ↑
 * 			IOException	   RuntimeException
 * 									↑
 * 						  ArithmeticException
 * 위는 예외의 상속 관계를 나타내는 모식도
 * RuntimeException을 상위 클래스로 가지는 예외 클래스(ex. ArithmeticException)은 unchecked Exception이며,
 * 그렇지 않은 경우는 checked Exception이라고 함(RuntimeException을 상속받지 않는 예외 클래스)
 * checked의 경우 반드시 예외 처리를 수행해야 하는 반면, unchecked의 경우 반드시 예외 처리를 할 필요가 없음
*/