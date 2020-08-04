package ControlStatement;

public class Last_AuthApp_v1 {
//사용자가 로그인했을때 명단에 있는지 확인해주는 기능 포함
	public static void main(String[] args) {
		String[] users = {"younghyun", "hyewon", "egoing"};
		String inputID = args[0];
		
		boolean isLogined = false;
		for(int i = 0; i < users.length; i++) {
			String currentID = users[i];
			if(currentID.equals(inputID)) {
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
