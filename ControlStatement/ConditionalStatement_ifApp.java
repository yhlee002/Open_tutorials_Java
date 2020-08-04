package ControlStatement;

import javax.swing.JOptionPane;

public class ConditionalStatement_ifApp {
 //로그인하는 어플리케이션 만들기(생활코딩 수업에서는 authApp이란 이름으로 진행됨)
	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("ID");
		String pw = JOptionPane.showInputDialog("Password");
		
//		if(id.equals("dldudgus214")) { //id == " "은 틀린 형태(다음 수업 내용인 ComparisonOperator_equals 살펴보기
//			String pw = JOptionPane.showInputDialog("Password");
//			if(pw.equals("1111")) {
//			System.out.println("Hi, master.");
//			}else {
//				System.out.println("Wrong 'password'. Who are you?");
//			}
//		}
//		else {
//				System.out.println("Wrong 'id'. Who are you?");
//			}
		if(id.equals("dldudgus214")&& pw.equals("1111")) {
			System.out.println("Hi, master.");
		}else {
			System.out.println("Wrong 'id' or 'password'. Who are you?");
		}
		
	}

}
