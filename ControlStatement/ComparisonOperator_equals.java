package ControlStatement;

public class ComparisonOperator_equals {
//== vs equals에 대한 내용
	public static void main(String[] args) {
		int p1 = 1;
		int p2 = 1;
		System.out.println(p1 == p2);
		String a1 = "java"; //만약 String a2 = "java";라는 코드가 더해지면 a1 == a2는 true
		String a2 = new String("java"); //하지만 이 코드는 새로은 java라는 값을 새로운 곳에 만드는 코드이므로 a1 == a2는 false가 됨
		//-->이 경우 a1.equals(a2);가 사용되어야 함
		System.out.println(a1 == a2); //false
		
		/*cf.동등 비교 연산자는 두 변수의 값이 같은 곳에 위치하는 가를 비교하는 기능 수행
		원시데이터 타입을 비교할때는 동등 비교 연산자를 사용하면 됨(원시 데이터는 equals 메소드를 가지고 있지도 않음)
		반면에, equals는 두 변수의 값의 내용이 같은지를 비교하는 메소드로 원시데이터를 사용하는게 아니라면 equals를 사용하면 됨*/
		/*cf.이전 수업 과정(ConditionalStatement_ifApp)에서 인자(입력값)를 받을때 둘의 값이 모두 dldudgus214임에도 불구하고
		  ==가 false값이 나옴. 이는 내부적으로 다른 곳에 저장된 데이터라서 일 수 있으니 그냥 equals를 사용하면 됨*/
	}

}
