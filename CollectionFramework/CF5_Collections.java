package CollectionFramework;
//Collections클래스와 정렬

import java.util.*;

class Computer implements Comparable{
	int serial;
	String owner;
	Computer(int serial, String owner){
		this.serial = serial;
		this.owner = owner;
	}
	@Override
	public int compareTo(Object o) {
		return this.serial - ((Computer)o).serial;
	}
	public String toString() {
		return serial+" "+owner;
	}
	
}

public class CF5_Collections {
	public static void main(String[] args) {
		List<Computer> computers = new ArrayList<Computer>();
		computers.add(new Computer(500, "egoing"));
		computers.add(new Computer(200, "leezche"));
		computers.add(new Computer(3233, "graphittie"));
		Iterator i = computers.iterator();
		System.out.println("before");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		Collections.sort(computers);
		System.out.println("after");
		i = computers.iterator();
		while(i.hasNext()) {
			System.out.println(i.next()); 
			//i의 값을 하나씩 꺼내어 그 값을 toString()한 것을 println한 것.
			//toString()은 객체명@식별값의 형태로 출력되므로 이를 오버라이딩 할 수 있음(ln16-18)
		}
	}
}
