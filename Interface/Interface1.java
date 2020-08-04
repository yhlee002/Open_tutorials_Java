package Interface;

public interface Interface1 {
	public void z(); //추상 클래스의 추상 메소드와 같은 형태
}

class A implements Interface1{ //"class A는 interface1를 '구현'한다."
	public void z() {}//실제 로직(메소드 바디)를 작성해야함
}

//-------------------------
interface I1{
	public void x();
}
interface I2{
	public void y();
}

//하나의 class는 여러개의 interface를 구현할 수 있다.
class B implements I1, I2{
	public void x() {}
	public void y() {}
}
//interface도 상속이 된다.
interface I3{
	public void a();
}
interface I4 extends I3{
	public void b();
}

class InheritanceI implements I4{
	public void a() {}
	public void b() {}
}