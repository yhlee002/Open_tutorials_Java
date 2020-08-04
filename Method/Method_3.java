package aboutMethod;

import java.io.FileWriter;
import java.io.IOException;

class Method_3 {
//메소드의 출력(TwoTimes라는 메소드를 만들고 이 메소드는 리턴값. 즉, 아웃풋이 값이 되게 해서 여기 저기서 재사용 되게 함
	public static void main(String[] args) throws IOException {

/*		System.out.println("Hello Method");
		System.out.println(Math.floor(1.1)); //-->실수 1.0 출력(cf.ceil)
*/
		System.out.println(twoTimes("a", "-"));
		FileWriter fw = new FileWriter("out.txt"); //같은 directory하의 out.txt에 작성한다는 의미
		fw.write(twoTimes("a", "*")); // (FileWriter라는 메소드의 인스턴스에) twoTimes( , )라는 메소드에 "a"와 "*"라는 값을 넣어서 출력
		fw.close();
	}	
	
	public static String twoTimes(String text, String delimiter) {
		String out = "";
		out = out + delimiter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
	}
/*	public static void printTwoTimes(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}
	public static void writeFileTwoTimes(String text, String delimiter) throws IOException {
		FileWriter fw = new FileWriter("output.txt");
		fw.write(delimiter+"\n");
		fw.write(text+"\n");
		fw.write(text+"\n");
		fw.close();
	}*/
}

