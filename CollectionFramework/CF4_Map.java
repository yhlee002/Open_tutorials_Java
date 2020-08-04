package CollectionFramework;
//Collections Framework4_Map
//Map 컬렉션은 key와 value의 쌍으로 값을 저장하는 컬렉션

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class CF4_Map {
	public static void main(String[] args) {
		HashMap<String, Integer> a = new HashMap<String, Integer>();
		a.put("one", 1);
		a.put("two", 2);
		a.put("three", 3);
		a.put("four", 4);
		System.out.println(a.get("one"));
		System.out.println(a.get("two"));
		System.out.println(a.get("three"));
		
		iteratorUsingForEach(a);
		iteratorUsingIterator(a);
	}
	//Map에는 자체적으로 iterator기능이 없기 때문에 Set 안에 개체(entry)를 넣어서 그 키는 getKey, 그 값은 getValue를 통해 얻음
	static void iteratorUsingForEach(HashMap map) {
		//String은 getKey()가, Integer는 getValue()가 가질 데이터 타입
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		/*
		 * entrySet()을 이용함으로써 Map에 대응되는 Set 데이터 타입의 개체가 리턴되어 변수 entries에 담김
		 * (Map인터페이스 내부의에 있는) Entry라는 인터페이스를 구현하는 객체가 Set 컨테이너 안에 들어가게 됨
		 * Map.Entry라는 인터페이스에는 중요한 두가지의 메소드가 정의되어 있음(getKey(), getValue())
		*/
		for(Map.Entry<String, Integer>entry : entries) {
			//for문의 ':'뒤에 entries가 오게 되어, entries의 값들이 entry에 들어가게 되고, entry는 for문에 들어가 
			//getKey()에 의해 key를 하나씩 꺼내고, getValue()에 의해 value를 하나씩 꺼내어 처리
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
	
	static void iteratorUsingIterator(HashMap map) {
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		Iterator<Map.Entry<String, Integer>> i = entries.iterator();
		while(i.hasNext()) { //hasNext()에 의해 i의 값이 존재할때 true
			Map.Entry<String, Integer> entry = i.next(); //next()에 의해 i의 값이 하나씩 꺼내지면 이를 entry라는 변수에 넣음(키, 값이 함께)
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
	}
}
