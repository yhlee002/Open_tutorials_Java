package aboutMethod;

public class Method_2 {
//method를 '값'으로 사용하기
	public static String a() { //static method인 main method에서 사용하기 위해 public static 붙임
		//...
		return "a";
	}
	
	public static int one() {
		//...
		return 1;
	}
	
	public static void main(String[] args) {
		System.out.println(a()); //--> 문자 'a'출력
		System.out.println(one()); //--> 정수 1 출력


	}

}
