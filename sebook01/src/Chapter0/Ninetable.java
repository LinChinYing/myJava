package Chapter0;

public class Ninetable {
	
	public static void ninetable() {
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
	}
	
	public static void main(String[] args) {
	    ninetable();
	}

}
//1 * 1 = 1
//1 * 2 = 2
//1 * 3 = 3
//1 * 4 = 4
//1 * 5 = 5
//...
//9 * 9 = 81