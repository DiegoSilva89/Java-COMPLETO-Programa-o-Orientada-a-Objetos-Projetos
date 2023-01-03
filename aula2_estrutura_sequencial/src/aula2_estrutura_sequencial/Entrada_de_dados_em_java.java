package aula2_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner; // É preciso importar para utilizar o Scanner

public class Entrada_de_dados_em_java {

	public static void main(String[] args) {
		
		//Para fazer entrada de dados, nós vamos criar um objeto do tipo "Scanner" da seguinte forma:
		
		Locale.setDefault(Locale.US);// utilizado para reconhecer o ponto como separador de decimal
		Scanner sc = new Scanner(System.in); // Esta é uma forma do java associar a variável com a entrada de dados padrão (teclado)
		
		//Entrada de String
		String x;
		x = sc.next(); //sc.next() permite que a palavra digitada seja armazenada na variável x do tipo String
		
		//Entrada de Int
		int y;
		y = sc.nextInt(); // para armazenar uma variavel digitada que seja do tipo int, é preciso utilizar o sc.nextInt()
		
		//Entrada de Double
		double z;
		z = sc.nextDouble(); // utilizado para armazenar números decimais digitados
		
		//Entrada de caractere
		char c;
		c = sc.next().charAt(0); //Para ler caractere, é preciso inlcuir o charAt(0) ao sc.next(), assim mesmo que difitemos uma palavra, somente a primeira letra será armazenada na variável
		
		//Para ler vários dados na mesma linha
		String d;
		int e;
		double f;
		
		d = sc.next();
		e = sc.nextInt();
		f = sc.nextDouble();
		
		System.out.println("Você digitou: " + x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(c);
		
		System.out.println("Dados digitados: ");
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		
		sc.close(); // este objeto fecha o scanner para quando não for mais utilizado

	}

}
