package Constructor;

public class Constructor1 {
//생성자
//목적 : 사용자가 꼭 들어가야 하는 입력값을 쓰지않는 것을 방지하기 위해
//입력값을 넣지 않으면 오류가 발생하면 사전에 방지 될 것. 그렇다면
//애초에 instance를  만들때 입력값도 함께 넣어서 만들 수 있다면?

//Constructor는 늘 public 클래스명(){}의 형태
	
//java는 생성자라는 특수한 메소드를 구현할 수 있는 기능 제공, 그것의 중요한 기능은 초기화.
//class와 똑같은 이름의 method를 class 하에 만들면 이것이 생성자. instance를 생성할때 
//java는 class와 같은 이름의 method를 가져오기 때문에 우리는 이 method 안에 실행할 코드를
//씀으로써 이를 가져올 수 있음. 이 method의 매개변수로 String_delimiter를 선언하고 인자를 받으면 됨
	public static void main(String[] args) {
		
		pr p1 = new pr("----");
		//p1.delimiter = "----" or "****"
		p1.A();
		p1.A();
		p1.B();
		p1.B();
		
		pr p2 = new pr("****");
		//p2.delimiter
		p2.A();
		p2.A();
		p2.B();
		p2.B();
		
		p1.A();
		p2.A();
		p1.B();
		p2.B();
		
	}
//생성자는 static, return data-type 등을 지정하지 않음.
//생성자는 초기에 주입할 필요가 있는 값을 작업하거나
//초기의 작업을 수행하도록 할때 사용.
//this는 그 class가 instance화 되었을때 그 instance를 가리키는 명령어이다.

/*생성자의 기능 : 객체를 생성하는 역할, 또한 객체를 생성하는 과정에서 최초로
 * 해야하는 일이 있다면 그것을 가능하게 해주는 메소드를 정의할 수 있는 기회를 제공*/
}
