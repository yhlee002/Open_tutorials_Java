package OOP;

public class MyOOP_1 {
	public static String delimiter = "";  //참조하는 클래스 안의 변수는 가져온 곳에서 사용할 수 없으므로 클래스 변수에 선언하여 클래스에 속하는 여러 메소드에서 사용할 수 있다.
	public static void main(String[] args) {
		delimiter = "----";
		printA();
		printA();
		printB();
		printB();
		
		printA();
		printA();
		printB();
		printB();
	}
		public static void printA() {
			System.out.println(delimiter);
			System.out.println("A");
			System.out.println("A");
		}
		public static void printB() {
			System.out.println(delimiter);
			System.out.println("B");
			System.out.println("B");
		}
		
		
//-->첫번째 방법
//		//아래 네 줄은 구분자로서----을 넣고 싶은 경우
//		printA("----");
//		printA("----");
//		printB("----");
//		printB("----");
//		
//		//아래 네 줄은 구분자로서 ****을 넣고 싶은 경우
//		printA("****");
//		printA("****");
//		printB("****");
//		printB("****");
//	}
//	public static void printA(String delimiter) {
//		System.out.println(delimiter);
//		System.out.println("A");
//		System.out.println("A");
//		}
//	public static void printB(String delimiter) { 
//		System.out.println(delimiter);
//		System.out.println("B");
//		System.out.println("B");
//	}
	
		
//-->두번째 방법
//	String delimiter2 = "-----"; //-->인자로 변수를 주는 방법
//	printA1(delimiter2);
//	printA1(delimiter2);
//	printB1(delimiter2);
//	printB1(delimiter2);
//	
//	delimiter2 = "****";
//	printA1(delimiter2);
//	printA1(delimiter2);
//	printB1(delimiter2);
//	printB1(delimiter2);
//}
//public static void printA1() {
//	System.out.println(delimiter2);
//	System.out.println("A1");
//	System.out.println("A1");
//	}
//public static void printB1() { 
//	System.out.println(delimiter2);
//	System.out.println("B1");
//	System.out.println("B1");
	
	
}
