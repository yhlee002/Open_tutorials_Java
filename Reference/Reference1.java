package Reference;

//복제와 참조의 차이
class A {
	public int id;
	A(int id){
		this.id = id;
	}
}
public class Reference1 {
	//기본 데이터형을 담는 변수끼리는 복제가 발생(a의 값이 복제되어 b에 들어감) -->비유 : 실제 파일을 복사한 것
	public static void runValue() {
		int a = 1;
		int b = a;
		b = 2;
		System.out.println("runValue(), a : "+a);
	}
	
	//new를 통해 생성되는 (기본 데이터형이 아닌 데이터를 담는) 변수끼리는 참조가 발생 -->비유 : 원본 파일은 하나고 그에 대한 바로가기를 생성한 것
	//'A a = new A(1)'를 통해 id값이 1인 A인스턴스가 생성되고 a는 이 A인스턴스를 식별할 수 있는 주소값을 저장
	//'A b = a'를 통해 b는 a가 가리키고 있는 위치 정보(주소)를 가지게 되는 것
	//'b.id = 2'로 인해 b가 참조하는 A인스턴스의 id값이 변경되면서 a역시 변화된 id값을 표시하게 된 것
	public static void runReference() {
		A a = new A(1);
		A b = a;
		b.id = 2;
		System.out.println("runReference(), b.id : 2, a.id : "+a.id);
	}
	
	//새로운 인스턴스를 만들어 그 것을 참조함으로써 기존 인스턴스를 참조하는 a와는 값이 연동되지 않음
	public static void runNewInstance() {
		A a = new A(1);
		A b = a;
		b = new A(2);
		System.out.println("runNewInstance(), b.id : 2, a.id : "+a.id);
	}
	
	public static void main(String[] args) {
		runValue();
		runReference();
		runNewInstance();
	}

}
