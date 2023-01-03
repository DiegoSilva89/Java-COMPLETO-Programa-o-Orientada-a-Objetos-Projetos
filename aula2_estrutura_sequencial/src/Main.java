import java.util.Locale;

public class Main {

	public static void main(String[] args) {
	
		System.out.print("Olá mundo!");
		System.out.println("Boa noite"); // diferenca entre print e println, println inicia o texto seguinte em outra linha

		int y = 32; //declaracao de variavel int
		System.out.println(y); //comando de saida de dados da variavel y
		
		double x = 10.35784; //declaracao de variavael double
		System.out.println(x);  //comando de saida de dados da variavel x
		System.out.printf("%.2f%n", x); /*comando de saida com limite de duas casas decimais, 
		para isso utilizamos o "%\.2f...3f...4f" e etc, o %n serve para quebra de linha e apos a 
		virgula indicamos a variavel*/
		System.out.printf("%.4f%n", x); //outro exemplo com 4 casas
		
		Locale.setDefault(Locale.US); //comando para utilizar separador de casa decimal para o padrao americano, importando a classe necessaria
	
		System.out.printf("%.4f%n", x); //exemplo com separador americano
		
		System.out.println("RESULTADO = " + x + " METROS"); //exemplo com concatenacao com o operador +
		System.out.printf("RESULTADO = %.2f metros%n", x); //para concatenar varis elementos em um mesmo comando de escrita
	
		/*Para concatenar varios elementos em um mesmo comando de escrita com string, int e double, cada um com seu marcador*/
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n%n", nome, idade, renda);
		
		/* os marcadores são:
		 * 
		 * %f = ponto flutuante
		 * %d = inteiro
		 * %s = texto
		 * %n = quebra de linha
		 */
		
		//Exercicio de fixacao
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("%s, which price is $%.2f%n", product1, price1);
		System.out.printf("%s, which price is $%.2f%n", product2, price2);
		
		System.out.println();
		System.out.printf("Record %d years old, code %d and gender: %s%n", age, code, gender);
		System.out.println();
		
		System.out.println("Measue with eight decimal places: " + measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
	
	
	}

}
