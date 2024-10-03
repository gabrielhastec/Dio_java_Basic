
public class Main {

	public static void main(String[] args) {
		System.out.println ("Sejam bem-vindos ao meu Projeto");

		String primeiroNome = "Gabriel";
		String segundoNome = "Carmo";
		int diaNasc = 06; 
		int mesNasc = 03;
		int anoNasc = 1998;

		String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
		String dataNasc = dataNasc (diaNasc, mesNasc, anoNasc);
		System.out.println("Meu nome é " + nomeCompleto);
		System.out.println("Eu nasci no dia: " + dataNasc);
		
	}
	public static String nomeCompleto (String firstName, String secondName){
		return firstName.concat(" ").concat(secondName);

	}
	public static String dataNasc (int dia, int mes, int ano) {
		return dia + "/" + mes + "/" + ano;
	}

}
