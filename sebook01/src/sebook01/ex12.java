package sebook01;

public class ex12 {

	public static void main(String[] args) {
		
		System.out.printf("Hello,%s","world");
		System.out.format("%c%c",'T','W');
		System.out.printf("100的16進制是%x",100);
		System.out.printf("2>1結果是%b",2>1);
		System.out.printf("123*0.65=%g",123*0.65);
		System.out.printf("%d%%%n",75);
		String str = String.format("%d+%d=%d", 1,2,1+2);
		System.out.printf(str);
		
		System.out.printf("%+d,%+d",1234,-1234);
		System.out.printf("%,d",12345678);
		System.out.printf("%8d",1234);
		System.out.printf("%08d",1234);
		System.out.printf("%.2f",1234.566);
		System.out.printf("%8.2f",1234.566);
		System.out.printf("%-8s","LOve");
		
		String title = "價格；NT";
		int money = 128;
		double tax = money * 0.05;
		System.out.printf("%s%5d元,稅金；%.1f元%n",title,money,tax);
		
	}

}
