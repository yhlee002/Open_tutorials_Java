package Generic;
//Generic4

class EmployeeInfo2{
	public int rank;
	EmployeeInfo2(int rank){
		this.rank = rank;
	}
}

class Person3<T, S>{ //class level(범위;scope)에서 사용되는 generic
	public T info;
	public S id;
	Person3(T info, S id){
		this.info = info;
		this.id = id;
	}
	//method level의 generic(accessmodifier와 return type 사이에 <>(꺽쇠)로 넣을 수 있음
	public <U> void printInfo(U info) { // --> info라는 parameter의 데이터 타입을 아직 명시X
		System.out.println(info);
	}
}

public class Generic4 {
	public static void main(String[] args) {
		EmployeeInfo2 e = new EmployeeInfo2(1);
		Integer i = new Integer(10); 
		Person3 p1 = new Person3(e, i);
		//java는 e가 EmployeeInfo, i가 Integer임을 알 수 있다. 이럴때는 제레릭을 생략하는 것이 가능하다.
		p1.<EmployeeInfo>printInfo(e); //--> EmployeeInfo가 info의 데이터 타입(U)가 됨(e가 EmployeeInfo임을 알기 때문에 생략 가능)
	}
}
