package ControlStatement;

public class ConditionalStatement_if {

	public static void main(String[] args) {
		if(true) {
			System.out.println(1); 
		}else {
			System.out.println(2); //dead code(warning : 절대 실행될 수 없는 코드)이라는 경고 발생	
		}
		
		//if문 안에는 또 다른 is문이 들어갈 수 있다.
		if(true) {
			if(true) {
				System.out.println(3);
			}else {
				System.out.println(4);
			}
		}else {System.out.println(5);
		}
		
		//else if를 통해서 중첩되지 않는  if문을 만들 수 있다.(바로 위의 if문과 같은 내용)
		if(false) {
			System.out.println("a");
		}else if(true) {
			System.out.println("b");
		}else {
			System.out.println("c");
		}
	}
}	
