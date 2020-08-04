package Constructor;

public class Constructor2 {
//상속과 생성자
	/* main method에서 클래스를 인스턴스화 하는 방식.error 발생X
	 * 어떠한 생성자도 존재하지 않으므로 자바는 자동으로 기본 생성자를 만들어줌.
	 * 기본 생성자는 클래스명과 같으면서 매개변수가 없는 메소드(내용도 비어있음)
	 * public static void main(String[] args) {
	 * Constructor2 c = new Constructor2();
	   }
	 */
	
	/*
	 * 생성자가 매개변수를 가지는 이 생성자가 기본 생성자가 아님을 의미. 이때에는 인스턴스화 하면 error발생
	 * 매개변수가 있는 생성자를 정의하고 있음.
	 * 어떤 생성자가 개발자에 의해서 명시되게 되면 자바는 기본 생성자를 자동으로(암시적으로) 만들어주지 않음.
	 * 이러한 상태에서 인스턴스화를 할 경우 생성자가 호출되어야 하는데 호출할 기본 생성자가 없기 때문에 error.
	 */
	public Constructor2() { //원래 모습 : public Constructor2(int param1){
	}
	public static void main(String[] args) {
		Constructor2 c = new Constructor2(); 
		/*new Constructor2()에 의해서 (매개변수가 없는)생성자가 호출이 되어야 하는데,
		 *매개변수가 있는 생성자가 이미 존재하여 자바가 이를 자동적으로 만들어 주지 않기 때문에
		 *호출할 기본 생성자가 존재하지 않아서 error 발생.이를 해결하기 위해서는 매개변수가 없는
		 *기본 생성자를 명시적으로 선언해주면 new Constructor2라는 생성자가 호출될때
		 *명시적으로 명시적으로 생성해준 생성자의 정의가 실행이 되기 때문에 error 발생X
		*/
	}
}
