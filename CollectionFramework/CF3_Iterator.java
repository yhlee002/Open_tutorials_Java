package CollectionFramework;
//Collections Framework3_iterator()

import java.util.HashSet;
import java.util.Iterator;

public class CF3_Iterator {
	public static void main(String[] args) {
		HashSet<Integer> A = new HashSet<Integer>(); 
		//가급적이면 데이터 타입으로 상위 데이터 타입인 Collection을 쓰는 것을 추천(Set, List 모두로 바꿀 수 있음)
		A.add(1);
		A.add(2);
		A.add(3);
		
		//Iterator는 Interface
		Iterator hi = A.iterator(); //Iterator타입의 hi는 A의 참조값을 가지는 것.
		while(hi.hasNext()) {
			System.out.println(hi.next()); //hi라는 객체의 내부에서 값이 하나 사라질뿐. A에서는 사라지지 않음
		}
	}
}

//.hasNext() : 원소(값)이 존재하는지 확인
//.next() : 들어있는 값(원소) 중에 하나를 리턴하고 iterator 내부에서는 그 값이 사라짐
//ArrayList나 HashSet 모두 Collection 인터페이스를 구현하고 있고, Collection에서는 Iterator라는 API를 통해 반복자를 제공