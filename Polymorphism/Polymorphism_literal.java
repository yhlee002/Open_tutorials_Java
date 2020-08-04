package Polymorphism;

interface father {}
interface mother {}
interface believer{}
interface programmer {
	public void coding();
}

class Steve implements father, believer, programmer{
	public void coding() {
		System.out.println("fast");
	}
}

class Rachel implements mother, programmer{
	public void coding() {
		System.out.println("elegance");
	}
}


public class Polymorphism_literal { //Workspace라는 객체(클래스)라고 생각하기
	public static void main(String[] args) {
	programmer employee1 = new Steve();
	programmer employee2 = new Rachel();
	
	employee1.coding();
	employee2.coding();
	}
}