package OOP;

class pr{
////이 class를 개별적인 file로 만들어도 같은 directory에 있는 한 가져와 사용할 수 있음
//	public String delimiter = ""; 
//	public void A() {
//		System.out.println(delimiter);
//		System.out.println("A");
//		System.out.println("A");
//	}
//	public void B() {
//		System.out.println(delimiter);
//		System.out.println("B");
//		System.out.println("B");
//	}
	

		public String delimiter = ""; //이 delimiter는 인스턴스 변수
		public pr(String delimiter) { //이 delimiter는 constructor의 매개변수
			this.delimiter = delimiter;
			//this : 사용자가 생성한 instance를 가르킴
		}
		public void A() {
			System.out.println(this.delimiter);
			System.out.println("A");
			System.out.println("A");
		}
		public void B() {
			System.out.println(this.delimiter);
			System.out.println("B");
			System.out.println("B");
		}
	
}