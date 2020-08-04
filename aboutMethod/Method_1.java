package aboutMethod;
public class Method_1 {

	public static void main(String[] args) {
					//인자, argument
		printTwoTimes("a", "b");
		printTwoTimes("c", "d");
		printTwoTimes("e", "f");
		printTwoTimes("1", "2");
		

	}
									//매개변수, parameter
	public static void printTwoTimes(String text, String delimiter) { // delimiter : 구분자
		System.out.println("-");
		System.out.println(text);
		System.out.println(delimiter);
		
		
	}	
}
