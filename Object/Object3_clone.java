package Object;

//Object3 ; clone() : 객체를 복제하는 기능의 메소드

class Student2 implements Cloneable {
	String name;
	Student2(String name){
		this.name = name;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone(); //protected제어자인 Object클래스의 clone()를 상속받음
	}
}

public class Object3_clone {
	public static void main(String[] args) {
		Student2 s1 = new Student2("egoing");
		try {
			Student2 s2 = (Student2)s1.clone(); //s1.clone()은 Object타입이므로 강제로 형변환할 것을 명시함
			System.out.println(s1.name);
			System.out.println(s2.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} 
		//인스턴스의 클래스가 복제가능한(cloneable) 객체인지 명시해줘야함
		//--> 복제가능함을 알려주는 인터페이스를 구현해야함
		//clone() : protected제어자이기때문. protected제어자 : 서로 다른 패키지에서는 호출할 수 없음, 서로 다른 패키지지만 상속은 가능
	}
}
