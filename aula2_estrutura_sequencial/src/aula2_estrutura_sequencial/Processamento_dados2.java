package aula2_estrutura_sequencial;

import java.util.Scanner;

public class Processamento_dados2 {

	public static void main(String[] args) {
		
		//Continuação da aula "Processamento_dados"
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt(); //utilizando um comando diferente do nextLine e dando quebra de linha, a quebra ficará pendente na entrada padrão, a quebra de linha será absorvida pelo nextLine
		sc.nextLine(); // Este comando resolve o problema de quebra de linha pendente
		s1 = sc.nextLine(); // utilizado para ler um texto até a quebra de linha, sem o Line, o comando irá ler apenas a primeira palavra
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();

	}

}
