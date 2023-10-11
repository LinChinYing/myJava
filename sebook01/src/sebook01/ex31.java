package sebook01;

import java.util.Scanner;

public class ex31 {

	public static void main(String[] args) {
		
//		int num = 3;
//		String even = "奇數";
//		if(num % 2 ==0) {
//			even = "偶數";
//		}
//		System.out.println(num + "為" + even);
		
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入消費金額；");
		int money = scn.nextInt();
		if(money>1000) {
			money = 1000 + (int)((money-1000)*0.9);
		}
		System.out.printf("實付金額；%d元",money);
		scn.close();
		
	}

}
