package ControlStatement;

public class LoopApp {

	public static void main(String[] args) {

		System.out.println(1);
		System.out.println("====while====");
		int i = 0;
		while(i < 3) { //while : 자유도가 높지만 원시적
			System.out.println(2);
			System.out.println(3);
//			i = i + 1;
			i++;
		}
		//while문 : 반복문의 주요 세 가지 요소들이 뿔뿔히 흩어져 있기 때문에 코드의 의도나 관련성을 파악하기 어렵고, 변질되기 쉬움
		
		System.out.println("=====for=====");
		for(int j = 0; j < 3; j++) { 
			System.out.println(2);
			System.out.println(3);
		}
		//for문 : 반복문의 주요 세 가지 요소들이 하나로 packaging되어 있기 때문에 코드의 의도나 관련성을 파악하고, 변질됨을 방지하는데 있어서 유용
		
		System.out.println("==============");
		System.out.println(4);
	}

}
