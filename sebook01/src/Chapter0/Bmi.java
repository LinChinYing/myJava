package Chapter0;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bmi {

	private static final DecimalFormat DF = new DecimalFormat("0.00"); 
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入身高： ");
		double height = scn.nextDouble() / 100;
		System.out.print("請輸入體重： ");
		double weight = scn.nextDouble();
		double bmi = Double.parseDouble(DF.format(weight / (height * height)));
		System.out.println("你的BMI： " + bmi);
		
		
		if(bmi < 18.5) {
			System.out.println("過瘦");
		}else if(bmi < 24) {
			System.out.println("剛好");
		}else {
			System.out.println("過胖");
		}
	}

}
