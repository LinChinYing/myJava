package sebook01;

import java.util.Scanner;

public class ex04 {
	int pass = 60;//var不能在這宣告，不可以是類別成員，只能是區域變數
	//var price = 50;//會出錯
	public static void main(String[] args) {
		var score = 86;//要宣告同時給值
		//宣告方法時傳回值不能是var
		
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入資料：");
		var inputData = scn.next();//一開始不預設型別，儲存時給系統決定
		System.out.println("你輸入的資料是" + inputData);
		scn.close();
		
		
		
	}

}
