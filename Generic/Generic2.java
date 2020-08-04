package Generic;
//Generic2

class StudentInfo{
	public int grade;
	StudentInfo(int grade){
		this.grade = grade;
	}
}

class EmployeeInfo{
	public int rank;
	EmployeeInfo(int rank){
		this.rank = rank;
	}
}

/*
 * 중복을 없애기 위해 StudentInfo와 EmployeeInfo모두를 받을 수 있는 공통분모를 
 * 찾아야 하는데, 공통분모가 마땅치 않은 관계로 모든 클래스의 조상인 Object를 사용한 것
 */
class Person1{
	public Object info; 
	Person1(Object info){
		this.info = info;
	}
}

public class Generic2 {
	public static void main(String[] args) {
		Person1 p1 = new Person1("부장");
		EmployeeInfo ei = (EmployeeInfo)p1.info;
		System.out.println(ei.rank);
	}
}
/*
 * java.lang.ClassCastException
 *  : java.lang.String cannot be cast to EmployeeInfo 발생
 * --> runtime 중에 발생하는 예외로 compile할때는 예외 발생X 
 * 이와 같이 모든 타입이 올 수 있기 때문에 타입을 엄격하게 제한할 수 없는 상황을 
 * 두고 "type이 안전하지 않다"고 함 -> 타입 안정성(Type safety)이 낮음
 */