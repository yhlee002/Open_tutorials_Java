package Overriding;

/*overriding2
 * 상위 클래스 메소드의 형식과 자식의 메소드 형식이 불일치 하는 경우에는
 * 오버라이딩을 할 수 없음(Error발생). 오버라이딩을 하기 위해선 다음의 것들이 같아야 한다.
 * 메소드의 이름, 메소드 매개변수의 숫자(개수)와 데이터 타입, 순서, 메소드의 리턴 타입
 * 위와 같이 메소드의 형태를 정의하는 사항들을 통틀어 메소드의 서명(signature)라고 한다.
 * 즉, 오버라이딩을 하기 위해서는 상위 클래스와 하위 클래스의 해당 메소드의 서명이 같아야 한다.
*/
class Calculator4 {
	int left, right;
 
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	 
	public void sum() {
		System.out.println(this.left + this.right);
	}
	 
	public int avg() {
		return ((this.left + this.right) / 2);
	}
}
	 
class SubstractionableCalculator4 extends Calculator4 {
	public void sum() {
		System.out.println("실행 결과는 "+(this.left + this.right)+"입니다.");
	}
	
	public int avg() {
//		System.out.println((this.left + this.right) / 2);
		return super.avg();//상위 클래스의 avg메소드를 호출하는 명령어
	}
	/*결과적으로 상위 클래스의 메소드 내용을 수정하면 자연스럽게 하위 클래스에서도
	* 수정된 내용이 동일하게 적용되며, 상위 클래스의 기본적인 동작 방법에 부가적인 
	* 동작 방법을 추가해야 한다면 super를 이용해 상위 클래스의 메소드를 호출하고 
	* 그 뒤에 내용을 추가할 수 있다.즉, 상위 클래스의 메소드의 일부분은 그대로 가져다
	* 쓰면서 필요에 따라 일부분은 수정하여 쓰고 싶다면 오버라이딩을 통해 가능.
	*/
	public void substract() {
		System.out.println(this.left - this.right);
	}
}
	 
public class Overriding2 {
	 public static void main(String[] args) {
	 
		 SubstractionableCalculator4 c1 = new SubstractionableCalculator4();
		 c1.setOprands(10, 20);
		 c1.sum();
		 c1.avg();
		 c1.substract();
	 }
	 
}


