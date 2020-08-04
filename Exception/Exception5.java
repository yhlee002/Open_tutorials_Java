package Exception;

//예외를 반드시 처리해야 하는 경우(예외의 강제)
import java.io.*; //BefferedReader클래스가 속한 패키지
public class Exception5 {
	
	public static void main(String[] args) {
	//파일의 내용을 읽어서 출력하기(코드 자체에 대한 설명은 자세히 X)
		BufferedReader bReader = null; //try...catch문에서 나온 후 초기화 시키는 것
		try {
			bReader = new BufferedReader(new FileReader("out.txt")); 
			//파일을 읽기 위해서는 new FileReader라는 객체의 인자값으로 읽어올 파일의 이름을 적음
			//--> 그 인스턴스를 new BufferedReader라는 객체의 생성자에게 전달해서 새로운 객체를 만들어 bReader에 담음
			//즉, ()안의 new FileReader가 out.txt파일을 읽은 것을 인자로 받는 BufferedReader 인스턴스 생성(이것이 bReader)
		}catch(Exception e){
			e.printStackTrace();
		}
		String input = null; //초기화
		try {
			input = bReader.readLine();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		//BefferdReader클래스의 readLine()이라고 하는 메소드를 호출하면 파일의 내용을 읽어서 input변수에 담음
		System.out.println(input);
	}

}
/*
 * -->out.txt라는 파일이 존재하지 않기 때문에 오류 발생
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
 * Syntax error, insert ";" to complete BlockStatements

 * at Exception5.main(Exception5.java:7)
*/
