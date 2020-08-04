package ControlStatement;

public class Last_AuthApp_v2 {
//사용자의 이름뿐만 아니라 비밀번호까지 확인하는 기능 추가
	public static void main(String[] args) {
//		String[] users = {"younghyun", "hyewon", "egoing"};

		String[][] users = {
				{"younghyun", "1234"},
				{"hyewon", "2222"},
				{"egoing", "1111"}
		};

		//users의 원소가 배열이고 각각의 배열의 원소값이 string인 데이터
		String inputID = args[0];
		String inputPW = args[1];
		boolean isLogined = false;
		for(int i = 0; i < users.length; i++) {
			String[] current = users[i];
			if(current[0].equals(inputID) && current[1].equals(inputPW)) {
				isLogined = true; //flag 변수
				break;
			}
		}
		System.out.println("Hi, ");
		if(isLogined) {
			System.out.println("Master!!");
		}else {
			System.out.println("Who are you?");
		}

	}

}
