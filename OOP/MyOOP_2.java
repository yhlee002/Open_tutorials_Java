package OOP;

class pr2{
//이 class를 개별적인 file로 만들어도 같은 directory에 있는 한 가져와 사용할 수 있음
	public String delimiter = ""; 
	public void A() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	public void B() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}
//pr.class는 현재 파일에서 선언함으로써 class 파일이 자동으로 형성됨(OOP ... - bin)

public class MyOOP_2 {
	
	public static void main(String[] args) {
		
		pr2 p1 = new pr2();
		p1.delimiter = "----";
		p1.A(); //개별적인 값을 가질 수 있는 인스턴스 소속이 되게 하기 위해서 참조 클래스의 변수, 메소드를 non-static화
		p1.A();
		p1.B();
		p1.B();
		
		pr2 p2 = new pr2();
		p2.delimiter = "****";
		p2.A();
		p2.A();
		p2.B();
		p2.B();
		
		p1.A();
		p2.A();
		p1.B();
		p2.B();
		
		/*
		 * class의 static(class소속의 변수 혹은 메소드임을 선언하는 명령어) method를 non-static(instance소속임을
		 * 선언하는 명령어)으로 바꿈으로써, 개별 instance의 다르게 가질 수 있게 하고 중복을 줄일 수 있음
		 * 
		 * 수백, 수천개의 유사한 코드가 존재할때 이를 하나의 class를 반복 사용하여 만들어내면 매번 입력값을 새로 줘야 서로 다른 값을 
		 * 만들어 낼 수 있지만, class를 복제한 instance를 여러개 만들면 매번 입력값을 넣지 않고 깔끔한 코드를 만들 수 있다.
		 */
		
	}

}
