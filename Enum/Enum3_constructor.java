package Enum;

enum Fruit3{ //상수뿐만 아니라 변수와 메소드도 가질 수 있다.
	APPLE("red", 3), PEACH("pink", 8), BANANA("yellow",5); //한 줄만 작성할때는 ;생략 가능한듯(enum기준)
//상수 뒤의 괄호는 생성자를 호출하는 기능을 수행하고 그 안의 값은 인자로서 매개변수에 전달될 값이 들어감
	private String color; //변수에 직접적인 접근을 막기 위해 private제어자로 정의
	private int number;
	Fruit3(String color, int number) { //생성자
		System.out.println("Call Constructor "+this); 
		this.color = color;
		this.number = number;
	}
	public String getColor() {
		return this.color;
	}
	public int getNumber() {
		return this.number;
	}
//상수의 인스턴스를 생성할때마다 위의 생성자가 호출된 것(세 인스턴스 모두 같은 기능 수행)
}
enum Company3{
	GOOGLE, APPLE, ORACLE
}
public class Enum3_constructor {
	public static void main(String[] args) {
//		Fruit3 type = Fruit3.APPLE;
//		switch(type) {
//		case APPLE : System.out.println(57+" kcal, color : "+Fruit3.APPLE.getColor());
//			break;
//		case PEACH : System.out.println(34+" kcal, color : "+Fruit3.PEACH.getColor());
//			break;
//		case BANANA : System.out.println(93+" kcal, color : "+Fruit3.BANANA.getColor());
//			break;
//		}
		for(Fruit3 f : Fruit3.values()) { //배열처럼 상수들을 하나씩 꺼내 사용할 수 있다는 것이 특징
			System.out.println(f+"은 "+f.getColor()+"색이며 총 "+f.getNumber()+"개 입니다.");
		}
	}
}
