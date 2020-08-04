package CollectionFramework;
//Collections Framework2_HashSet
//cf.Set : (수학에서의) 집합. 집합에서는 각각의 값이 중복되지 않고 고유하다는 특성이 있음

import java.util.HashSet;

public class CF2_HashSet {
	public static void main(String[] args) {
		HashSet<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		
		HashSet<Integer> B = new HashSet<Integer>();
		B.add(3);
		B.add(4);
		B.add(5);
		
		HashSet<Integer> C = new HashSet<Integer>();
		C.add(1);
		C.add(2);
		
//		System.out.println(A.contatinsAll(B));
		System.out.println(A.containsAll(C));
		
		A.addAll(B);
		A.retainAll(B);
		A.removeAll(B);
		
	}
}
/* HashSet의 메소드
 * .containsAll() : 해당 클래스가 괄호 안의 클래스의 원소 모두를 가질때 true(괄호 안의 클래스가 해당 클래스의 부분집합일때)
 * .addAll() : 괄호안의 집합의 내용(원소)와 해당 집합의 원소를 합쳐서 A로 만듦(합집합)
 * .retainAll() : (retain : 간직하다.)괄호안의 집합과 해당 집합 둘 다에 있는 값만 해당 집합에 담음(교집합으로 해당 집합을 구성)
 * .removeAll() : 해당 집합에서 괄호안의 집합을 빼는 차집합
 */
