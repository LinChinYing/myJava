package sebook01;

//載入套件
import java.util.Scanner;

//主類別，名稱與檔名相同，可以有多個類別，但只有一個是public
public class ex01 {
	// main()方法，程式執行起點，只能用public
	// static表示靜態方法，不用建立實體就可以執行
	// void沒有回傳值
	// String[] args字串陣列引數，可以接受多個引數
	public static void main(String[] args) {

		// 實作一個類別物件，可以接受輸入的字串
		Scanner sca = new Scanner(System.in);
		// 用println方法
		System.out.println("請輸入名字：");
		// 宣告一個字串變數，使用scn.next()方法取得輸入字串
		String strName = sca.next();
		// 用println方法組合
		System.out.println("你好" + strName);
		// 使用close()關閉scn物件
		sca.close();
	}

}
