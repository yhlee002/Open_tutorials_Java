package Object;

//Object1 ; Object & toString()

//Object : 모든 클래스들의 조상(공통분모)
//모든 클래스는 사실 Object를 암시적으로 상속받음
class Calculator { // = 'class O extends Object{}'
	int left,right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public int _cal() {
		return this.left + this.right;
	}
	public void sum() {
		System.out.println(_cal());
	}
	public void avg() {
		System.out.println(_cal()/2);
	}
	public String toString() {
		return super.toString()+"left : "+this.left+", right : "+this.right;
	}
} 
//toSting() : 객체를 문자로 표현하는 메소드(@앞은 인스턴스의 클래스, @뒤의 내용은 객체의 인스턴스의 고유한 식별값)
public class Object1_Object_toString {
	public static void main(String[] args) {
		Calculator c1 = new Calculator(); 
		c1.setOprands(10, 20);
		System.out.println(c1);
		System.out.println(c1.toString());
		//toString()은 Object의 메소드로 Object를 상속받는 모든 클래스에서 사용 가능
		//toString()은 직접 호출하지 않아도 어떤 객체를 System.out.println()으로 호출하면 자동 호출된다.
		//toString()에 마우스를 대고 ctrl을 누르고 있으면 목록이 뜨고 그 중 Open implementation으로 이동하면
		//원래 구현된 Object클래스에서의 toString()위치로 이동할 수 있음(메소드 원형을 볼 수 있음)
	}
}
