package sebook01;

public class ex08 {

	public static void main(String[] args) {
		
		boolean a = true, b = false;
		boolean c = a & b;//c = false
		c = a | b;//c = true
		c = a ^ b;//c = true
		c = !a ;//c = false
		c = a && b;//c = false
		c = a || b;//c = true
		/*
		 * a		b		a&b		a|b		a^b		!a
		 * true		true	true	true	false	false	
		 * true		false	false	true	true	false
		 * false	true	false	true	true	true
		 * false	false	false	false	false	true
		 */
		//& &&結果都相同，&&只要滿足條件就不做後面的運算
		//| ||結果都相同，||只要滿足條件就不做後面的運算
		int d=1,e=1,f=1;
		System.out.println("d = " + d + ", e = " + e + ", f = " + f );
		System.out.println("d=e | d=f = " + (d==e | d==f));
		System.out.println("d>e && d++>f = " + (d>e && d++>f));//沒有執行d++，d=1
		System.out.println("d=e || d=f = " + (d==e || d==f));//不會執行d==f
		System.out.println("d = " + d + ", f = " + f);
		System.out.println("d>e & d++>f = " + (d>e & d++>f));
		System.out.println("d = " + d + ", f = " + f);
		
		int z = 50;
		z += 100%5 + 10*2;
		//z = z + 100%5 + 10*2;
		
		System.out.println(z);
		
	}

	
}
