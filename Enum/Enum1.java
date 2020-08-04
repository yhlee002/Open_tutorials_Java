package Enum;

//Enum의 유래
class Fruit{ //상수를 만들되, 자기 자신의 데이터 타입을 가지고 자기 자신을 인스턴스화 한 값을 가짐
	public static final Fruit APPLE = new Fruit();
	public static final Fruit PEACH = new Fruit();
	public static final Fruit BANANA = new Fruit();
}
class Company{
	public static final Company GOOGLE = new Company();
	public static final Company APPLE = new Company();
	public static final Company ORACLE = new Company();
}

public class Enum1 {

	public static void main(String[] args) {
//		if(Fruit.APPLE == Company.APPLE) { 
//		incompatiable operand types Fruit and Company : 두 값이 성질이 달라 비교가 불가능함을 의미
//			System.out.println("과일 애플과 회사 애플이 같다.");
//		}
//	
//		Fruit type = Fruit.APPLE;
//		switch(type) { --> 데이터 타입(Fruit)때문에 오류 발생
//		swith문에는 제한된 데이터 타입만을 사용 가능(byte, short, char, int, enum, String, Character, Byte, Short, Integer) 
//		case Fruit.APPLE:System.out.println(57+" kcal");
//			break;
//		case Fruit.PEACH:System.out.println(34+" kcal");
//			break;
//		case Fruit.BANANA:System.out.println(93+" kcal");
//			break;
//		}
	}

}
