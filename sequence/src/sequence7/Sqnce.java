package sequence7;

public class Sqnce {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println();
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "\t");
			}
		}
		for (int i = 4; i >= 1; i--) {
			System.out.println();
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "\t");
			}
		}
	}
}