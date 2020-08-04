package Interface;

/*
 * CalculatorConsumer와 Calculator의 인터페이스
 * 모든 interface의 멤버는 public이어야함
 * (접근 제어자 생략시 default가 아닌 public이 되는 것이 기존의 메소드, 클래스와의 차이)
 */
public interface Calculatable { //public을 생략해도 (public) interface로 인식됨
	public void setOprands(int first, int second, int third);
	public int sum();
	public int avg();
}
