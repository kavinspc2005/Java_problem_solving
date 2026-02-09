package Pattern;

import java.util.Scanner;

public class HalfDiamond {
	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			for(int i = 1; i <= n; i++) {
			    System.out.println("*".repeat(i));
			}

			for(int i = n - 1; i >= 1; i--) {
			    System.out.println("*".repeat(i));
			}
		}
    }
}
