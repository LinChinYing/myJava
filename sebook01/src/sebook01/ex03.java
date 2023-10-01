package sebook01;

public class ex03 {

	public static void main(String[] args) {
		
		final double PI = 3.14159;
		int r = 10;
		double length = 2 * r * PI;
		double area = PI * r * r;
		//PI = 3.14//這行會出錯
		final String B_NAME = "基礎必修課";
		final int B_PRICE = 540;
		int num = 2;
		System.out.println(B_NAME + num + "本總計：" + (B_PRICE * num) + "元");
		
	}

}
