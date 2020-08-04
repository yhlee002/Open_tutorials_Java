package Exception;

//예외 사슬2

//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
import java.io.*;

class O{
	void run() throws FileNotFoundException, IOException{ //ln30에서 예외를 처리하도록 넘김
		BufferedReader bReader = null;
		String input = null;
		
		bReader = new BufferedReader(new FileReader("out.txt"));
		input = bReader.readLine();
		System.out.println(input);
		bReader.close();
	}
}

class M{
	void run() {
		O o = new O();
		try {
			o.run();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
  }

public class Exception6_throw2 {
	public static void main(String[] args) {
		
	}
}
 