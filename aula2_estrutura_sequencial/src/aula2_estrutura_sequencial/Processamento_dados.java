package aula2_estrutura_sequencial;

public class Processamento_dados {

	public static void main(String[] args) {
		
		//Aula sobre processamento de dados em java
		
				int x, y, a, c, d;
				double z, b, B, h, area, resultado, e; 
				x = 5; // comando de atribuicao
				y = 2 * x;
				z = 2 * x;
				a = 5;
				c = 2;
				
				b = 6.0; //sempre indicar o tipo do numero se a expressao for de ponto flutuante, para double use: .0 e para float use: f
				B = 8.0;
				h = 5.0;
				
				area = (b + B) / 2.0 * h;
				
				resultado = (double) a / c; // neste caso, incluímos o double para que o java faça o casting, e faça a conversão explicita dos inteiros
				
				e = 5.0;
				d = (int) e; // neste caso utilizamos o casting para que o java mostre o double "e" como um inteiro sem considerar as casas decimais, ja que o java nao faz a conversao
				
				System.out.println(x);
				System.out.println(y);
				System.out.println(z);
				System.out.println(area);
				System.out.println(resultado);
				System.out.println(d);

	}

}
