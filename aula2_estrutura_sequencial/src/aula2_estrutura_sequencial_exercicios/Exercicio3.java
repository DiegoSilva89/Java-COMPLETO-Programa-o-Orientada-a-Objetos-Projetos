package aula2_estrutura_sequencial_exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int R = (A * B) - (C * D);
		
		System.out.println("DIFERENÇA = " + R);
		
		sc.close();

	}

}
