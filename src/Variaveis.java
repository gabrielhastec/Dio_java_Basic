public class Variaveis {
    public static void main(String[] args) {

        // Tipo inteiro
        int idade = 25;
        System.out.println("Idade: " + idade);

        // Tipo decimal
        double salario = 3500.50;
        System.out.println("Salário: " + salario);

		// Tipo float
		// É usado para armazenar números decimais menores que os que podem ser armazenados em um double.
		float temperatura = 36.5f; // O 'f' é necessário para indicar que é um float
        System.out.println("Temperatura: " + temperatura + "°C");

        // Tipo caractere
        char letra = 'A';
        System.out.println("Letra: " + letra);

		// Tipo String
        String nome = "Gabriel";
        System.out.println("Nome: " + nome);

        // Tipo booleano
        boolean estudante = true;
        System.out.println("Estudante: " + estudante);

		// Declaração de uma variável final
		// Tentar alterar o valor resultará em um erro de compilação
		// ANO_ATUAL = 2025; // Isso causará um erro
		final int ANO_ATUAL = 2024;
		System.out.println("Ano Atual: " + ANO_ATUAL);
		
    }
}
