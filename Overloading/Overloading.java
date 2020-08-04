package Overloading;

/*
 * Overloading : 클래스에 메소드를 정의할때 같은 이름이지만
 * 서로 다른 매개변수의 형식을 가진 메소드 여러개를 정의할 수 있는
 * 방법. Java에서는 메소드의 이름이 같더라도 매개변수의 개수나
 * 매개변수의 데이터 타입이 다르면 다른 메소드로 간주.
 * 오버로딩의 조건 : 
 * 메소드의 이름은 같고, 매개변수는 달라야 하지만 return값(void, int, ...)은 같아야 함
 * + (메소드 이름과 return값 같은 상태로)매개변수의 이름을 다르게 하는 방법으로는 메소드 오버로딩 불가능
 * 상속받는 클래스가 상위 클래스의 메소드와 메소드의 이름, 매개변수의 형식, return값이 같고 내용만 다른 메소드를 만드는 것은 Overriding
*/
class calculator{

	int x, y;
	int z = 0;
	//x와 y값은 최소한으로 입력해야 하는 값이지만 z는 입력되지 않을 수도 있으므로 변수의 값이 제때 초기화가 되지 않을 경우 오류 발생
	public void setOprands(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void setOprands(int x, int y, int z) { //위 메소드와 달리 3개의 매개변수를 받음
//		this.x = x;
//		this.y = y;
		this.setOprands(x, y);
		this.z = z;
	}
	public void sum() {
		System.out.println("합한값 : "+(x+y+z));
	}
	public void avg() {
		System.out.println("평균값 : "+(x+y+z)/3); //2개의 값을 입력하면 2로, 3개의 값을 입력하면 3으로 나누는 방법은?
	}
}
public class Overloading {

	public static void main(String[] args) {
		calculator c1 = new calculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();

	}

}
