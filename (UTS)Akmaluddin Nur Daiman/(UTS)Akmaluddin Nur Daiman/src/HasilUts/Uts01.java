package HasilUts;

import java.util.Scanner;

public class Uts01 {

	 public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);

	  int value;

	  System.out.print("Silahkan Masukkan Bilangan = ");
	  value = input.nextInt();

	  int j = 0;
	  for (int i = 1; i <= value; i++) {
	   j = j + i;
	   System.out.print(i + " + " + " ");
	  }

	  System.out.println();
	  System.out.println(j + " ");

	 }
	}
    