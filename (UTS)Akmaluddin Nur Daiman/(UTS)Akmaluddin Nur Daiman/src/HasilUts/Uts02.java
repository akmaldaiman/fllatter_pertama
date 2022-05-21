package HasilUts;

import java.util.Scanner;

public class Uts02 {

	 public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);

	  int variabel1;
	  int variabel2;
	  int variabel3;
	  int variabel4;
	  int variabel5;
	  int variabel6;
	  int variabel7;
	  int x;

	  System.out.print("variabel1 = ");
	  variabel1 = input.nextInt();

	  System.out.print("variabel2 = ");
	  variabel2 = input.nextInt();

	  System.out.print("variabel3 = ");
	  variabel3 = input.nextInt();

	  System.out.print("variabel4 = ");
	  variabel4 = input.nextInt();

	  System.out.print("variabel5 = ");
	  variabel5 = input.nextInt();

	  System.out.print("variabel6 = ");
	  variabel6 = input.nextInt();

	  System.out.print("variabel7 = ");
	  variabel7 = input.nextInt();

	  x = variabel1;
	  if (variabel1 > variabel2) {
		  variabel1 = variabel2;
		  variabel2 = x;
	  }

	  x = variabel2;
	  if (variabel2 > variabel3) {
		  variabel2 = variabel3;
	   variabel3 = x;
	  }

	  x = variabel3;
	  if (variabel3 > variabel4) {
		  variabel3 = variabel4;
		  variabel3 = x;
	  }

	  x = variabel4;
	  if (variabel4 > variabel5) {
		  variabel4 = variabel5;
		  variabel5 = x;
	  }

	  x = variabel5;
	  if (variabel5 > variabel6) {
		  variabel5 = variabel6;
	   variabel6 = x;
	  }

	  x = variabel6;
	  if (variabel6 > variabel7) {
		  variabel6 = variabel7;
		  variabel7 = x;
	  }

	  x = variabel1;
	  if (variabel1 > variabel2) {
		  variabel1 = variabel2;
		  variabel2 = x;
	  }

	  x = variabel2;
	  if (variabel2 > variabel3) {
		  variabel2 = variabel3;
		  variabel3 = x;
	  }

	  x = variabel3;
	  if (variabel3 > variabel4) {
		  variabel3 = variabel4;
		  variabel4 = x;
	  }

	  x = variabel4;
	  if (variabel4 > variabel5) {
		  variabel4 = variabel5;
		  variabel5 = x;
	  }

	  x = variabel5;
	  if (variabel5 > variabel6) {
		  variabel5 = variabel6;
		  variabel6 = x;
	  }

	  x = variabel1;
	  if (variabel1 > variabel2) {
		  variabel1 = variabel2;
	   variabel2= x;
	  }

	  x = variabel2;
	  if (variabel2 > variabel3) {
		  variabel2 = variabel3;
		  variabel2 = x;
	  }

	  x = variabel3;
	  if (variabel3 > variabel4) {
		  variabel3 = variabel4;
	   variabel4 = x;
	  }

	  x = variabel4;
	  if (variabel4 > variabel5) {
		  variabel4 = variabel5;
		  variabel5 = x;
	  }

	  x = variabel1;
	  if (variabel1 > variabel2) {
		  variabel1 = variabel2;
		  variabel2 = x;
	  }

	  x = variabel2;
	  if (variabel2 > variabel3) {
		  variabel2 = variabel3;
		  variabel3 = x;
	  }

	  x = variabel3;
	  if (variabel3 > variabel4) {
		  variabel3 = variabel4;
		  variabel4 = x;
	  }

	  x = variabel1;
	  if (variabel1 > variabel2) {
		  variabel1 = variabel2;
		  variabel1 = x;
	  }

	  x = variabel2;
	  if (variabel2 > variabel3) {
		  variabel2 = variabel3;
		  variabel3 = x;
	  }

	  x = variabel1;
	  if (variabel1 > variabel1) {
		  variabel1 = variabel1;
		  variabel2 = x;
	  }

	  System.out.println("Bilangan kedua ialah  = " + variabel6);
	  System.out.println("Ujian Tengah Semester (UTS) : Nata Sukma Nur Safari");

	 }
	}