package sebook01;

public class ex06 {

	public static void main(String[] args) {
		
		//++a, --a前置式，先加減1再運算
		//a++, a--後置式，先原數值做運算，再加減1
		int a = 10;
		System.out.println("a = " + a);
		int b = a++;
		System.out.println("b = a++ ： a = " + a + ", b = " + b);
		b = ++a;
		System.out.println("b = ++a ： a = " + a + ", b = " + b);
		b = a--;
		System.out.println("b = a-- ： a = " + a + ", b = " + b);
		b = --a;
		System.out.println("b = --a ： a = " + a + ", b = " + b);
		
	}

}
