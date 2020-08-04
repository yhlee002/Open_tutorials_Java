package Accessmodifier;

//클래스 멤버에 대한 접근 제어자
class Testaccess{
	public void publicA(){
		System.out.println("method public A");
	}
	void defaultA(){
		System.out.println("method default A");
	}
	private void privateA() {
		System.out.println("method private A");
	}
	protected void protectedA() {
		System.out.println("method protected A");
	}
	public void callmethod() {//같은 클래스 내의 메소드는 모두 호출 가능
		publicA();
		defaultA();
		privateA();
		protectedA();
	}
}

//같은 package내에서는 private메소드를 제외하고는 모두 호출 가능
public class Accessmodifier2 {
	public static void main(String[] args) {
		Testaccess ac1 = new Testaccess();
		ac1.publicA();
		ac1.defaultA();
//		ac1.privateA();
		ac1.protectedA();
	}
}

//같은 package내에서 (상속받은) 하위 클래스에서는 private메소드를 제외하고는 모두 호출 가능 
//다른 package에서 (상속받은) 하위 클래스에서는 public과 protected메소드만 호출 가능(default메소드는 같은 패키지에서만 호출 가능)
class Testaccess2 extends Testaccess{
	public Testaccess2(){
/*	this는 일차적으로는 클래스 자기 자신을 의미하나 그 클래스가 상속을 받은 하위클래스이고 
 * 	그 클래스가 자체적으로 가지고 있는 메소드나 필드가 존재하지 않는다면 자바는 상위 클래스에서 메소드를 조회	 */	
		this.publicA();
		this.defaultA();
// 		this.privateA();
		this.protectedA();
		
//	Testaccess ac2 = new Testaccess();
//	ac2.publicA();
//	ac2.defaultA();
//	ac2.privateA(); --> 오류 발생
//	ac2.protectedA();
	}
}

//다른 package의 (상속관계가 아닌)클래스에서는 public 메소드만 호출 가능(상속받지 않으면 protected메소드 호출 불가)

/*
 * 클래스에 대한 접근 제어자 (public / default)
 * 앞에 접근 제어자를 명시하지 않으면 default클래스.
 * public클래스는 다른 패키지에서도 접근 가능하나 default클래스는 같은 패키지에서만 가능
 */
