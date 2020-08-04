package Object;

//Object2 ; equals() : 객체와 객체를 비교하는 기능의 메소드
//원시데이터타입(byte, short, int, long, double, float, boolean, char의 경우 ==사용)
//원시데이터타입을 사용할때만 '=='를 사용하는 것이 권장됨(String이나 객체 비교에만 equals()권장)
class Student{
	String name;
	Student(String name){ //public Student(){}의 형태가 아니어도 되는 이유?
		this.name = name;
	}
    public boolean equals(Object obj) { //--> 이것이 원래 시그니처
    //equals()에 s2가 값으로 들어오면 Object obj = new s2()의 형태가 됨
    //s2가 Student타입에서 Object타입이 되면 Object타입에는 없는 name이라는 변수에 접근 불가
    //-->Object타입에서 Student타입으로 전환하는 과정이 필요
    	Student _obj = (Student) obj;
    	//하위 클래스가 상위 클래스인 척 하면 자신만 가진 멤버를 숨기면 되지만, 상위 클래스가 하위 클래스가 되려면 하위 클래스에만 있는 
    	//멤버를 가지고 있지 않기 때문에 없는 것을 가질 수는 없는 터라 원래 불가능(명시함으로써 형변환을 강제할 수 있음)
    	return (this.name == _obj.name);
    	//여기서는 ln24의 s1이 this가 됨
    }
}
public class Object2_equals {

	public static void main(String[] args) {
		Student s1 = new Student("egoing");
		Student s2 = new Student("egoing");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
