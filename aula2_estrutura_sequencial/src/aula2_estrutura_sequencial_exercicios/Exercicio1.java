package aula2_estrutura_sequencial_exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*Faça um programa para ler dois valores inteiros, e depois mostrar a soma desses números com uma mensagem explicativa, conforme exemplos:
		 * 
		 *  Entrada - 10 30 -> Saída SOMA  = 40*/
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int soma = x + y;
		
		System.out.println("Soma = " + soma);
		
		
		sc.close();

	}

}
