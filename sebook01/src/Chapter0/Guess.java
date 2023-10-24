package Chapter0;

import java.util.Random;
import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int min = 0;
		int max = 100;
		Random r = new Random();
		int secret = r.nextInt(max - min) + min;
		System.out.println("終極密碼是：" + secret);
		
		while(true) {
			System.out.print("請輸入" + min + "與" + max +"之間的數字：");
			int guess = scn.nextInt();
			
			if(guess < min || guess > max) {
				System.out.println("別超出範圍");
				continue;
			}
			
			if(guess == secret) {
				System.out.println("答對了，終極密碼是：" + secret);
				scn.close();
				break;
			}else if(guess < secret) {
				min = guess;
			}else {
				max = guess;
			}
		}
		
	}

}
