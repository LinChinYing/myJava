package sebook01;

public class ex10 {

	public static void main(String[] args) {
		long num = 2147483648L;//最後要加L不然會出錯，系統預設是int
		float pi = 3.14F;//要加上F不然會出錯，系統預設為double
		float pi2 = (float)3.14;//強制型別轉換
		int pi3 = (int)3.14;//強制型別轉換
		
		int sum;
		float score1 = 60.5F;
		long score2 = 100;
		sum = (int)score1;//強制型別轉換
		System.out.println("sum = "+ sum);
		sum = (int)(score1 + score2);//強制型別轉換
		System.out.println("sum = "+ sum);
		
		
	}

}
