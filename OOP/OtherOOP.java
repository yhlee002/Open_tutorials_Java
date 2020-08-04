package OOP;

import java.io.FileWriter;
import java.io.IOException;
//FileWriter는 꼭 수정할 file 입력값을 받고, 이 입력값을 수정하는 기능을 수행하는 class
public class OtherOOP {

	public static void main(String[] args) throws IOException {
		//class : System, Math, FileWriter
		//instance : f1, f2
		
		System.out.println(Math.PI);
		System.out.println(Math.ceil(1.8)); //--> 실수 2.0 출력
		System.out.println(Math.floor(1.8)); //--> 실수 1.0 출력
		
		/*FileWriter라는 class의 instance 만들기 cf.FileWriter : 파일에 내용을 작성하는 class
		FileWriter("data.txt") : data.txt라는 파일에 작성하는 FileWriter
		new = FileWriter("data.txt") : new로 인해서 'data.txt에 파일을 저장하겠다.'는 상태를 가지는 'FileWriter'의 복제본이 생긴 것.
		f1 = new = FileWriter("data.txt") : 이것을 f1이라는 변수에 넣음
		FileWriter f1 = new FileWriter("data.txt") : f1이라는 변수에 들어갈 값의 데이터 타입은 FileWriter라는 클래스의 형태
		 */
		FileWriter f1 = new FileWriter("data.txt");
		f1.write("Hello");
		f1.write(" Java");
		
		FileWriter f2 = new FileWriter("data2.txt");
		f2.write("Hello");
		f2.write(" Java2");
		f2.close();
		
		f1.write("!!!");
		f1.close();
		
	}

}
