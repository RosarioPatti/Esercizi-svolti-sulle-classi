package it.exercise1.start;

import java.util.Scanner;

import it.exercise1.handlercalculation.HandlerOperation;

public class TestExercise1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserire uno dei seguenti valori operation(+,x,/,-)-->");
		String operation = scan.nextLine();
		HandlerOperation ho = new HandlerOperation();
		System.out.println("Inserire un numero a ");
		int a = scan.nextInt();
		System.out.println("Inserire un secondo numero b:");
		int b = scan.nextInt();
		
		if (operation.equalsIgnoreCase("+") || operation.equalsIgnoreCase("somma")
				|| operation.equalsIgnoreCase("addizione")) {

			System.out.println("The sum of (" + a + "+" + b + ")=" + ho.somma(a, b));
		}
		if (operation.equalsIgnoreCase("x") || operation.equalsIgnoreCase("*")) {
			System.out.println("The product between a and b (" + a + "x" + b + ")=" + ho.moltiplicazione(a, b));

		}
		if (operation.equalsIgnoreCase(":") || operation.equalsIgnoreCase("/")
				|| operation.equalsIgnoreCase("divisione")) {
			System.out.println("The divisione between a and b (" + a + "x" + b + ")=" + ho.divisione(a, b));

		}
		if (operation.equalsIgnoreCase("-") || operation.equalsIgnoreCase("sottrazione")) {
			System.out.println("The divisione between a and b (" + a + "x" + b + ")=" + ho.divisione(a, b));

		}

		scan.close();
	}

}
