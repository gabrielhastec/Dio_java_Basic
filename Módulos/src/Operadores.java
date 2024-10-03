public class Operadores {

    public class OperadoresAritmeticos {

        public static void main(String[] args) {

            int a = 10;
            int b = 3;
    
            System.out.println("Adição: " + (a + b));       // 13   - Operador de Soma
            System.out.println("Subtração: " + (a - b));    // 7    - Operador de subtração
            System.out.println("Multiplicação: " + (a * b)); // 30  - Operador de multiplicação 
            System.out.println("Divisão: " + (a / b));       // 3   - Operador de divisão
            System.out.println("Módulo: " + (a % b));         // 1  - Operador de Módulo (resto da divisão)
        }
    }
    
    public class OperadoresAtribuicao {

        public static void main(String[] args) {

            int x = 5;

            x += 3; // x = x + 3    - Atribuir +3
            System.out.println("Atribuição com adição: " + x); // 8

            x -= 2; // x = x - 2    - Atribuir subtraindo -2
            System.out.println("Atribuição com subtração: " + x); // 6

            x *= 2; // x = x * 2    - Atribuir multiplicando *2
            System.out.println("Atribuição com multiplicação: " + x); // 12

            x /= 3; // x = x / 3    - Atribuir dividindo /3
            System.out.println("Atribuição com divisão: " + x); // 4

            x %= 3; // x = x % 3    - Atribuir com módulo %3
            System.out.println("Atribuição com módulo: " + x); // 1
        }
    }

    public class OperadoresComparacao {

        public static void main(String[] args) {

            int a = 10;
            int b = 20;
    
            System.out.println("Igual a: " + (a == b));         // false    - Igualdade
            System.out.println("Diferente de: " + (a != b));    // true     - Diferente
            System.out.println("Maior que: " + (a > b));        // false    - Maior que
            System.out.println("Menor que: " + (a < b));        // true     - Menor que
            System.out.println("Maior ou igual a: " + (a >= b)); // false   - Maior ou Igual
            System.out.println("Menor ou igual a: " + (a <= b)); // true    - Menor ou Igual
        }
    }

    public class OperadoresLogicos {

        public static void main(String[] args) {

            boolean x = true;
            boolean y = false;
    
            System.out.println("E lógico: " + (x && y)); // false   - Retorna verdadeiro se ambas as expressões forem verdadeiras.
            System.out.println("Ou lógico: " + (x || y)); // true   - Retorna verdadeiro se pelo menos uma das expressões for verdadeira.
            System.out.println("Não lógico: " + (!x)); // false     - Inverte o valor lógico da expressão.
        }
    }

    public class OperadorTernario {

        public static void main(String[] args) {

            int a = 10;
            int b = 20;
    
            // Usando operador ternário     - Um atalho para a instrução if.
            String resultado = (a > b) ? "A é maior que B" : "A é menor ou igual a B";
            System.out.println(resultado); // A é menor ou igual a B
        }
    }

}
