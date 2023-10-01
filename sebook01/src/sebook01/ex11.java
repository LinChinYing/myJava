package sebook01;

public class ex11 {

	public static void main(String[] args) {
		
		int[] n;//在stack記憶體有個位置，儲存heap記憶體位置
		n = new int[] {1,2,3};//在heap記憶體有個位置儲存值
		int[] a = n ;//a儲存的記憶體位置與n的記憶體位置相同
		System.out.println("a[0]="+ a[0] +"\ta[1]=" + a[1] + "\ta[2]="+ a[2] );
		System.out.println("n[0]="+ n[0] +"\tn[1]=" + n[1] + "\tn[2]="+ n[2] );
		a[1] = 15;
		System.out.println("---------------------");
		System.out.println("a[0]="+ a[0] +"\ta[1]=" + a[1] + "\ta[2]="+ a[2] );
		System.out.println("n[0]="+ n[0] +"\tn[1]=" + n[1] + "\tn[2]="+ n[2] );
		
		
		
	}

}
