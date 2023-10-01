package sebook01;

public class ex02 {

	public static void main(String[] args) {
		//char = 2 Bytes
		//byte = 1 Byte
		//short = 2 Bytes
		//int = 4 Bytes
		//long = 8 Bytes
		//float = 4 Bytes
		//double = 8 Bytes
		//boolean = 1 Bit
		System.out.println("\'");//單引號
		System.out.println("\"");//雙引號
		System.out.println("\\");//倒斜線
		System.out.println("\n");//下一行
		System.out.println("\f");//下一頁
		System.out.println("\b");//倒退一格
		System.out.println("\t");//下一個水平定位
		System.out.println("\r");//移到本行最前面
		System.out.println("\101");//8進制字元
		System.out.println("\1011");//16進制字元
		System.out.println("How\'re you?\n");
		System.out.println(0b10);//2進制轉10進制
		System.out.println(010);//8進制轉10進制
		System.out.println(0x10);//16進制轉10進制
		System.out.println(1.25e-3);//0.00125
		System.out.println(1.25e3);//1250.0
		//int ages = 18;
		int ages;
		ages = 18;
		int price = 10,qty;
		int price2 = price;
		double height = 178.8;
		float weight = 54.6f;
		char yesOrNo = 'y';
		boolean ok = true;
		int money = 100_000;
		double rate = .01;
		System.out.println("本金" + money + "元，利率" + rate +
				"，年利率為" + money *rate + "元");

	}

}
