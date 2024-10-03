public class Metodos {

    public class MetodoSomar {

        // Método para somar dois números
        public static int somar(int a, int b) {
            return a + b; // Retorna a soma de a e b
        }
    
        public static void main(String[] args) {
            int resultado = somar(5, 10); // Chamando o método
            System.out.println("Resultado da soma: " + resultado); // Exibe 15
        }
    }
    
    public class MetodoImprimir {

        // Método para imprimir uma mensagem
        public static void imprimirMensagem() {
            System.out.println("Olá, esta é uma mensagem!");
        }
    
        public static void main(String[] args) {
            imprimirMensagem(); // Chamando o método para imprimir
        }
    }
    
    public class MetodoComParametro {

        // Método para imprimir uma mensagem personalizada
        public static void imprimirSaudacao(String nome) {
            System.out.println("Olá, " + nome + "!");
        }
    
        public static void main(String[] args) {
            imprimirSaudacao("Gabriel"); // Chamando o método com um parâmetro
        }
    }
    
    public class MetodoMultiplicar {

        // Método que retorna o dobro de um número
        public static int dobro(int numero) {
            return numero * 2; // Retorna o dobro do número
        }
    
        public static void main(String[] args) {
            int resultado = dobro(4); // Chamando o método
            System.out.println("Dobro de 4: " + resultado); // Exibe 8
        }
    }
    
    public class MetodoVerificar {

        // Método que verifica se um número é par
        public static boolean isPar(int numero) {
            return numero % 2 == 0; // Retorna verdadeiro se for par
        }
    
        public static void main(String[] args) {
            int numero = 6;
            if (isPar(numero)) {
                System.out.println(numero + " é par."); // Exibe "6 é par."
            } else {
                System.out.println(numero + " é ímpar.");
            }
        }
    }

}
