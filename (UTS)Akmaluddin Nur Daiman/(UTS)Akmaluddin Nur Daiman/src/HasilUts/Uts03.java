package HasilUts;

import java.util.Scanner;

public class Uts03 {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  int n;

		  System.out.print("n = ");
		  n = input.nextInt();

		  for (int i = 1; i <= n; i++) {
		   int x = (i * 6) - 3;
		   System.out.print(x + " ");
		   
		   
		  }
	}
}
