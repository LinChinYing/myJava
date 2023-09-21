package sebook01;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入名字：");
		String strName = scn.next();
		System.out.println("Hi"+strName);
		scn.close();
	}

}
