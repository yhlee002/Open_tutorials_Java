package Exception;

//예외 사슬1
class F{
	void run(){	
		System.out.println("Yum Yum");
	}
}

class G{
	void run(){
	F f = new F();
	f.run();
	}
}

public class Exception6_throw {
	public static void main(String[] args) {
	G g = new G();
	g.run(); //--> Exception6_throw클래스는 G클래스를 사용하고, G클래스는 F클래스를 사용하는 관계
	}
}

//'F --> G --> Exception6_throw --> 사용자'의 순으로 사슬이 맺어짐
//F는 다음 사용자인 G에게, G는 Exception6_throw에게, Exception6_throw는 다른 사용자에게 예외 처리를 넘길 수 있다.
//예외가 발생했을때, 내가 처리하기 보다는 다음 사용자에게 넘기는 것(책임을 전가하는 것)