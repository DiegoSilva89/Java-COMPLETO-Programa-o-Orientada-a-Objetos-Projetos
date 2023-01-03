package aula2_estrutura_sequencial_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int peca1 = sc.nextInt();
		int quant1 = sc.nextInt();
		double preco1 = sc.nextDouble();
		
		int peca2 = sc.nextInt();
		int quant2 = sc.nextInt();
		double preco2 = sc.nextDouble();
		
		double total = quant1 * preco1 + quant2 * preco2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		
		sc.close();

	}

}
