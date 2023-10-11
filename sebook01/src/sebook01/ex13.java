package sebook01;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
//		String num1 = "1.25";
//		String num2 = "2";
//		System.out.print(Double.parseDouble(num1)+Short.parseShort(num2));
//		System.out.print(Double.valueOf(num1)+Short.valueOf(num2));
		
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入姓名；");
		String name = scn.nextLine();
		System.out.printf("Hi! %s !%n",name);
		System.out.print("請輸入兩個整數，中間用空白間隔；");
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		System.out.printf("%d 除以 %d 商為 %d 餘數 %d%n",num1,num2,
				num1/num2,num1%num2);
		scn.close();
		
		
		
		
		
	}

}
